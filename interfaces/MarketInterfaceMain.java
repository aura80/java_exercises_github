package java_exercises_github.interfaces;

import java.util.Map;
import java.util.TreeMap;

public class MarketInterfaceMain {
    public static void main(String[] args) {
        System.out.println(MarketInterface.getShopName());
        System.out.println();
        Map<String, Double> mapOfProducts = new TreeMap<>();
        MarketInterface obj = new MarketInterfaceClass("cheese", 5.25);
        System.out.println(obj.isOpen(true));
        System.out.println();
        System.out.println(obj);
        obj.addProduct("chips", 5.46);
        obj.addProduct("water", 3.43);
        obj.addProduct("lemons", 2.48);
        obj.addProduct("tomatoes", 11.96);
        System.out.println(obj + "    -   " + obj.getProductsMap().size() + " products");
        System.out.println(obj.getProductsMap());
        obj.addProduct("juice", 4.89d);
        obj.addProduct("oranges", 7.29D);
        System.out.println(obj + "    -   " + obj.getProductsMap().size() + " products");
        System.out.println(obj.getProductsMap());
        obj.addProduct("soap", 2.3d);
        obj.addProduct("milk", 5.0D);
        System.out.println(obj + "    -   " + obj.getProductsMap().size() + " products");
        System.out.println(((MarketInterfaceClass) obj).getProductNames());
        System.out.println(obj.getPrice("cheese") + " RON");
        System.out.println(obj.getPrice("juice") + " RON");
        System.out.println(obj.getPrice("tomatoes") + " RON");
        System.out.println(obj.getPrice("oranges") + " RON");
        System.out.println(obj.getPrice("banana") + " RON");
        System.out.println(obj.getPrice("water") + " RON");
        System.out.println(obj.getPrice("mere") + " RON");
        obj.removeProduct("chips");
        System.out.println(obj + "    -   " + obj.getProductsMap().size() + " products");
        obj.removeProduct("soap");
        System.out.println(obj + "    -   " + obj.getProductsMap().size() + " products");
        obj.removeProduct("juice");
        obj.removeProduct("apa");
        System.out.println(obj + "    -   " + obj.getProductsMap().size() + " products");
        System.out.println(((MarketInterfaceClass) obj).getProductNames());

        System.out.println("-----------------------------------------------------------");

        MarketInterface obj1 = new MarketInterfaceClass("coffee", 22.89);
        System.out.println(obj1);
        obj1.addProduct("bacon", 25.5D);
        obj1.addProduct("butter", 9.99d);
        obj1.addProduct("jam", 15.28d);
        obj1.addProduct("cakes", 29.36);
        obj1.addProduct("yogurt", 2.43);
        obj1.addProduct("cocoa", 6.27d);
        System.out.println(obj1 + "    -   " + obj1.getProductsMap().size() + " products");
        System.out.println("    " +((MarketInterfaceClass) obj1).getProductNames());
        System.out.println();
        obj1.removeProduct("bacon");
        obj1.removeProduct("jam");
        System.out.println(obj1 + "    -   " + obj1.getProductsMap().size() + " products");
        System.out.println("    " +((MarketInterfaceClass) obj1).getProductNames());
        System.out.println();
        System.out.println(obj1.getPrice("cakes") + " RON");
        System.out.println(obj1.getPrice("butter") + " RON");
        System.out.println(obj1.getPrice("cocoa") + " RON");
        System.out.println();
        System.out.println(obj1.getProductsMap());
        System.out.println();
        System.out.println(obj1.getPrice("coffee") + " RON");
        System.out.println(obj1.getPrice("yogurt") + " RON");
    }
}
