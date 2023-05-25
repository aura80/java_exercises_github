package java_exercises_github.abstractClasses;

public class ShopAbstractMain extends ShopAbstractClass{

    public ShopAbstractMain(String name, Boolean isOpen) {
        super(name, isOpen);
    }

    @Override
    String getInfoName() {
        return "The name of the shop is: " + super.name;
    }

    String getProgram() {
        return "Conclusion - " + super.getInfoOpen(super.getIsOpen());
    }

    public static void main(String[] args) {
        ShopAbstractClass shop = new ShopAbstractMain("Lidl", true);
        System.out.println(shop);
        System.out.println(shop.getInfoName());
        System.out.println(shop.getInfoOpen(shop.getIsOpen()));

        System.out.println();

        ShopAbstractMain shopMain = new ShopAbstractMain("Penny", false);
        System.out.println(shopMain);
        System.out.println(shopMain.getName());
        System.out.println(shopMain.getInfoName());
        System.out.println(shopMain.getIsOpen());
        System.out.println(shopMain.getInfoOpen(shopMain.isOpen));
        System.out.println(shopMain.getProgram());
    }
}
