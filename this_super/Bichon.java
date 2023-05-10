package java_exercises_github.this_super;

import lombok.Data;

@Data
public class Bichon {

    private String name;
    private int age;
    private static String race = "bichon";

    public Bichon() {
        this("Chica", 2);   // this is calling the constructor with parameters from the same class, Bichon; should be used as the first line of the default constructor
    }

    public Bichon(String name, int age) {
        this.name = name;                   // this is referring to the object bichon of the Bichon class type, with the field name
        this.age = age;                     // this is referring to the object bichon of the Bichon class type, with the field age
    }

    public void setName(String name) {
        this.name = name;       // this refers to the field name of the object on which the setName() method is called
    }

    public String getName() {
        return this.name;       // this is used here as a good practice only because name from the getName() method is the same as the name field of the class
    }

    public static void printInfo() {
        System.out.println("The " + race + " is vaccinated");    // this keyword is not allowed in static methods and can't refer static fields
    }
}
