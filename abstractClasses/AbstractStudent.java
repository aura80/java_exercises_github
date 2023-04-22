package java_exercises_github.abstractClasses;

public abstract class AbstractStudent extends AbstractBaseStudent implements AbstractStudentInterface{
    private String name;
    private Boolean present;

    public AbstractStudent(String name, Boolean present) {
        this.name = name;
        this.present = present;
    }

    // not all the methods from the interface must be written in the abstract class, but if written they must have implementation
    // public must be specified and the body of the methods written
    @Override
    public String getName(){                            // from AbstractStudentInterface
        return this.name;
    }

    @Override
    public String isPresent() {                         // from AbstractStudentInterface
        String str = null;
        if (this.present) {
            str = " is at school";
        } else {
            str = " is at home";
        }

        return str;
    }

    @Override
    void printInfos() {                                 // from AbstractBaseStudent
        System.out.println("The name of the student: " + getName() + " - " + isPresent() + " - " + AbstractStudentInterface.showMessage());
    }


}
