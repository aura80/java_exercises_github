package java_exercises_github.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class IAmUsingLambda implements SumInterface, PrintInterface, ListOfIntegersInterface, SimpleList {

    private Integer x;
    private Integer y;

    public IAmUsingLambda() {}

    @Override
    public String printMethod() {
        return "I come from a Functional Interface";
    }

    @Override
    public Integer suma(Integer a, Integer b) {
        return x + y;
    }

    @Override
    public void getIntegers(List<Integer> integerList) {
        System.out.println("Printing list of integers:");
        integerList.forEach(System.out::println);
    }

    public List<Integer> getList() {
        List<Integer> lista = new ArrayList<>();
        lista.add(52);
        lista.add(73);
        lista.add(24);
        lista.add(19);
        lista.add(123);
        return lista;
    }

    public List<Integer> getAnotherList() {
        List<Integer> lista = new ArrayList<>();
        lista.add(502);
        lista.add(703);
        lista.add(204);
        lista.add(109);
        lista.add(1023);
        lista.forEach((x) -> {
            System.out.println(x+10);
        });
        return lista;
    }

    public void consumerLambda() {
        List<String> text = Arrays.asList("Rodica", "merge", "la", "magazin");

        Consumer<String> consumer = (n) -> { System.out.println(n); };
        text.forEach(consumer);
    }
}
