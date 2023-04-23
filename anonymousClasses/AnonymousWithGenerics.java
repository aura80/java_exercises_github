package java_exercises_github.anonymousClasses;

public class AnonymousWithGenerics {
    private String name;
    private String surname;
    private Integer age;
    private Double height;

    public void setNameSurname(String name, String surname, AnonymousWithGenericsInterface<String, String> checker) {
        if (checker.check(name, surname)) {
            this.name = name;
            this.surname = surname;
        } else System.out.println("Name " + name + " or surname " + surname + " are not valid");
    }

    public void setAgeHeight(Integer age, Double height, AnonymousWithGenericsInterface<Integer, Double> checker) {
        if (checker.check(age, height)) {
            this.age = age;
            this.height = height;
        } else System.out.println("Age " + age + " or height " + height + " are not valid");
    }

    @Override
    public String toString() {
        return "AnonymousWithGenerics{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
