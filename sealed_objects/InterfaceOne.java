package java_exercises_github.sealed_objects;

public non-sealed interface InterfaceOne extends SealedInterface {
    void printIC();

    default String printII() {
        return "I'm a method defined in a non-sealed interface";
    }
}
