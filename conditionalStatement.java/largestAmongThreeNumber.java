import java.util.*;
public class largestAmongThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("the value of a is -: " + a);
        Scanner scc = new Scanner(System.in);
        int b = scc.nextInt();
        System.out.println("the value of b is -: " + b);
        Scanner scl = new Scanner(System.in);
        int c = scl.nextInt();
        System.out.println("the value of c is -: " + c);
        if ((a>=b)&&(a>=c)) {
            System.out.println("a is largest");
            
        }
        else if (b>=c) {
            System.out.println("b is largest number");
            
        }
        else {
            System.out.println("c is largest number");
        }
    }
    
}
