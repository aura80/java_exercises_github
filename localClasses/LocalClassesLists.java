package java_exercises_github.localClasses;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LocalClassesLists {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apples", "cherries", "bananas", "strawberries", "ananas", "pears");
        List<Double> kg = Arrays.asList(3.5, 2.8, 1.230, 0.57, 1.23, 2.0);

        class Fruits {
            private String fruit;
            private Double kilo;

            public Fruits(String fruit, Double kilo) {
                this.fruit = fruit;
                this.kilo = kilo;
            }

            public String getFruit() {
                return fruit;
            }

            public Double getKilo() {
                return kilo;
            }

            @Override
            public String toString() {
                return "Fruits{" +
                        "fruit='" + fruit + '\'' +
                        ", kilo=" + kilo +
                        '}';
            }
        }

        Fruits fruits1;
        Map<String, Double> map = new TreeMap<>();

        for (int i = 0; i < fruits.size(); i++) {
            fruits1 = new Fruits(fruits.get(i), kg.get(i));
            System.out.println(fruits1);
            map.put(fruits1.getFruit(), fruits1.getKilo());
        }

        System.out.println("********   " + map);

        System.out.println();

        // difference between +/concatenation and append/StringBuilder

        // +/concatenation it is time and memory wasting, but easier to write especially when we don't have loops

        long now = System.currentTimeMillis();

        String fr = "";

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            fr += entry.getKey() + " -> " + String.format("%2.3f", entry.getValue()) + ";   ";
        }

        System.out.println(fr);

        System.out.println("\n------>   Slow elapsed with concatenation of strings: " + (System.currentTimeMillis() - now) + " ms");

        System.out.println();

        // append/StringBuilder is more eficient execution times and memory use, especially used for loops and large number of strings;

        now = System.currentTimeMillis();

        double sum = 0;
        StringBuilder fr1 = new StringBuilder();

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry);
            sum += entry.getValue();
            fr1.append(entry.getKey()).append(" -> ").append(String.format("%2.3f", sum)).append(";   ");
        }

        System.out.println();
        System.out.println(fr);
        System.out.printf("The total amount of the fruits is:   %.2f Kg", sum);
        System.out.println("\n");

        System.out.println("------>   Fast elapsed with append: " + (System.currentTimeMillis() - now) + " ms");
    }
}
