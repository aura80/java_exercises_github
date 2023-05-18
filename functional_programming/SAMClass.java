package java_exercises_github.functional_programming;

import lombok.Data;

@Data
public class SAMClass implements SingleAbstractMethodInterface{

    private String language;
    private Integer yearsOfPractice;

    @Override
    public void methodOne() {
        System.out.println("This is an abstract method!");
    }

    @Override
    public String defaultMethod() {
        System.out.print("Now you know that: ");
        return SingleAbstractMethodInterface.super.defaultMethod();
    }
}
