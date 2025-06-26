public class pairPrint {
    public static void main(String[] args) {
        int []arr = {2,64,53,6,32,463,63};
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.print("(" + arr[i] +"," + arr[j] + ")");

            }
            System.out.println();
        }
       
    }
    
}
