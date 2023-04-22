package java_exercises_github.abstractClasses;

public class AbstractStudentExtendedClass extends AbstractStudent{
    private Integer age;
    private Boolean present;

    public AbstractStudentExtendedClass(String name, Integer age, Boolean present) {
        super(name, present);
        this.age = age;
        this.present = present;
    }

    @Override
    void printMessage() {                   // from AbstractBaseStudent
        System.out.print("Message - ");
        printInfos();
    }

    @Override
    public Integer getAge() {             // from AbstractStudentInterface
        System.out.print(getName() + isPresent() + " and he is " );
        return this.age;
    }

    public static void main(String[] args) {
        AbstractStudent abstractStudent = new AbstractStudentExtendedClass("Tudor", 23, true);
        abstractStudent.printMessage();
        System.out.println(abstractStudent.getName() + abstractStudent.isPresent());
        System.out.println(abstractStudent.getAge() + " years old");
        abstractStudent.printInfos();

        System.out.println();

        AbstractStudent abstractStudent2 = new AbstractStudentExtendedClass("Mihai", 21, false);
        abstractStudent2.printMessage();
        System.out.println(abstractStudent2.getName() + abstractStudent2.isPresent());
        System.out.println(abstractStudent2.getAge() + " years old");
        abstractStudent2.printInfos();

    }
}
