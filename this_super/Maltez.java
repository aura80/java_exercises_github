package java_exercises_github.this_super;

public class Maltez extends Bichon{
    private Double height;
    private Boolean barks;

    public Maltez() {
        super();                // super() method is implicit here
//        this("Nero", 4);
    }

    public Maltez(String name, int age) {
        super(name, age);       // it calls the constructor with parameters from the parent class
    }

    @Override
    public void itBarks(){
        super.itBarks();                        // it calls the method itBarks() from the parent Bichon class
        System.out.println("My name is " + super.getName() + " and I want to eat!");
    }
}
