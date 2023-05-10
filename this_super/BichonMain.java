package java_exercises_github.this_super;

public class BichonMain {
    public static void main(String[] args) {
        Bichon bichon = new Bichon();
        System.out.println(bichon);
        System.out.println(bichon.getName());
        System.out.println(bichon.getAge());

        bichon.setName("Lili");
        bichon.setAge(3);
        System.out.println(bichon);
        System.out.println(bichon.getName());
        System.out.println(bichon.getAge());

        Bichon bichon1 = new Bichon("Boy", 1);
        System.out.println(bichon1);
        System.out.println(bichon1.getName());
        System.out.println(bichon1.getAge());

        Bichon.printInfo();

        bichon.itBarks();

        System.out.println();

        Maltez maltez = new Maltez();
        maltez.itBarks();
        Maltez maltez1 = new Maltez("Rita", 5);
        maltez1.itBarks();

    }
}
