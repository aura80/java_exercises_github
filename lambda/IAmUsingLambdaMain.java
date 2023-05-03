package java_exercises_github.lambda;

public class IAmUsingLambdaMain {
    public static void main(String[] args) {

        SumInterface sumInterface1 = (a,b) -> a + b;
        System.out.println(sumInterface1.sum(3, 5));

        SumInterface sumInterface2 = Integer::sum;
        System.out.println(sumInterface2);

        System.out.println();

        IAmUsingLambda obj = new IAmUsingLambda();

        System.out.println(obj.printMethod());

        PrintInterface printInterface1 = () -> obj.printMethod();
        System.out.println(printInterface1.printMethod());

        PrintInterface printInterface2 = obj;
        System.out.println(printInterface2.printMethod());

        System.out.println(((PrintInterface) obj).printMethod());
    }
}
