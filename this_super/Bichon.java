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
        this.name = name;
        this.age = age;
    }

}
