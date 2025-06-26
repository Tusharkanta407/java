public class binaryDecimal {
    public static void binToDec(int binNum){
        int myNumber = binNum;
        int pow =0;
        int decNum = 0;
        while (binNum>0) {
           int lastDigit = binNum %10;
           decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
             pow++;
             binNum =binNum/10;
        }
        System.out.println("decimal of " + myNumber  + "=" + decNum);
    }
    public static void decToBin(int n){
        int pow = 0;
        int decNum = 0 ;
        while (n>0) {
            int rem = n%2;
            decNum = decNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n=n/2;
            
        }
        System.out.println(decNum);
    }
    public static void main(String[] args) {
        binToDec(101);
        decToBin(5);

        
    }
    
}
