package java_exercises_github.functional_programming;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class thePredicate {
    public static void main(String[] args) {
        Predicate<String> predicate1 = p -> p.contains("a");
        System.out.println(predicate1.test("canar"));
        System.out.println(predicate1.test("fenel"));

        Predicate<Integer> predicate2 = p -> p >= 50;
        System.out.println(predicate2.test(25));
        System.out.println(predicate2.test(75));

        Predicate<Integer> predicate3 = p -> p.equals(200);
        System.out.println(predicate3.test(200));
        System.out.println(predicate3.test(150));

        Predicate<Integer> predicate4 = predicate3.and(predicate2);
        System.out.println(predicate4.test(25));
        System.out.println(predicate4.test(200));

        Predicate<String> predicate5 = p -> p.startsWith("M");
        System.out.println(predicate5.test("mare"));
        System.out.println(predicate5.test("Max"));

        Predicate<String> predicate6 = p -> p.endsWith("l");
        System.out.println(predicate6.test("Madrigal"));
        System.out.println(predicate6.test("Mercenar"));

        Predicate<String> predicate7 = predicate5.and(predicate6);
        System.out.println(predicate7.test("mol"));
        System.out.println(predicate7.test("Min"));
        System.out.println(predicate7.test("Matricol"));

        BiPredicate<String, String> biPredicate1 = String::equalsIgnoreCase;
        System.out.println(biPredicate1.test("Mamaia", "Mamaia"));
        System.out.println(biPredicate1.test("Mamaia", "Monaco"));

        BiPredicate<String, Integer> biPredicate2 = (a, b) -> a.length() + b > 5;
        System.out.println(biPredicate2.test("Jack London", 11));
        System.out.println(biPredicate2.test("Roma", 1));
        System.out.println(biPredicate2.test("London", 0));

    }
}
