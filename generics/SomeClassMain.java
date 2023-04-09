package java_exercises_github.generics;

public class SomeClassMain {
    public static void main(String[] args) {
        // AClassExtendingBasicGenericClass

        SomeBasicGenericClass<String, Integer> a = new SomeBasicGenericClass<>();
        a.setKeyT("Chocolate");
        a.setValueV(9);
        SomeBasicGenericClass<String, Integer> b = new SomeBasicGenericClass<>();
        b.setKeyT("Juice");
        b.setValueV(10);

        System.out.println(a);
        System.out.println(b);

        System.out.println();

        SomeBasicGenericClass<String, Integer> x = new SomeClassExtendingBasicGenericClass(a, "-");
        System.out.println(x);
        SomeClassExtendingBasicGenericClass xy = new SomeClassExtendingBasicGenericClass(a, "Shelf 2");
        System.out.println(xy);

        SomeClassExtendingBasicGenericClass z = new SomeClassExtendingBasicGenericClass(b, "Shelf 3");
        System.out.println(z);

        System.out.println();

        System.out.print(a.getKeyT());
        System.out.print(" ");
        System.out.print(a.getValueV());
        System.out.print(" - ");
        System.out.println(xy.getShelf());
        System.out.print(b.getKeyT());
        System.out.print(" ");
        System.out.print(b.getValueV());
        System.out.print(" - ");
        System.out.println(z.getShelf());

        System.out.println();

        // AGenericClassExtendingBasicGenericClass

        SomeGenericClassExtendingBasicGenericClass<Double> semiGen = new SomeGenericClassExtendingBasicGenericClass<>(22.3, 5);
        System.out.println(semiGen);
        System.out.println(semiGen.getKey() + " " + semiGen.getValue());
        System.out.println(semiGen.getKeyT() + " " + semiGen.getValueV());
        semiGen.setKeyT(115.5);
        semiGen.setValueV(8);
        System.out.println(semiGen.getKeyT() + " " + semiGen.getValueV());

        SomeBasicGenericClass<Character, Integer> semiG = new SomeGenericClassExtendingBasicGenericClass<>('B', 127);
        System.out.println(semiG);
        System.out.println("*" + semiG.getKeyT() + " " + semiG.getValueV());
        semiG.setKeyT('D');
        semiG.setValueV(285);
        System.out.println(semiG.getKeyT() + " " + semiG.getValueV());

        SomeGenericClassExtendingBasicGenericClass<String> semiGen1 = new SomeGenericClassExtendingBasicGenericClass<>();
        semiGen1.setKey("Hello");
        semiGen1.setValue(250);
        semiGen1.setKeyT("Mamaia");
        semiGen1.setValueV(57);
        System.out.println(semiGen1);
        System.out.println(semiGen1.getKey() + " " + semiGen1.getValue());
        System.out.println(semiGen1.getKeyT() + " " + semiGen1.getValueV());

        SomeGenericClassExtendingBasicGenericClass<String> semiGen2 = new SomeGenericClassExtendingBasicGenericClass<>("potatoes", 3);
        System.out.println(semiGen2);
        System.out.println(semiGen2.getKey() + " " + semiGen2.getValue());
        System.out.println(semiGen2.getKeyT() + " " + semiGen2.getValueV());
        semiGen2.setKeyT("anul");
        semiGen2.setValueV(1993);
        System.out.println(semiGen2);
        System.out.println(semiGen2.getKey() + " " + semiGen2.getValue());
        System.out.println(semiGen2.getKeyT() + " " + semiGen2.getValueV());
    }
}
