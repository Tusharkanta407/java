public class spiralForm {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12},{13, 14, 15, 16}};
        int m = arr.length;
        int n = arr[0].length;
        int rmin = 0 ;
        int rmax=m-1;
        int cmin=0;
        int cmax=n-1;
        while(rmin<=rmax && cmin<=cmax){
            for(int i =cmin;i<=cmax;i++){
                System.out.print(arr[rmin][i]+" ");
            }
            rmin++;
            for(int i =rmin;i<=rmax;i++){
                System.out.print(arr[i][cmax]+" ");
            }
            cmax--;
            
                for(int i =cmax;i>=cmin;i--){
                    System.out.print(arr[rmax][i]+" ");
                }
                rmax--;
            
            
                for(int i =rmax;i>=rmin;i--){
                    System.out.print(arr[i][cmin]+" ");
                }
                cmin++;

            
        }
    }
}
