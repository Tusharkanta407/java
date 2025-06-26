public class firstAndLastOccurance {
    public static int lowerbound(int[]arr,target){
        int low = 0;
        int high  = n-1;
        while(low<=high){
            int mid  = (low+high)/2;
            if(mid>=target){
                high = mid-1;
            }

        }
    }
    public static void main(String[] args) {
        int []arr = {2,3,4,5,5,5,5,8,9};
       
        int n = arr.length;
        int target = 5;
        ///// method 1 
        // for(int i=0;i<n;i++){
        //     if(arr[i]==target){
        //         if(first==-1){
        //             first = i;
        //         }
        //         last = i;
                
        //     }
            
            
        // }
        // System.out.println(first);
        // System.out.println(last);

        ///// method 2 

    }
    
}
