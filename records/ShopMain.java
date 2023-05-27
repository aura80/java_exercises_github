package java_exercises_github.records;

public class ShopMain {
    public static void main(String[] args) {
        ShopSpeciality shopSpeciality1 = new ShopRecord("Pizza Summer", 5, ShopSpeciality.PIZZA_FRESCA).shopSpeciality();

        System.out.print(shopSpeciality1);
        System.out.println(" - " + shopSpeciality1.getPrice() + " RON");

        System.out.println();

        ShopRecord shopRecord1 = new ShopRecord("Pizza Mario", 3,ShopSpeciality.ORANGE_JUICE);

        System.out.println(shopRecord1);
        System.out.println(shopRecord1.name());
        System.out.println(shopRecord1.employeesNo());
        System.out.println(shopRecord1.shopSpeciality());
        System.out.println(shopRecord1.shopSpeciality().getPrice() + " lei");

        System.out.println();

        ShopRecord shopRecord2 = new ShopRecord("Pizza Tonno", ShopSpeciality.PIZZA_FORMAGGI);

        System.out.println(shopRecord2);
        System.out.println(shopRecord2.name());
        System.out.println(shopRecord2.employeesNo());
        System.out.println(shopRecord2.shopSpeciality());
        System.out.println(shopRecord2.shopSpeciality().getPrice() + " lei");

        System.out.println();

        ShopRecord shopRecord3 = new ShopRecord("Pizza Tonno", ShopSpeciality.PIZZA_ANANAS);

        System.out.println(shopRecord3);
        System.out.println(shopRecord3.name());
        System.out.println(shopRecord3.employeesNo());
        System.out.println(shopRecord3.shopSpeciality());
        System.out.println(shopRecord3.shopSpeciality().getPrice() + " lei");

        System.out.println();

        ShopRecord shopRecord4 = new ShopRecord("Pizza Tonno", ShopSpeciality.LEMON_JUICE);

        System.out.println(shopRecord4);
        System.out.println(shopRecord4.name());
        System.out.println(shopRecord4.employeesNo());
        System.out.println(shopRecord4.shopSpeciality());
        System.out.println(shopRecord4.shopSpeciality().getPrice() + " lei");
        
    }
}
