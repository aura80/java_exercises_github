package java_exercises_github.collections.equals_hashcode;

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

        Cars income = new Cars(220, "Hello");
        Cars expenses = new Cars(220, "Hello");
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
        String b = "Summer";
        String c = b;
        String d = "Summer";

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
        boolean comparePrimitives = x == y;
        System.out.println(comparePrimitives);

        Cars car = new Cars(22, "Sport");
        Cars car1 = new Cars(22, "Sport");
        boolean compareObjects = car == car1;
        boolean compareObjectsUsingEquals = car.equals(car1);

        System.out.println(compareObjects);
        System.out.println(compareObjectsUsingEquals);

        System.out.println();

        int result1 = Arrays.compare(new int[]{1, 2, 3}, new int[]{1, 2, 3});
        System.out.println(result1); // 0

        int result2 = Arrays.compare(new int[]{1, 2}, new int[]{1, 2, 3});
        System.out.println(result2); // -1

        int result3 = Arrays.compare(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3});
        System.out.println(result3); // 1

        int result4 = Arrays.compare(new int[]{1, 3}, new int[]{3, 1});
        System.out.println(result4); // -1

        int result5 = Arrays.compare(new int[]{1, 3}, new int[]{3, 2, 1});
        System.out.println(result5); // -1

        int result6 = Arrays.compare(new int[]{1, 3}, new int[]{1, 2, 3});
        System.out.println(result6); // 1
    }
}

class Cars {
    int amount;
    String code;

    public Cars(int i, String j) {
    }
}
