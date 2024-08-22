import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: "); // Optional: prompt the user for input
        int a = sc.nextInt();
        for(int i = 1; i <= a; i++) {
            System.out.println(i);
        }
        // /4
        //sc.close(); // Close the scanner to avoid resource leaks
    }
}

