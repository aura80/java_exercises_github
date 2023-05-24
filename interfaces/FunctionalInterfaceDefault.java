package java_exercises_github.interfaces;

@FunctionalInterface
public interface FunctionalInterfaceDefault {
    String printName();

    default String printDefault() {
        return " ** I'm a default method from a functional interface";
    }
}
