package java_exercises_github.lambda;

import java.util.List;

public class IAmUsingLambda implements SumInterface, PrintInterface, ListOfIntegersInterface{

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
}
