package java_exercises_github.abstractClasses;

public interface AbstractStudentInterface {
    // public static final by default
    String MESSAGE = "GOOD BOY";

    // public abstract by default
    String getName();                               // taken in AbstractStudents
    Integer getAge();                             // taken in AbstractExtendedClass
    abstract String isPresent();    // taken in AbstractStudents

    // public by default
    static String showMessage() {
        return MESSAGE;
    }

}
