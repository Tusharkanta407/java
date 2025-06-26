import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class typesOfHashMap {
    public static void main(String[] args) {
        //normal hashmap
        HashMap<Integer,String>map =new HashMap<>();
        map.put(4,"one");
        map.put(2,"two");
        map.put(3,"three");
        System.out.println(map);
        //Linked hashmap
        LinkedHashMap<Integer,String>map2 = new LinkedHashMap<>();
        map2.put(4,"one");
        map2.put(2, "two");
        map2.put(3,"Three");
        System.out.println(map2);
        //Tree hashmap
        TreeMap<Integer, String> map3 = new TreeMap<>();
        map3.put(4, "one");
        map3.put(2, "two");
        map3.put(3, "three");
        System.out.println(map3);
    }
    
}
