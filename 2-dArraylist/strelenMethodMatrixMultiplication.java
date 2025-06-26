public class strelenMethodMatrixMultiplication {

    
 

    // Function to add two matrices
    public static int[][] add(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    // Function to subtract two matrices
    public static int[][] subtract(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }
        return C;
    }

    // Function to pad a matrix to the next power of 2 size
    public static int[][] padMatrix(int[][] matrix, int newSize) {
        int oldSize = matrix.length;
        int[][] newMatrix = new int[newSize][newSize];
        for (int i = 0; i < oldSize; i++) {
            for (int j = 0; j < oldSize; j++) {
                newMatrix[i][j] = matrix[i][j];
            }
        }
        return newMatrix;
    }

    // Strassen's Matrix Multiplication with padding
    public static int[][] strassen(int[][] A, int[][] B) {
        int n = A.length;

        // Pad matrices to next power of 2 if needed
        int size = 1;
        while (size < n) size *= 2;
        if (size != n) {
            A = padMatrix(A, size);
            B = padMatrix(B, size);
        }

        int[][] C = strassenRecursive(A, B, size);

        // Remove padding
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = C[i][j];
            }
        }
        return result;
    }

    // Recursive Strassen function
    private static int[][] strassenRecursive(int[][] A, int[][] B, int n) {
        if (n == 1) {
            int[][] C = { { A[0][0] * B[0][0] } };
            return C;
        }

        int newSize = n / 2;
        int[][] A11 = new int[newSize][newSize];
        int[][] A12 = new int[newSize][newSize];
        int[][] A21 = new int[newSize][newSize];
        int[][] A22 = new int[newSize][newSize];

        int[][] B11 = new int[newSize][newSize];
        int[][] B12 = new int[newSize][newSize];
        int[][] B21 = new int[newSize][newSize];
        int[][] B22 = new int[newSize][newSize];

        for (int i = 0; i < newSize; i++) {
            for (int j = 0; j < newSize; j++) {
                A11[i][j] = A[i][j];
                A12[i][j] = A[i][j + newSize];
                A21[i][j] = A[i + newSize][j];
                A22[i][j] = A[i + newSize][j + newSize];

                B11[i][j] = B[i][j];
                B12[i][j] = B[i][j + newSize];
                B21[i][j] = B[i + newSize][j];
                B22[i][j] = B[i + newSize][j + newSize];
            }
        }

        int[][] M1 = strassenRecursive(add(A11, A22), add(B11, B22), newSize);
        int[][] M2 = strassenRecursive(add(A21, A22), B11, newSize);
        int[][] M3 = strassenRecursive(A11, subtract(B12, B22), newSize);
        int[][] M4 = strassenRecursive(A22, subtract(B21, B11), newSize);
        int[][] M5 = strassenRecursive(add(A11, A12), B22, newSize);
        int[][] M6 = strassenRecursive(subtract(A21, A11), add(B11, B12), newSize);
        int[][] M7 = strassenRecursive(subtract(A12, A22), add(B21, B22), newSize);

        int[][] C11 = add(subtract(add(M1, M4), M5), M7);
        int[][] C12 = add(M3, M5);
        int[][] C21 = add(M2, M4);
        int[][] C22 = add(subtract(add(M1, M3), M2), M6);

        int[][] C = new int[n][n];
        for (int i = 0; i < newSize; i++) {
            for (int j = 0; j < newSize; j++) {
                C[i][j] = C11[i][j];
                C[i][j + newSize] = C12[i][j];
                C[i + newSize][j] = C21[i][j];
                C[i + newSize][j + newSize] = C22[i][j];
            }
        }
        return C;
    }

    public static void main(String[] args) {
        int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] B = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int[][] result = strassen(A, B);

        System.out.println("Product of matrices A and B:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
