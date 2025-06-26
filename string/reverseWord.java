
import java.util.Scanner;

public class reverseWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
        int n = s.length();
        int i =0, j = 0;
        while(j<n){
            if(s.charAt(j) != ' '){
                j++;
                
            }else{
                reverse(s, i, j-1);
                i = j+1;
                j = i;
                

            }
        }
        
        
        System.out.println("Reversed String: " + s);
    }
    public static void reverse(StringBuilder s ,int i ,int j){
        char temp = s.charAt(i);
        s.setCharAt(i, s.charAt(j));
        s.setCharAt(j, temp);
        i++ ;
        j--;
    }
}
