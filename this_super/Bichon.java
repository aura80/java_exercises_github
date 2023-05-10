package java_exercises_github.this_super;

import lombok.Data;

@Data
public class Bichon {

    private String name;
    private int age;

    public Bichon() {
        this("Chica", 2);
    }

    public Bichon(String name, int age) {
        this.name = name;                   // this is referring to the name field of the class/of the object of the Bichon class type
        this.age = age;                     // this is referring to the age field of the class/of the object of the Bichon class type
    }

    public String getName() {
        return this.name;       // this is used here as a good practice only because name from the getName() method is the same as the name field of the class
    }
}
