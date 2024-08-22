import java.util.Scanner;

public class reverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("the number is  -: ");
        int n = sc.nextInt();
        int lastDigit;
        for(int i=0;i<=n;i++){
            lastDigit=n%10;
            System.out.print( lastDigit);
          n=n/10;
        }
      
    }
}
