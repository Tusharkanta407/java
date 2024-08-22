import java.util.*;

public class elseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a>16){
            System.out.println("Eligible for voter");
        }
        else if (a==18) {
            System.out.println("Eligible for voter but required Adhaar card");
            
        }
        else{
            System.out.println("Chutiyaa ");
        }
    }
    
}
