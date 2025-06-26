public class reverse {
    public static void main(String[] args) {
        int [] arr = {2,6,78,3,32,46,63};
        int n = arr.length;
        int low  = 0;
        int high = n-1;
        while (low<=high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            high--;
            low++;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
}
