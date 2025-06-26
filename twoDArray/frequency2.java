import java.util.HashMap;
public class frequency2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 2, 4, 6};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) { 
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1); 
        } 
        for (int key : map.keySet()) {
            System.out.println("Element: " + key + " - Frequency: " + map.get(key));
        }
    }
}

