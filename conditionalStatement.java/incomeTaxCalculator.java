import java.util.*;

public class incomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int Tax;
        System.out.println(" Income is: " + income);
        if (income<500000) {
            System.out.println("No Tax");
        }
        else if (income<=1000000&&income>=500000) {
            Tax = (int) (income * 0.2); 
            System.out.println(" 20% Tax is:" + Tax);
        }
        else{
            Tax = (int) (income * 0.3);
            System.out.println("30% Tax is:" + Tax);
        }
    }
    
}
