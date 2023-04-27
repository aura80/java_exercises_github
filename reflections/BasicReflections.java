package java_exercises_github.reflections;

public class BasicReflections {
    private String name;
    private String ocupation;
    private Integer age;

    public BasicReflections() {

    }

    public BasicReflections(String name, String ocupation, Integer age) {
        this.name = name;
        this.ocupation = ocupation;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getOcupation() {
        return ocupation;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void publicMethod() {
        System.out.println("    I'm a public method and we don't need Reflections, but we can use invoke and also a normal call");
    }

    private void privateMethod() {
        System.out.println("    I'm a private method and I need Reflections, .setAccessible(true) and .invoke(object)");
    }

    public static void publicStaticMethod() {
        System.out.println("    I'm a public static method invoked with null");
    }

    private static void privateStaticMethod() {
        System.out.println("    I'm a private static method invoked with null");
    }

    @Override
    public String toString() {
        return "BasicReflections{" +
                "name='" + name + '\'' +
                ", ocupation='" + ocupation + '\'' +
                ", age=" + age +
                '}';
    }
}
