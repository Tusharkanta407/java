import java.util.ArrayList;
import java.util.List;

public class basic {

    public static void main(String[] args) {
        List<Integer> a  = new ArrayList<>();
        a.add(40);a.add(20);a.add(30);
        List<Integer> b  = new ArrayList<>();
        b.add(23);b.add(23);
        List<Integer> c = new ArrayList<>();
        c.add(23);c.add(45);
        List<Integer> d  = new ArrayList<>();
        d.add(30);d.add(60);
        List<List<Integer>> l  = new ArrayList<>();
        l.add(d);l.add(c);l.add(b);l.add(a);
        for(int i = 0;i<l.size();i++){
            List<Integer> x  = l.get(i);
            for(int  j =0;j<x.size();j++){
                System.out.print(x.get(j)+" ");
            }
            System.out.println();
        }
        
    }
}