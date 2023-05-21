package java_exercises_github.sealed_objects;

public sealed class SealedParentClass implements SealedInterface permits ClassOne, ClassTwo{

    public SealedParentClass() {
        System.out.print(" * ");
    }

    @Override
    public void printIC() {
        System.out.print("I'm a method defined in an interface and implemented in a sealed class");
    }
}
