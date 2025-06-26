public class matrixSum {
    public static void main(String[] args) {
        int[][]a = {{2,3},{6,7}};
        int[][]b = {{4,5},{7,8}};
        int m = a.length;
        int n = b[0].length;
        
        for(int i =0;i<m;i++){
            for(int j = 0 ;j<n;j++){
             System.out.print(a[i][j]+ b[i][j] + " ");   

            }
         System.out.println();
            
        }
        
       
       
        
    }
    
}
