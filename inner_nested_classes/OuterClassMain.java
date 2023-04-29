package java_exercises_github.inner_nested_classes;

public class OuterClassMain {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass("John", 32);
        OuterClass.InnerClass innerClass = outerClass.new InnerClass(outerClass.getName(), outerClass.getAge(), "Paris", true);

        System.out.println(outerClass);
        System.out.println(innerClass);
        System.out.println(innerClass);

        OuterClass.StaticNestedClass innerClassStatic = new OuterClass.StaticNestedClass("Izabelle", 22);

        System.out.println(innerClassStatic.generalInfo());
    }
}
