package java_exercises_github.functional_programming;

import java.util.*;
import java.util.function.Supplier;

public class theSupplier {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("name1");
        set1.add("name2");
        set1.add("name3");
        set1.add("name4");

        Supplier<Set<String>> supplier1 = () -> { return set1; };
        System.out.println("supplier1:  " + supplier1.get());

        LinkedList<String> str = new LinkedList<>();
        str.add("a");
        str.add("b");
        str.add("c");
        str.add("d");
        str.addFirst("x");
        str.addLast("y");

        Supplier<LinkedList<String>> supplier2 = () -> {return str;};
        System.out.println("supplier2:  " + supplier2.get());

        Supplier<Integer> supplier3 = () -> {return str.size();};
        System.out.println("supplier3:  " + supplier3.get());

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("John", 100);
        map1.put("Michael", 200);
        map1.put("Teresa", 50);

        Supplier<Map<String, Integer>> supplier4 = () -> {
            return map1;
        };

        System.out.println("supplier4:  " + supplier4.get());

        Supplier<String> supplier5 = () -> {
            return map1.keySet().toString();
        };

        System.out.println("supplier5:  " + supplier5.get());

        Supplier<String> supplier6 = () -> {
            return map1.values().toString();
        };

        System.out.println("supplier6:  " + supplier6.get());

        Supplier<String> supplier7 = () -> {
            return map1.entrySet().toString();
        };

        System.out.println("supplier7:  " + supplier7.get());

        Supplier<Integer> supplier8 = () -> {
            int sum = 0;
            for (Map.Entry pair : map1.entrySet()) {
                System.out.println(pair.getKey() + " : " + pair.getValue());
                sum += Integer.parseInt(pair.getValue().toString());
            }
            return sum;
        };

        System.out.println("supplier8:  " + supplier8.get());

        Supplier<String> supplier9 = () -> {
            Integer s = 0;
            String strg = "";
            for (Map.Entry val : map1.entrySet()) {
                s += Integer.valueOf(val.getValue().toString());
                strg += val.getKey() + " ";
            }
            return strg + " ->  " + s + " $ ";
        };

        System.out.println("supplier9:  " + supplier9.get());

    }
}
