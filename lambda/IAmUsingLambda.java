package java_exercises_github.lambda;

public class IAmUsingLambda implements SumInterface, PrintInterface{

    private Integer x;
    private Integer y;

    public IAmUsingLambda() {}

    @Override
    public String printMethod() {
        return "I come from a Functional Interface";
    }

    @Override
    public Integer sum(Integer a, Integer b) {
        return x + y;
    }
}
