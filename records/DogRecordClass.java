package java_exercises_github.records;

import java.util.Comparator;
import java.util.Objects;

public record DogRecordClass(String name, Integer age, Boolean pedigree) implements Comparator<DogRecordClass> {     // canonical constructor

    // additional constructor - it calls the canonical constructor with this keyword
    public DogRecordClass(String name, Integer age){            // additional constructor
        this(name, age, true);
    }

    public DogRecordClass(String name){                         // additional constructor
        this(name, 23, false);
    }

    // getters
    @Override
    public String name() {
        return name;
    }

    @Override
    public Integer age() {
        return age;
    }

    @Override
    public Boolean pedigree() {
        return pedigree;
    }

    // compare method from the Comparator interface
    @Override
    public int compare(DogRecordClass o1, DogRecordClass o2) {
        int i = 0;

        if (o1.age() - o2.age() < 0) {
            System.out.println(o2.name() + " is bigger than " + o1.name());
            i = -1;
        } else if (o1.age() - o2.age() > 0) {
            System.out.println(o1.name() + " is bigger than " + o2.name());
            i = 1;
        } else {
            System.out.println(o1.name() + " has the same age as " + o1.name());
            i = i;
        }

        return i;
    }

    // equals / hashcode / toString
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DogRecordClass that = (DogRecordClass) o;
        return Objects.equals(name, that.name) && Objects.equals(age, that.age) && Objects.equals(pedigree, that.pedigree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, pedigree);
    }

    @Override
    public String toString() {
        return "DogRecordClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pedigree=" + pedigree +
                '}';
    }
}
