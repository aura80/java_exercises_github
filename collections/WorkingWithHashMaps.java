package java_exercises_github.collections;

import java.util.*;

public class WorkingWithHashMaps {
    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "John");
        map1.put(3, "Nero");
        map1.put(4, "Michelle");
        map1.put(2, "Vasilica");
        map1.put(6, "Cleopatra");
        map1.put(5, "Marioara");
        map1.put(7, "Beatrice");
        map1.put(9, "Anisoara");
        map1.put(8, "Beatrice");
        map1.put(10, "Daniel");
        mapElements(map1);
        System.out.println();
        System.out.println(map1);
        System.out.println("The map has " + mapSize(map1) + " elements");
        System.out.println();
        System.out.println("Set of keys:      " + mapKeysSet(map1));
        System.out.println("List of keys:     " + mapKeysList(map1));
        System.out.println("Set of values:    " + mapValuesSet(map1));
        System.out.println("List of values:   " + mapValuesList(map1));
        System.out.println();
        System.out.println("A Set of entries:               " + mapEntrySet(map1));
        System.out.println("Sorted descending over keys:    " + mapEntryListDescendingKeys(map1));
        System.out.println("Sorted descending over values:  " + mapEntryListDescendingValues(map1));
        System.out.println("Sorted ascending over values:   " + mapEntryListAscendingValues(map1));

    }

    public static <K, V> void mapElements(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("  " + entry.getKey() + " " + entry.getValue());
        }
    }

    public static <K, V> Integer mapSize(Map<K, V> map) {
        return map.size();
    }

    public static <K, V> Set<Map.Entry<K, V>> mapEntrySet(Map<K, V> map) {
        return map.entrySet();
    }

    public static <K, V> List<Map.Entry<K, V>> mapEntryListDescendingKeys(Map<K, V> map) {
        List<Map.Entry<K, V>> mapList = new ArrayList<>(map.entrySet());

        Collections.sort(mapList, new Comparator<Map.Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return o2.getKey().hashCode() - o1.getKey().hashCode();
            }
        });

        return mapList;
    }

    public static <K, V> List<Map.Entry<K, V>> mapEntryListDescendingValues(Map<K, V> map) {
        List<Map.Entry<K, V>> mapList = new ArrayList<>(map.entrySet());

        Collections.sort(mapList, new Comparator<Map.Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return (int) o2.getValue().toString().charAt(0) - (int) o1.getValue().toString().charAt(0);
            }
        });

        return mapList;
    }

    public static <K, V> List<Map.Entry<K, V>> mapEntryListAscendingValues(Map<K, V> map) {
        List<Map.Entry<K, V>> mapList = new ArrayList<>(map.entrySet());

        Collections.sort(mapList, new Comparator<Map.Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return (int) o1.getValue().toString().charAt(0) - (int) o2.getValue().toString().charAt(0);
            }
        });

        return mapList;
    }

    public static <K, V> List<K> mapKeysList(Map<K, V> map) {
        List<K> listOfKeys = new ArrayList<>();
        for (K key : map.keySet()) {
            listOfKeys.add(key);
        }
        return listOfKeys;
    }

    public static <K, V> Set<K> mapKeysSet(Map<K, V> map) {
        Set<K> setOfKeys = new LinkedHashSet<>();
        for (K key : map.keySet()) {
            setOfKeys.add(key);
        }
        return setOfKeys;
    }

    public static <K, V> List<V> mapValuesList(Map<K, V> map) {
        return new ArrayList<>(map.values());
    }

    public static <K, V> Set<V> mapValuesSet(Map<K, V> map) {
        return new LinkedHashSet<>(map.values());
    }

}
