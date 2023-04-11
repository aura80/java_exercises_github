package java_exercises_github.generics;

import java.util.Arrays;
import java.util.List;

public class LimitTypes<T extends Number> {
    private T number1;
    private T number2;
    private T number3;

    public T getNumber1() {
        return number1;
    }

    public void setNumber1(T number1) {
        this.number1 = number1;
    }

    public T getNumber2() {
        return number2;
    }

    public void setNumber2(T number2) {
        this.number2 = number2;
    }

    public T getNumber3() {
        return number3;
    }

    public void setNumber3(T message) {
        this.number3 = message;
    }

    // Upper Bound Limit - to work with lists containing elements of different types
    public static float UpperBoundedWildcards(final List<? extends Number> listOfNumbers) {
        float sum = 0.0f;
        for (Number f : listOfNumbers) {
            sum += f.floatValue();          // using unboxing through .floatValue()
        }

        return sum;
    }

    // Lower Bound Limit - to work with lists containing elements of a class or it's parent class
    public static List<? super Integer> LowerBoundWildcard(final List<? super Integer> listOfIntegers) {
        if (listOfIntegers.isEmpty()) {
            listOfIntegers.add(1);
        } else {
            System.out.println("The list is not empty");
        }

        return listOfIntegers;
    }

    public static void main(String[] args) {
        LimitTypes<Double> no1 = new LimitTypes<>();
        no1.setNumber1(250.58D);
        LimitTypes<Integer> no2 = new LimitTypes<>();
        no2.setNumber2(3);
        LimitTypes<Float> no3 = new LimitTypes<>();
        no3.setNumber3(25.82f);
        System.out.println(no1.getNumber1());
        System.out.println(no2.getNumber2());
        System.out.println(no3.getNumber3());

        // using unboxing through .doubleValue()
        System.out.printf("The sum: %.4e", no1.getNumber1() + no2.getNumber2().doubleValue() + no3.getNumber3().doubleValue());
        System.out.println();

        // ? - the unknown type
        LimitTypes<Number> sum = new LimitTypes<>();
        System.out.println("Upper bound limit: " + UpperBoundedWildcards(Arrays.asList(3, 2.5, 36.25f, 82, 28.18d, 99.8f, 64)));

        System.out.println("Lower bound limit: " + LowerBoundWildcard(List.of(10, 20, 30, 40, 50)));
    }
}
