public class nextGreate {

    public static void main(String[] args) {
        int [] arr = {2,3,8,983,38,39};
        int n = arr.length;
        int []ans = new int [n];
        ///// method 2 
        ans[n-1]=-1;
        for(int  i =0;i<n-1;i++){
            int max = 0;
            for(int j = i+1;j<n;j++){
                max = Math.max(max, arr[j]);


            }
            ans[i] = max;
        }
        for(int k = 0;k<n;k++){
            System.out.print(ans[k]  + " ");
        }





        ////method 1 
        // ans[n-1] = -1;
        // int nge = arr[n-1];
        // for(int i=n-2;i>=0;i--){
        //     ans[i]= nge;
        //    nge= Math.max(nge,arr[i]);
        // }
        // for(int j = 0;j<n;j++){
        //     System.out.print(ans[j] + " ");
        // }

    }
}