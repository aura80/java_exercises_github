package java_exercises_github.interfaces;

import java.util.Map;
import java.util.TreeMap;

public class MarketInterfaceClass implements MarketInterface{
    private String productName;
    private Double price;
    private Map<String, Double> productsMap = new TreeMap<>();

    public MarketInterfaceClass(String productName, Double price) {
        this.productName = productName;
        this.price = price;
        this.productsMap.put(productName, price);
    }

    public String getProductNames() {
        System.out.print("The products are: ");
        return getProductsMap().keySet().toString();
    }

    @Override
    public Double getPrice(String key) {
        System.out.print("The " + key + " costs: ");
        return getProductsMap().get(key);
    }

    @Override
    public Map<String, Double> getProductsMap() {
        return productsMap;
    }

    @Override
    public Map<String, Double> addProduct(String productName, Double price) {
        productsMap.put(productName, price);
        return productsMap;
    }

    @Override
    public Map<String, Double> removeProduct(String productName) {
        productsMap.remove(productName);
        return productsMap;
    }

    @Override
    public Boolean isOpen(Boolean open) {
        if (MarketInterface.super.isOpen(open)){
            System.out.print("OPEN ");
        } else {
            System.out.print("CLOSED ");
        }

        return open;
    }

    @Override
    public String toString() {
        return "MarketInterfaceClass{ productsMap= " + productsMap + " }";
    }
}
