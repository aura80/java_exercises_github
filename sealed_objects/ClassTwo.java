package java_exercises_github.sealed_objects;

public final class ClassTwo extends SealedParentClass implements InterfaceOne {
    @Override
    public void printIC() {
//        System.out.println();
        super.printIC();
        System.out.println(" and now I'm in classTwo");
    }


}
