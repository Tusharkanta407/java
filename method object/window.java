import java.util.*;


public class window {
    public static int  calculateSum(int num1,int num2){
        
           
            int sum = num1+ num2;
           return sum;
    }
    
    public static void   main(String[] args) {
        Scanner SC =new Scanner(System.in);
        int a =SC.nextInt();
        int b =SC.nextInt();
       int sum = calculateSum(a , b);
       System.out.println("sum is:" + sum);
        
    }
    
}
