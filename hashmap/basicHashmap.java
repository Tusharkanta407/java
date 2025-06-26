import java.util.HashMap;
import java.util.Map;
public class basicHashmap {
    public static void main(String[] args) {
        HashMap<Integer,String>hashMap = new HashMap<>();
        hashMap.put(1,"One");
        hashMap.put(2,"Two");
        hashMap.put(3,"Three");
        hashMap.put(4, "four");
        System.out.println(hashMap);
        String result = hashMap.get(2);
        System.out.println(result);
        //contains key function 
        System.out.println(hashMap.containsKey(2));
        //remove function
        hashMap.remove(1);
        System.out.println(hashMap);
        //itriating using for loop 
        for(Map.Entry<Integer,String>r:hashMap.entrySet()){
            System.out.println("HashMap is : " + r.getKey() + ":" + r.getValue());
        }
    }
    
}
