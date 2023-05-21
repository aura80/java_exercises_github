package java_exercises_github.sealed_objects;

public final class ClassOne extends SealedParentClass implements InterfaceTwo {
    public ClassOne() {
        super();
    }

    @Override
    public void printIC() {
        System.out.println();
        super.printIC();
        System.out.println(" and now I'm in classOne, but I visited InterfaceOne too :)");
    }

    @Override
    public String printTwo() {
        return "I was defined in interfaceTwo and I'm implemented in ClassOne";
    }
}
