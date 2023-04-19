package java_exercises_github.collections;

import designPatterns.builder2.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        List<String> nume = new LinkedList<>();
        nume.add(0, "Marian");
        nume.add(0, "Dana");
        nume.add(0, "Popa");
        nume.add(0, "Dorian");
        nume.add(0, "Vincenzo");
        nume.add(0, "Fiore");
        System.out.println(nume);
        nume.clear();
        nume.add( "Marian");
        nume.add( "Dana");
        nume.add( "Popa");
        nume.add( "Dorian");
        nume.add( "Vincenzo");
        nume.add( "Fiore");
        System.out.println(nume);

        List<String> nume2 = new ArrayList<>();
        nume2.add(0, "Marian");
        nume2.add(0, "Dana");
        nume2.add(0, "Vincenzo");
        nume2.add(0, "Fiore");
        System.out.println(nume2);
        nume2.clear();
        nume2.add( "Marian");
        nume2.add( "Dana");
        nume2.add( "Vincenzo");
        nume2.add( "Fiore");
        System.out.println(nume2);

        System.out.println();

        Cars income = new Cars(55, "USD");
        Cars expenses = new Cars(55, "USD");
        Cars otherExpenses = expenses;
        boolean balanced = income.equals(expenses);
        boolean balanced2 = otherExpenses.equals(expenses);

        System.out.println(income == expenses);
        System.out.println(otherExpenses == expenses);
        System.out.println(balanced);
        System.out.println(balanced2);
        System.out.println(income.hashCode());
        System.out.println(expenses.hashCode());
        System.out.println(otherExpenses.hashCode());

        System.out.println();

        String a = "Scoala de vara";
        String b = "Acasa";
        String c = b;
        String d = "Acasa";

        System.out.println(a.equals(b));
        System.out.println(c.equals(b));
        System.out.println(d.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());


        System.out.println();

        int x = 10;
        int y = 10;
        boolean primitiveComparison = x == y;
        System.out.println(primitiveComparison);

        Cars car = new Cars(22, "Sport");
        Cars car1 = new Cars(22, "Sport");
        boolean objectComparision = car == car1; // false, references vary
        boolean objectComparisionUsingEquals = car.equals(car1);

        System.out.println(objectComparision);
        System.out.println(objectComparisionUsingEquals);

    }
}

class Cars {
    int amount;
    String code;

    public Cars(int i, String j) {
    }
}
