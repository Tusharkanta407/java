import java.util.Scanner;

public class sumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("sum of all number up to  -: ");
        int a = sc.nextInt();
        int i =1;
        int sum = 0;
        while (i<=a) {
            sum =sum + i;
            i++;
            
        }
        System.out.println("sum of all number up is " +   sum);
    }
}
