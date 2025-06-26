import java.util.ArrayList;
public class basicOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(7);
        arr.add(0,2);
        arr.add(1,3);
        arr.add(2,5);
        arr.add(3,7);
        arr.add(4,8);
        arr.add(5,7);
        arr.add(6,2);
        for (int i =0 ;i<arr.size();i++) {
            System.out.print(arr.get(i)+ " ");
            
        }

        // System.out.println(arr.size());
        arr.remove(5);
     
        for (int i =0 ;i<arr.size();i++) {
            System.out.println(arr.get(i)+ " ");
            
        }

        
    }
}