package java_exercises_github.functional_programming;

public class SAMMain {
    public static void main(String[] args) {
        SAMClass samClass = new SAMClass();
        samClass.methodOne();
        System.out.println(samClass.defaultMethod());

        samClass.setLanguage("French");
        samClass.setYearsOfPractice(3);
        System.out.println(samClass);
        System.out.println(samClass.getLanguage());
        System.out.println(samClass.getYearsOfPractice());
    }
}
