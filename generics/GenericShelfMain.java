package java_exercises_github.generics;

import java.util.*;

public class GenericShelfMain {
    public static <V> void main(String[] args) {
        List<String> productsList = new ArrayList<>();
        GenericShelf<String> genericShelf = new GenericShelf<>();

        genericShelf.setProduct("Milk");
        System.out.println(genericShelf.getProduct());
        productsList.add(genericShelf.getProduct());
        System.out.println(genericShelf);

        genericShelf.setProduct("Bread");
        System.out.println(genericShelf.getProduct());
        productsList.add(genericShelf.getProduct());
        System.out.println(genericShelf);

        genericShelf.setProduct("Ham");
        System.out.println(genericShelf.getProduct());
        productsList.add(genericShelf.getProduct());
        System.out.println(genericShelf);

        genericShelf.setProduct("Cheese");
        System.out.println(genericShelf.getProduct());
        productsList.add(genericShelf.getProduct());
        System.out.println(genericShelf);
        System.out.println();

        System.out.println(productsList);

        Collections.sort(productsList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.charAt(0) - o1.charAt(0);
            }
        });

        System.out.println("List ordered descending: " + productsList);

        Collections.sort(productsList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(0) - o2.charAt(0);
            }
        });

        System.out.println("List ordered ascending:  " + productsList);

        System.out.println(choose(productsList, "Anason"));
        System.out.println(choose(productsList, "Dairy"));

        List<Map.Entry<String, Double>> pricesList = new ArrayList<>();
        Map<String, Double> pricesMap = new TreeMap<>();
        GenericShelf<Double> genericShelfPrice = new GenericShelf<>();

        genericShelfPrice.setProduct(22.5);
        pricesMap.put(productsList.get(0), genericShelfPrice.getProduct());
        genericShelfPrice.setProduct(18.6);
        pricesMap.put(productsList.get(1), genericShelfPrice.getProduct());
        genericShelfPrice.setProduct(34.78);
        pricesMap.put(productsList.get(2), genericShelfPrice.getProduct());
        genericShelfPrice.setProduct(2.5);
        pricesMap.put(productsList.get(3), genericShelfPrice.getProduct());
        genericShelfPrice.setProduct(98.4);
        pricesMap.put("Chocolate", genericShelfPrice.getProduct());
        genericShelfPrice.setProduct(18.22);
        pricesMap.put("Juice", genericShelfPrice.getProduct());

        System.out.println();
        System.out.println(pricesMap);
        System.out.println();
        System.out.println(choose2(pricesMap, 30.0D));

    }

    public static <T extends Comparable<T>> List<T> choose(List<T> list, T element ) {
        List<T> lista = new ArrayList<>();
        for (T l : list) {
            if (l.compareTo(element) > 0) {
                System.out.println(l);
                lista.add(l);
            }
        }
        return lista;
    }

    public static <V extends Comparable<V>, K> Map<K, V> choose2(Map<K, V> map, V element ) {
        List<V> lista = new ArrayList<>();
        int sum = 0;
        for (V l : map.values()) {
            if (l.compareTo(element) < 0) {
                sum += 1;
                lista.add(l);
            }
        }

        Map<K, V> map2 = new TreeMap<>();

        for (Map.Entry<K, V> m : map.entrySet()) {
            if (m.getValue().compareTo(element) < 0) {
                map2.put(m.getKey(), m.getValue());
            }
        }

        System.out.println(" -->  " + sum + " products cost less than 30 Euros  -->  " + lista);

        return map2;
    }
}
