
import java.util.Scanner;

public class toggleString {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
             int ascii = (int)ch;
             if(ascii <=90 && ascii >=65){
                ascii+=32;
                ch = (char)ascii;
                s.setCharAt(i, ch);
             }
            else if(ascii >=97 && ascii <=122){
                ascii-=32;
                ch = (char)ascii;
                s.setCharAt(i, ch);
            }
        }
        System.out.print(s);

    }
    
}
