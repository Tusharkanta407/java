import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         int a = sc.nextInt();
        System.out.println("enter a -: " + a);
        
         char operator = sc.next().charAt(0);
         System.out.println("enter operator -: " + operator);
         int b = sc.nextInt();
         System.out.println("enter b -: " + b);
        


         switch (operator) {
            case '+': System.out.println(a+b); 
                break;
            case '-': System.out.println(a-b);  
            break;
            case '*': System.out.println(a*b);  
            break;
            case '/': System.out.println(a/b);
            break;
            case '%': System.out.println(a%b);
            break;
         
            default: System.out.println("answer not found");
                break;
         }


    }
    
}
