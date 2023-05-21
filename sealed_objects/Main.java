package java_exercises_github.sealed_objects;

public class Main {
    public static void main(String[] args) {
        SealedParentClass sealedParentClass = new SealedParentClass();
        sealedParentClass.printIC();

        ClassOne classOne = new ClassOne();
        classOne.printIC();

        ClassTwo classTwo = new ClassTwo();
        classTwo.printIC();

        System.out.println();

        InterfaceOne interfaceOne = new ClassTwo();
        System.out.println(interfaceOne.printII());
        interfaceOne.printIC();

        System.out.println();

        InterfaceTwo interfaceTwo = new ClassOne();
        interfaceTwo.printIC();
        System.out.println(interfaceTwo.printTwo());

        ClassOne classOne1 = new ClassOne();
        classOne1.printIC();
        System.out.println(classOne1.printTwo());
    }
}
