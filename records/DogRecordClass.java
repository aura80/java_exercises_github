package java_exercises_github.records;

import java.util.Objects;

public record DogRecordClass(String name, Integer age, Boolean pedigree) {     // canonical constructor

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
