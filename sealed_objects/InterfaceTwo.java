package java_exercises_github.sealed_objects;

public sealed interface InterfaceTwo extends SealedInterface permits ClassOne {
    void printIC();

    String printTwo();

}
