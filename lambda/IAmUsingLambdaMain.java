package java_exercises_github.lambda;

public class IAmUsingLambda {
    public static void main(String[] args) {

        SumInterface sumInterface1 = (a,b) -> a + b;

        System.out.println(sumInterface1);

        SumInterface sumInterface2 = Integer::sum;

        System.out.println(sumInterface2);


    }
}
