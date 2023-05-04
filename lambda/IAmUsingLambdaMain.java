package java_exercises_github.lambda;

import java.util.Arrays;
import java.util.List;

public class IAmUsingLambdaMain {
    public static void main(String[] args) {

        SumInterface sumInterface1 = (a,b) -> a + b;
        System.out.println(sumInterface1.suma(3, 5));

        SumInterface sumInterface2 = Integer::sum;
        System.out.println(sumInterface2.suma(5, 10));

        System.out.println();

        ListOfIntegersInterface objListInt = new IAmUsingLambda();
        List<Integer> l = Arrays.asList(35, 5,10,28,3,40,52,83,21);
        objListInt.getIntegers(l);

        System.out.println();

        IAmUsingLambda obj = new IAmUsingLambda();

        System.out.println(obj.printMethod());

        PrintInterface printInterface1 = () -> obj.printMethod();
        System.out.println(printInterface1.printMethod());

        PrintInterface printInterface2 = obj;
        System.out.println(printInterface2.printMethod());

        System.out.println(((PrintInterface) obj).printMethod());

        System.out.println();

        SimpleListInterface simpleList = () -> {
            System.out.println("Elements of the list are:");
            obj.getList().forEach(System.out::println);

            return obj.getList();
        };

        System.out.println("*****" + simpleList.getList());

        System.out.println();

        System.out.println("*****" + obj.getAnotherList());

        System.out.println();

        obj.consumerLambda();



    }
}
