import javax.swing.plaf.synth.SynthEditorPaneUI;

public class test {
    public static void main(String[] args) {
        int x =90;
        int y = 20;
        //System.out.println("Addition of " + (x +y) + " and " + y + " = " + x);
        System.out.println("before swapping x = " + x);
        System.out.println("before swapping y = " + y);

    int temp = x;
     x = y ;
     y = temp;
    System.out.println("After swaping the value are x = " + x + " and y = " + y);
    }
    
}
