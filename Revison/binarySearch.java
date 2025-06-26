public class binarySearch {
    public static void main(String[] args) {
        int [] arr = {3};
        int n = arr.length;
        int target = 2;
        int low = 0;
        int high = n-1;
        //edge case
         if(n==0){
            System.out.println("0"); ;
         }
        if (n==1) {
            System.out.println(arr[0]);
            
        } 
        while(low<=high){
            int mid = (low + high)/2;
            if(target == arr[mid]){
                System.out.println("the index is " + mid);
                return;
            }else if(target>mid){
                high = mid + 1;

            }else{
                low = mid - 1;  
            }
        }
    
    }
}
