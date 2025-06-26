public class matrixMultiplication {
    public static void main(String[] args) {
        int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] b = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] c = new int [a.length][b[0].length];
        for(int i = 0;i<c.length;i++){
            for(int j =0 ;j<c.length;j++){
                for(int k =0;k<b.length;k++){
                    c[i][j] += (a[i][k] * b[k][j]);
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
}
