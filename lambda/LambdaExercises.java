package java_exercises_github.lambda;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

@FunctionalInterface
interface PiInterface {
    double getPi();
}

@FunctionalInterface
interface Message {
    String getMessage();
}

// not necessary to add the annotation @FunctionalInterface
interface OneParameter {
    int getIntNo(int no);
}

interface TwoParameters {
    double getProduct(double x, double y);
}

public class LambdaExercises {

    private Integer index;
    private String product;
    private Double price;

    public LambdaExercises(Integer index, String product, Double price) {
        super();
        this.index = index;
        this.product = product;
        this.price = price;
    }

    public static void main(String[] args) {
        getCircleLength();
        getTheMessage();
        getNoSquare();
        getTheProduct();
        printList();
        getProductsList();
        System.out.println("\nBe careful, an Action Listener was generated!");
        clickingButton();
    }

    public static void getProductsList() {
        List<LambdaExercises> productsList = new ArrayList<LambdaExercises>();
        productsList.add(new LambdaExercises(1, "apples", 5.25D));
        productsList.add(new LambdaExercises(3, "lemons", 6.99D));
        productsList.add(new LambdaExercises(4, "cherries", 7.29));
        productsList.add(new LambdaExercises(2, "blueberries", 8.42d));

        Stream<LambdaExercises> s = productsList.stream();

        s.forEach(LambdaExercises -> System.out.println(LambdaExercises.index + ". " + LambdaExercises.product + " costs -> " + LambdaExercises.price + "  Euro"));

        System.out.println();

        Stream<LambdaExercises> fi = productsList.stream().filter(c -> c.price < 7);

        fi.forEach(LambdaExercises -> System.out.println(LambdaExercises.index + ". " + LambdaExercises.product + " costs -> " + LambdaExercises.price + "  Euro"));

    }

    public static void printList() {
        System.out.println();
        List<String> stringList = Arrays.asList("Paris", "London", "New York", "Roma");

        stringList.forEach((x) -> System.out.println(x));
        // with method reference
        stringList.forEach(System.out::println);
    }

    public static void getTheProduct() {
        TwoParameters two = (a, b) -> (a * b);
        System.out.println(two.getProduct(3.2, 5.1));
        System.out.println(String.format("%.3f", two.getProduct(3.5, 10.2)));
    }

    public static void getNoSquare() {
        OneParameter oneParameter = (x) -> (x * x);
        System.out.println(oneParameter.getIntNo(2));
        System.out.println(oneParameter.getIntNo(5));
    }

    public static void getTheMessage() {
        Message mes = () -> {
            System.out.println();
            return "Learn through examples!";
        };
        System.out.println(mes.getMessage());
    }

    public static void getCircleLength() {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter an integer as radius:");
            int r = scanner.nextInt();

            PiInterface pi = () -> 3.141516;

            System.out.println("Length of the circle: " + 2 * pi.getPi() * r);
        } catch (Exception e) {
            System.out.println("No number given!");
        }
    }

    public static void clickingButton() {
        Frame frame = new Frame("Java - Action-Listener");

        Button b = new Button("Click me");
        b.setBounds(90, 80, 60, 40);

        Button exit = new Button("Exit");
        exit.setBounds(180, 80, 60, 40);

        b.addActionListener(e -> System.out.println("Message"));
        frame.add(b);

        exit.addActionListener(e -> frame.dispose());
        frame.add(exit);

        frame.setSize(340, 190);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}
