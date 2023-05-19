package java_exercises_github.functional_programming;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class theConsumer {
    public static void main(String[] args) {
        Consumer<String> consumer1 = System.out::println;
        consumer1.accept("Hello summer!");

        Consumer<Integer> consumer2 = n -> System.out.println(n + 5);
        consumer2.accept(20 + 5);

        Consumer<List<String>> consumer3 = l -> System.out.println(l.size());
        Consumer<List<String>> consumer4 = l -> System.out.println(l.get(2));
        Consumer<List<String>> consumer5 = l -> System.out.println(l.subList(2,5));
        List<String> fruitsList = Arrays.asList("mere", "pere", "cirese", "afine", "capsune");
        consumer3.accept(fruitsList);
        consumer4.accept(fruitsList);
        consumer5.accept(fruitsList);

        Consumer<Map<String, Integer>> consumer6 = System.out::println;
        Consumer<Map<String, Integer>> consumer7 = m -> System.out.println(m.containsValue(8));
        Consumer<Map<String, Integer>> consumer8 = m -> System.out.println(m.entrySet());
        Consumer<Map<String, Integer>> consumer9 = m -> System.out.println(m.keySet());
        Consumer<Map<String, Integer>> consumer10 = m -> System.out.println(m.values());
        Consumer<Map<String, Integer>> consumer11 = m -> {
            for (Map.Entry pair : m.entrySet()) {
                System.out.println(pair.getKey() + " - " + pair.getValue());
            }
        };
        Map<String, Integer> map1 = new TreeMap<>();
        map1.put("George", 3);
        map1.put("Maria", 8);
        map1.put("Johan", 2);

        consumer6.accept(map1);
        consumer7.accept(map1);
        consumer8.accept(map1);
        consumer9.accept(map1);
        consumer10.accept(map1);
        consumer11.accept(map1);

        BiConsumer<Integer, Integer> biConsumer1 = (a, b) -> System.out.println(a * b);
        biConsumer1.accept(25, 4);

        BiConsumer<String, Integer> biConsumer2 = (s, n) -> System.out.println(s + " is " + n + " years old");
        biConsumer2.accept("Adam", 25);

    }
}
