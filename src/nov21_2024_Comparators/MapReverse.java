package nov21_2024_Comparators;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapReverse {
    public static <K, V> Map<V, K> reversedMap (Map<K, V> map) {
        Map<V, K> reversedMap = new LinkedHashMap<>();

        for (Map.Entry<K, V> entry : map.entrySet()) {
            reversedMap.put(entry.getValue(), entry.getKey());
        }
        return reversedMap;
    }

    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "C");
        map.put(2, "B");
        map.put(3, "A");

        Map<String, Integer> reversedMap = reversedMap(map);

        System.out.println(map);
        System.out.println(reversedMap);
    }
}
