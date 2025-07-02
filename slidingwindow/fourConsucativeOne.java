public class fourConsucativeOne {
    public static int checkFourConsecutiveOnes(int[]arr ,int  k){
        int l = 0 ;
        int r = k-1;
        int sum = 0;
        int n = arr.length;
       for(int i=0;i<k;i++){
            sum += arr[i];
        }
        int maxSum = sum;

        while (r<n-1){
            
            sum = sum -arr[l] ;
            l++;
            r++;
            sum += arr[r];
        

            maxSum = Math.max(maxSum, sum);

        }
        return maxSum ;


    }
    public static void main(String[] args) {
        int[] arr = {1,3,-2,7,8,6,-8,6};
        
        int k = 2;
        int result = checkFourConsecutiveOnes(arr, k);
        System.out.println(result);
    }
    

    
}