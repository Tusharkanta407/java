import java.util.Scanner;

public class reverseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lastDigit;
        int reverse=0;
        for(int i=0;i<=n;i++){
            lastDigit=n%10;
            n=n/10;
            reverse=(reverse*10)+ (lastDigit);

        }
        System.out.println(reverse);
    }
}
