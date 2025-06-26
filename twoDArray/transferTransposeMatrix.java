public class transferTransposeMatrix {
    public static void main(String[] args) {
        int[][]arr = {{1,2,4},{3,4,5},{5,6,9}};
        int m = arr.length;
        int n = arr[0].length;
        for(int i = 0;i<m;i++){
            for(int  j = 0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i = 0;i<m;i++){
            for(int  j = 0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


        
    }
    
}
