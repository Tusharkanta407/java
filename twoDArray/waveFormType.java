public class waveFormType {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length;
        int n = arr[0].length;
        //wave form type 1
        for(int i=0;i<m;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
              
        }
        System.out.println();
        
    }
    // wave form type 2
    // for(int i=0;i<m;i++){
    //     if(i%2==0){
    //         for(int j=n-1;j>=0;j--){
    //             System.out.print(arr[i][j]+" ");
    //         }
    //     }
    //     else{
    //         for(int j=0;j<n;j++){
    //             System.out.print(arr[i][j]+" ");
    //         }
            
    // }
   
    // }
    //wave form 3 
    // for(int j=0;j<n;j++){
    //     if(j%2==0){
    //         for(int i=0;i<m;i++){
    //             System.out.print(arr[i][j]+" ");
    //         }
    //     }
    //         else{
    //             for(int i=m-1;i>=0;i--){
    //                 System.out.print(arr[i][j]+" ");
    //         }
    //     }
    // }
    //wave form 4
    for(int j=0;j<n;j++){
        if(j%2==0){
            for(int i=m-1;i>=0;i--){
                System.out.print(arr[i][j]+" ");
            }
        }else{
                for(int i=0;i<m;i++){
                    System.out.print(arr[i][j]+" ");
            }
    }
}
   
    
}
}
