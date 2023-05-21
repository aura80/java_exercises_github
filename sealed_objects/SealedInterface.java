package java_exercises_github.sealed_objects;

public sealed interface SealedInterface permits InterfaceOne, InterfaceTwo, RecordOne, SealedParentClass {
    void printIC();
}
