package java_exercises_github.interfaces;

import java.util.Map;

public interface MarketInterface {
    // public static final by default
    String message = "Market: ";

    // public abstract by default
    Double getPrice(String key);
    Map<String, Double> addProduct(String product, Double price);
    abstract Map<String, Double> removeProduct(String product);
    Map<String, Double> getProductsMap();

    // public by default - utility functions
    static String getShopName() {
        return message + " CENTRAL DEPOSIT";
    }

    // default - to modify interface and make it compatible with older versions
    default Boolean isOpen(Boolean open) {
        System.out.print(showMessage() + " - ");
        return open;
    }

    // private method inside the interface
    private String showMessage() {
        return "TO BE SEEN IN THE INTERNAL CIRCUIT";
    }
}
