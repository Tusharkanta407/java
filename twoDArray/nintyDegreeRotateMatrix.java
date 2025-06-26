public class nintyDegreeRotateMatrix {
   
   public static void print(int[][] matrix){
    int m = matrix.length;
    int n = matrix[0].length;
       
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            System.out.print(matrix[i][j]+" ");
        }
       System.out.println();
   }
}

   public static void main(String[] args) {
    int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
    // print(matrix);
    //transpose
    int a = 0;
    int b = matrix.length;

   
    //rotate
    int arr[][]=new int[matrix.length][matrix.length];
    for(int i=0;i<matrix.length;i++){
     
       for(int j=0;j<matrix.length;j++){

        arr[j][b-1-i] = matrix[i][j]; 
         
       }
      
    }
    print(arr);
    }
    

   }








