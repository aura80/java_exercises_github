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

        Bichon.printInfo();

    }
}
