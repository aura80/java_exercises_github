package java_exercises_github.anonymousClasses;

public abstract class AbstractClass{
    private String name;
    private static final String CONSTMESS = " Constant variable from the abstract class";
    public static final Integer VAR_ABSTRACT = 1;

    public AbstractClass(String name) {
        this.name = name;
        System.out.println("Abstract class constructor accessed!");
    }

    abstract String abstractMethod();
    abstract Integer abstractINTMethod();
    abstract Integer abstractSumMethod();

    public String getMessage() {
        return CONSTMESS;
    }

    public Integer getINTMessage() {
        return VAR_ABSTRACT;
    }

    public String getName() {
        return name;
    }
}
