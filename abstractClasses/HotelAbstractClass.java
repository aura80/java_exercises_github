package java_exercises_github.abstractClasses;

public abstract class HotelAbstractClass {

    public String name;

    public HotelAbstractClass(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HotelAbstractClass { " +
                "name='" + name + '\'' +
                " }";
    }
}
