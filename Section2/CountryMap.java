package Section2;
import java.util.HashMap;

public class CountryMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("India", "New Delhi");
        map.put("Japan", "Tokyo");
        map.put("France", "Paris");

        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}