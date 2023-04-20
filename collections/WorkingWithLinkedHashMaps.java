package java_exercises_github.collections;

import java.util.*;

public class WorkingWithLinkedHashMaps {
    public static void main(String[] args) {
        Map<Integer, String> map4 = new LinkedHashMap<>();
        System.out.println("Map empty: " + map4.isEmpty());
        map4.put(5, "Dorel");
        map4.put(4, "Nica");
        map4.put(2, "Sorinel");
        map4.put(3, "Ionel");
        map4.put(1, "Marcel");
        map4.put(6, "Mihai");
        map4.put(7, "Patrunjel");
        map4.put(8, "Aurel");
        System.out.println(map4);
        System.out.println();
        System.out.println(getValuesList(map4) + "      -      " + getKeysList(map4));
        System.out.println();
        System.out.println("Map empty:              " + map4.isEmpty());
        System.out.println("Contains key 5:         " + map4.containsKey(5));
        System.out.println("Contains value 'Dorel': " + map4.containsValue("Dorel"));
        System.out.println();
        System.out.println("Set of entries:         " + mapEntrySet(map4));
        System.out.println("List of entries:        " + mapEntryList(map4));
        System.out.println();
        System.out.println("Sorted over key:        " + sortedKeyListOfEntries(mapEntryList(map4)));
        System.out.println("Sorted over value:      " + sortedValueListOfEntries(mapEntryList(map4)));
        map4.remove(6);
        map4.remove(4, "Nica");
        map4.remove(2, "Sorinel");
        System.out.println("Sorted over value:      " + sortedValueListOfEntries(mapEntryList(map4)));

        System.out.println();

        Map<String, Double> map5 = new LinkedHashMap<>();
        map5.put("marar", 2.5);
        map5.put("apa", 5.0);
        map5.put("smantana", 250.75);
        map5.put("carne", 830.75);
        map5.put("usturoi", 4.0);
        map5.put("ulei", 55.23);

        System.out.println("Set of entries:         " + mapEntrySet(map5));
        System.out.println("List of entries:        " + mapEntryList(map5));
        System.out.println();
        System.out.println("Sorted over key:        " + sortedStringKeyListOfEntries(mapEntryList(map5)));
        System.out.println("Remove element:         " + removeElement(map5, "carne"));
        System.out.println();
        System.out.println("Add element:            " + addElement(map5, "rosii", 1.25D));
        System.out.println("Add element:            " + addElement(map5, "sare", 0.12d));
        System.out.println("Add element:            " + addElement(map5, "iaurt", 120.5));
        System.out.println();
        makingNewMapAndList(mapEntryList(map5));
    }

    public static <K, V> List<K> getKeysList(Map<K, V> map) {

        return new ArrayList<>(map.keySet());
    }

    public static <K, V> List<V> getValuesList(Map<K, V> map) {

        return new ArrayList<>(map.values());
    }

    public static <K, V> Set<Map.Entry<K, V>> mapEntrySet(Map<K, V> map) {

        return map.entrySet();
    }

    public static <K, V> List<Map.Entry<K, V>> mapEntryList(Map<K, V> map) {

        return new ArrayList<>(map.entrySet());
    }

    public static <K, V> List<Map.Entry<K, V>> sortedKeyListOfEntries(List<Map.Entry<K, V>> list) {
        Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return (int) o1.getKey() - (int) o2.getKey();
            }
        });

        return list;
    }

    public static <K, V> List<Map.Entry<K, V>> sortedStringKeyListOfEntries(List<Map.Entry<K, V>> list) {
        Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return (int) o1.getKey().toString().charAt(0) - (int) o2.getKey().toString().charAt(0);
            }
        });

        return list;
    }

    public static <K, V> List<Map.Entry<K, V>> sortedValueListOfEntries(List<Map.Entry<K, V>> list) {
        Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return (int) o1.getValue().toString().charAt(0) - (int) o2.getValue().toString().charAt(0);
            }
        });

        return list;
    }

    public static <K, V> void makingNewMapAndList(List<Map.Entry<K, V>> list) {
        List<Map.Entry<K, V>> newList = new ArrayList<>();

        Map<K, V> map = new TreeMap<>();

        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i).getKey(), list.get(i).getValue());
        }

        System.out.println("New map:           " + map);

        newList.addAll(map.entrySet());

        System.out.println("New list:          " + newList);
        System.out.println("Keys    :          " + map.keySet());
        System.out.println("Values  :          " + map.values());
    }

    public static <K, V> Map<K, V> removeElement(Map<K, V> map, K key) {
        map.remove(key);

        return map;
    }

    public static <K, V> Map<K, V> addElement(Map<K, V> map, K key, V value) {
        map.put(key, value);

        return map;
    }
}
