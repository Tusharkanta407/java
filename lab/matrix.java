public class matrix {
    public static void main(String[] args) {
        int count = 0;
        int[][] matrix = {
            {2, 1, 3},
            {3, 1, 2},
            {2, 1, 3}
        };
        int[][] matrix2 = {
            {2, 1, 3, 5, 6, 6},
            {3, 1, 2, 7, 8, 3},
            {2, 1, 3, 4, 7, 8},
            {4, 5, 6, 2, 1, 3},
            {2, 5, 2, 3, 1, 2},
            {8, 4, 2, 2, 1, 3}
        };

        int m = matrix.length;
        int n = matrix[0].length;
        int m2 = matrix2.length;
        int n2 = matrix2[0].length;

        for (int i = 0; i <= m2 - m; i++) {
            for (int j = 0; j <= n2 - n; j++) {
                if (submatrix(matrix, matrix2, i, j, m, n)) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

   
    public static boolean submatrix(int[][] matrix, int[][] matrix2, int startRow, int startCol, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != matrix2[startRow + i][startCol + j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
