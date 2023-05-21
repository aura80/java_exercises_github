package java_exercises_github.sealed_objects;

public record RecordOne() implements SealedInterface {

    @Override
    public void printIC() {
        System.out.println("I'm a method defined in an interface and implemented in a record");
    }
}
