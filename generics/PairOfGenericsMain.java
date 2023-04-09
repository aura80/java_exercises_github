package java_exercises_github.generics;

import java.util.*;

public class PairOfGenericsMain {
    public static void main(String[] args) {
        Map<String, Double> map1 = new LinkedHashMap<>();

        // var1
        PairOfGenerics<String, Double> pairOfGenerics1 = new PairOfGenerics<>();

        pairOfGenerics1.setKey("rice");
        pairOfGenerics1.setValue(250.0);
        map1.put(pairOfGenerics1.getKey(), pairOfGenerics1.getValue());
        System.out.println(pairOfGenerics1);

        pairOfGenerics1.setKey("bisquits");
        pairOfGenerics1.setValue(550.5);
        map1.put(pairOfGenerics1.getKey(), pairOfGenerics1.getValue());
        System.out.println(pairOfGenerics1);

        pairOfGenerics1.setKey("milk");
        pairOfGenerics1.setValue(7.5);
        map1.put(pairOfGenerics1.getKey(), pairOfGenerics1.getValue());
        System.out.println(pairOfGenerics1);

        pairOfGenerics1.setKey("flour");
        pairOfGenerics1.setValue(10.3);
        map1.put(pairOfGenerics1.getKey(), pairOfGenerics1.getValue());
        System.out.println(pairOfGenerics1);

        System.out.println(map1);

        System.out.println();

        // var2
        PairOfGenerics<String, Double> pairOfGenerics2 = makePair("salad", 150.47);
        PairOfGenerics<String, Double> pairOfGenerics3 = makePair("potatoes", 528.36);
        PairOfGenerics<String, Double> pairOfGenerics4 = makePair("tomatoes", 75.64);
        PairOfGenerics<String, Double> pairOfGenerics5 = makePair("onion", 87.24);

        map1.put(pairOfGenerics2.getKey(), pairOfGenerics2.getValue());
        map1.put(pairOfGenerics3.getKey(), pairOfGenerics3.getValue());
        map1.put(pairOfGenerics4.getKey(), pairOfGenerics4.getValue());
        map1.put(pairOfGenerics5.getKey(), pairOfGenerics5.getValue());

        System.out.println(pairOfGenerics2);
        System.out.println(pairOfGenerics3);
        System.out.println(pairOfGenerics4);
        System.out.println(pairOfGenerics5);

        System.out.println(map1);

        System.out.println();

        // var3
        final PairOfGenerics<String, Double> pairOfGenerics6 = PairOfGenericsMain.makePair("garlic", 75.84);
        final PairOfGenerics<String, Double> pairOfGenerics7 = PairOfGenericsMain.makePair("pepper", 79.45);

        map1.put(pairOfGenerics6.getKey(), pairOfGenerics6.getValue());
        map1.put(pairOfGenerics7.getKey(), pairOfGenerics7.getValue());

        System.out.println(pairOfGenerics6);
        System.out.println(pairOfGenerics7 );

        System.out.println();
        System.out.println(map1);

        // sorted list of map entries over values
        List<Map.Entry<String, Double>> map1List = makeListOfPairs(map1);
        System.out.print("List sorted over values:      ");
        System.out.println(map1List);

        List<Map.Entry<String, Double>> map2List = makeListOfPairs(map1);

        System.out.print("List sorted alphabetically:   ");
        map2List.sort(new Comparator<Map.Entry<String, Double>>() {
            @Override
            public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
                return  o1.getKey().charAt(0) - o2.getKey().charAt(0);
            }
        });

        System.out.println(map2List);

        System.out.println(countHeavier(map2List, 80.0));
        System.out.println();

        // second map
        Map<Integer, String> map2 = new TreeMap<>();

        PairOfGenerics<Integer, String> genObj1 = new PairOfGenerics<>();
        genObj1.setKey(1);
        genObj1.setValue("seller1");
        map2.put(genObj1.getKey(), genObj1.getValue());

        genObj1.setKey(2);
        genObj1.setValue("seller2");
        map2.put(genObj1.getKey(), genObj1.getValue());

        PairOfGenerics<Integer, String> genObj2 = makePair(3, "seller3");
        PairOfGenerics<Integer, String> genObj3 = makePair(4, "seller4");
        PairOfGenerics<Integer, String> genObj4 = PairOfGenericsMain.makePair(5, "seller5");
        PairOfGenerics<Integer, String> genObj5 = PairOfGenericsMain.makePair(6, "seller6");

        map2.put(genObj2.getKey(), genObj2.getValue());
        map2.put(genObj3.getKey(), genObj3.getValue());
        map2.put(genObj4.getKey(), genObj4.getValue());
        map2.put(genObj5.getKey(), genObj5.getValue());

        System.out.println(map2);

        // descending order sorted list
        System.out.println(makeListOfPairs2(map2));

        List<Integer> listaMap2Keys = new ArrayList<>(map2.keySet());
        List<String> listaMap2Values = new ArrayList<>(map2.values());
        System.out.println(listaMap2Keys);
        System.out.println(listaMap2Values);
        System.out.print(String.valueOf(map2.values()).charAt(8));
        System.out.print("      " + map2.values().toString().charAt(25));
        System.out.println("  " + listaMap2Values.indexOf("seller3"));

        //  for (int i = 0; i < map2.values().size(); i++)
        //  for (int i = 0; i < listaMap2Values.size(); i++)
        System.out.println(countHeavier2(listaMap2Keys, (int) listaMap2Values.get(3).charAt(6)));

    }

    public static <T extends Comparable<T>> String countHeavier2(List<T> lista, T element) {
        int sum = 0;
        for (T e : lista) {
            if (e.compareTo(element) > 0) {
                lista.add(e);
            }
            sum += 1;
        }

        return lista + " - has " + sum + " elements";
    }

    public static <T extends Comparable<T>> String countHeavier(List<Map.Entry<String, Double>> lista, Double element) {
        List<String> heaviestList = new ArrayList<>();
        int sum = 0;
        for (Map.Entry<String, Double> e : lista) {
            if (e.getValue().compareTo(element) > 0) {
                sum += 1;
                heaviestList.add(e.getKey());
            }
        }

        return sum + " products are heavier than " + element + " kg     --->    " + heaviestList;
    }

    public static <K, V> List<Map.Entry<K, V>> makeListOfPairs2(Map<K, V> map) {
        List<Map.Entry<K, V>> lista = new ArrayList<>(map.entrySet());
        lista.sort(new Comparator<Map.Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return  o2.getKey().hashCode() - o1.getKey().hashCode();
            }
        });
        return lista;
    }

    public static <K, V> List<Map.Entry<String, Double>> makeListOfPairs(Map<String, Double> map) {
        List<Map.Entry<String, Double>> lista = new ArrayList<>(map.entrySet());
        lista.sort(new Comparator<Map.Entry<String, Double>>() {
            @Override
            public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
                return (int) (o1.getValue() - o2.getValue());
            }
        });
        return lista;
    }

    public static <K, V> PairOfGenerics<K, V> makePair(K key, V value) {
        PairOfGenerics<K, V> pair = new PairOfGenerics<>();
        pair.setKey(key);
        pair.setValue(value);
        return pair;
    }
}
