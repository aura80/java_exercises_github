package java_exercises_github.generics;

// not a generic class

public class SomeClassExtendingBasicGenericClass extends SomeBasicGenericClass<String, Integer> {
    SomeBasicGenericClass<String, Integer> aBasicGenericClass;
    private String shelf;

    public SomeClassExtendingBasicGenericClass(SomeBasicGenericClass<String, Integer> aBasicGenericClass, String shelf) {
        super();
        this.aBasicGenericClass = aBasicGenericClass;
        this.shelf = shelf;
    }

    public SomeBasicGenericClass<String, Integer> getaBasicGenericClass() {
        return aBasicGenericClass;
    }

    public void setaBasicGenericClass(SomeBasicGenericClass<String, Integer> aBasicGenericClass) {
        this.aBasicGenericClass = aBasicGenericClass;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    @Override
    public String toString() {
        return "AClassExtendingBasicGenericClass{" +
                "aBasicGenericClass=" + aBasicGenericClass +
                ", shelf='" + shelf + '\'' +
                '}';
    }
}
