package java_exercises_github.interfaces;

public class FunctionalInterfaceClass implements FunctionalInterfaceAbstractOnly, FunctionalInterfaceDefault {

    @Override
    public String printMessage() {
        return " * I'm a message of a public abstract method defined inside a functional interface and implemented in a class";
    }

    @Override
    public String printName() {
        return " ** My name is printName() and I'm a method of a public abstract method defined inside a functional interface and implemented in a class";
    }

    @Override
    public String printDefault() {
        System.out.print(" ** I'm overloaded ");
        return FunctionalInterfaceDefault.super.printDefault();
    }

    @Override
    public String toString() {
        return "FunctionalInterfaceClass{}";
    }
}
