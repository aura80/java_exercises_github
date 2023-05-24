package java_exercises_github.interfaces;

public class FunctionalInterfaceMain {
    public static void main(String[] args) {
        FunctionalInterfaceAbstractOnly fa = new FunctionalInterfaceClass();
        System.out.println(fa.printMessage());

        FunctionalInterfaceDefault fad = new FunctionalInterfaceClass();
        System.out.println(fad);
        System.out.println(fad.printName());
        System.out.println(fad.printDefault());

        FunctionalInterfaceClass fac = new FunctionalInterfaceClass();
        System.out.println(fac);
        System.out.println(fac.printMessage());
        System.out.println(fac.printName());
        System.out.println(fac.printDefault());

    }
}
