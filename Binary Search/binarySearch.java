public class binarySearch {
    public static void main(String[] args) {
        int [] arr = {2,7,83,84,86};
        int n = arr.length;
        int target = 84;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                System.out.println("Element is present at index " + mid);
                break;
            }
            else if(arr[mid] > target){
                high =mid -1;
            }else{
                low = mid + 1;
            }
        }
    }
    
}
