package java_exercises_github.functional_programming;

@FunctionalInterface
public interface SingleAbstractMethodInterface {
    void methodOne();

    default String defaultMethod() {
        return "I'm a default method!";
    }
}
