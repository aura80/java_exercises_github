package java_exercises_github.exceptions;

import java.util.ArrayList;
import java.util.List;

public class UncheckedExceptions {

    public static void main(String[] args) {
        try {
            nullPointerException1();
            nullPointerException2();
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("We tried to access the memory with a null value!");
        }

        System.out.println();

        try {
            nullPointerException3();
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("Unboxing a null value!");
        }

        System.out.println();

        try{
            indexOutOfBoundException();
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("Index exceeded!");
        }

        System.out.println();

        try {
            divisionByZeroException();
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Division by zero!");
        }

        System.out.println();

        try {
            System.out.println(formatException1() + formatException2() + formatException3() + formatException4()
                               + formatException5() + formatException6() + formatException7() + formatException8()
                               + formatException9() + formatException10()+ formatException11() + formatException12()
                               + formatException13() + formatException14() + formatException15());
        } catch (NumberFormatException e) {
            System.out.println("exception");
        } finally {
            System.out.println("Number format exception!");
        }
    }

    private static void nullPointerException1() {
        String a = null;
        List<String> list = new ArrayList<>();
        list.add("");
        a.compareTo(list.get(0));
        System.out.println(list);
    }

    private static void nullPointerException2() {
        String a = null;
        System.out.println(a.length());
    }

    private static void nullPointerException3() {
        List<Integer> list = new ArrayList<>();
        list.add(null);
        int s = list.get(0);        // unboxing a null value
        System.out.println(s);
    }

    private static void indexOutOfBoundException() {
        String a = "Hello!";
        List<String> list = new ArrayList<>();
        list.add(a);
        System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2));
    }

    private static void divisionByZeroException() {
        int a = 20;
        int b = 0;

        System.out.println(a / b);
    }

    private static Integer formatException1() {
        return Integer.parseInt("23.6");
    }

    private static Integer formatException2() {
        return Integer.parseInt("message");
    }

    private static Integer formatException3() {
        return Integer.parseInt("");
    }

    private static Integer formatException4() {
        return Integer.parseInt("     23");
    }

    private static Integer formatException5() {
        return Integer.valueOf("23.6");
    }

    private static Integer formatException6() {
        return Integer.valueOf("   23   ");
    }

    private static Integer formatException7() {
        return Integer.valueOf("sapte");
    }

    private static Float formatException8() {
        return Float.parseFloat("32,6");
    }

    private static Integer formatException9() {
        return Integer.parseInt("1326589741236");
    }

    private static Integer formatException10() {
        return Integer.valueOf("3.14e");
    }

    private static Integer formatException11() {
        Integer number = new Integer(" 3.23 ");
        return number;
    }

    private static Double formatException12() {
        return Double.parseDouble("  5   .2  ");
    }

    private static Double formatException13() {
        return Double.parseDouble("hello ");
    }

    private static Double formatException14() {
        // doesn't throw exception
        System.out.println(Double.parseDouble("5.22f"));
        // throws exception
        return Double.parseDouble("5.22z");
    }

    private static Float formatException15() {
        // doesn't throw exception
        System.out.println(Float.parseFloat("5.22d"));
        // throws exception
        return Float.parseFloat("5.22h");
    }
}
