package java_exercises_github.collections;

import java.util.*;

public class WorkingWithTreeMaps {
    public static void main(String[] args) {
        Map<String, Integer> map2 = new TreeMap<>();
        System.out.println("Is map empty:                " + map2.isEmpty());
        map2.put("Azorel", 3);
        map2.put("George", 23);
        map2.put("Robert", 36);
        map2.put("Ina", 13);
        map2.put("Aurelia", 25);
        map2.put("Matei", 18);
        map2.put("Norbert", 24);
        map2.put("Bocanel", 5);
        map2.put("Gelu", 35);
        map2.put("Catrinel", 38);
        map2.put("Fanica", 32);
        map2.put("Mercedesa", 21);
        map2.forEach((key, value) -> System.out.print(key + " = " + value + "  *  "));
        System.out.println();
        System.out.println("Map contains key 'George':   " + map2.containsKey("George"));
        System.out.println("Map contains value '5':      " + map2.containsValue(5));
        System.out.println("Map contains key 'Arabella': " + map2.containsKey("Arabella"));
        System.out.println("Map contains value '10':     " + map2.containsValue(10));
        System.out.println("Is map empty:                " + map2.isEmpty());
        System.out.println();
        System.out.println("Map:             " + map2);
        System.out.println();
        System.out.println("List of entries already sorted:       " + listaMap(map2));
        System.out.println("                                      " + getKeys(map2));
        System.out.println("                                      " + getValues(map2));
        System.out.println();
        List<Map.Entry<String, Integer>> l = new ArrayList<>();
        l = listaMap(map2);
        Collections.reverse(l);
        System.out.println("Reversed list of entries:             " + l);
        System.out.println("                                      " + getKeysEntry(l));
        System.out.println("                                      " + getValuesEntry(l));
        System.out.println();
        System.out.println("List sorted ascending over values:    " + sortingAscendingValues(l));
        System.out.println("                                      " + getKeysEntry(l));
        System.out.println("                                      " + getValuesEntry(l));
        System.out.println();
        List<Map.Entry<String, Integer>> m = new ArrayList<>();
        m = sortingAscendingValues(l);
        Collections.reverse(m);
        System.out.println("List sorted descending over values:   " + m);
        System.out.println("                                      " + getKeysEntry(m));
        System.out.println("                                      " + getValuesEntry(m));
        System.out.println("                              size:   " + m.size());
        map2.remove("Mercedesa");
        map2.remove("Norbert");
        map2.remove("Gelu", 35);
        System.out.println("                                      " + getKeys(map2));
        System.out.println("                                      " + getValues(map2));
        System.out.println("                              size:   " + map2.size());

        System.out.println();

        Map<String, Integer> map3 = new TreeMap<>(map2);
        map3.forEach((key, value) -> System.out.printf("%s -> %d  *  ", key, value));
        System.out.println();
        System.out.println("Map's size:   " + map3.size() + "   elements");
    }

    public static <K, V> List<Map.Entry<K, V>> listaMap(Map<K, V> map) {
        return new ArrayList<>(map.entrySet());
    }

    public static <K, V> List<Map.Entry<K, V>> sortingAscendingValues(List<Map.Entry<K, V>> mapEntriesList) {
        Collections.sort(mapEntriesList, new Comparator<Map.Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return o1.getValue().hashCode() - o2.getValue().hashCode();
            }
        });

        return new ArrayList<>(mapEntriesList);
    }

    public static <K, V> List<V> getValues(Map<K, V> map) {
        List<V> values = new ArrayList<>();

        for (K key : map.keySet()) {
            values.add(map.get(key));
        }

        return values;
    }

    public static <K, V> List<V> getValuesEntry(List<Map.Entry<K, V>> list) {
        List<V> values = new ArrayList<>();

        for (Map.Entry<K, V> listElement: list){
            values.add(listElement.getValue());
        }

        return values;
    }

    public static <K, V> List<K> getKeys(Map<K, V> map) {

        return new ArrayList<>(map.keySet());
    }

    public static <K, V> List<K> getKeysEntry(List<Map.Entry<K, V>> list) {
        List<K> values = new ArrayList<>();

        for (Map.Entry<K, V> listElement: list){
            values.add(listElement.getKey());
        }

        return values;
    }
}
