import java.util.*;
public class switchStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
            case 1:
               System.out.println("samosa"); 
                break;
            case 2:
            System.out.println("burger"); 
            break;
            case 3: System.out.println("jus");

        
            default:
            System.out.println("kichi debini");
                break;
        }
    }
}