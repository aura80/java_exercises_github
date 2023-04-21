package java_exercises_github.exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ProductsActions {
    List<Products> products;

    public ProductsActions() {
        this.products = new ArrayList<>();
    }

    public List<Products> getProducts() {
        return products;
    }

    public void addProducts(Products product) {
        products.add(product);
    }

    public void removeProducts(Products product) {
        products.remove(product);
    }

    public void getProductsById(Products product) throws ProductNotFoundException {
        for (int i = 0; i < products.size(); i++) {
            if (product.getId().equals(products.get(i).getId())) {
                System.out.println("The product with id  '" + products.get(i).getId() + "'  named  '" + products.get(i).getName() + "'  has price:  " + products.get(i).getPrice());
                return;
            }
        }

        try {
            throw new ProductNotFoundException("Product " + product + " was not found by Id");
        } catch (ProductNotFoundException e) {
            System.out.println(e);
        }
    }

    public void getProductsByName(Products product) throws ProductNotFoundException {
        for (int i = 0; i < products.size(); i++) {
            if (product.getName().equals(products.get(i).getName())) {
                System.out.println("The product with name  '" + products.get(i).getName() + "'  and id  '" + products.get(i).getId() + "'  has price:  " + products.get(i).getPrice());
                return;
            }
        }

        try {
            throw new ProductNotFoundException("Product " + product + " was not found by name");
        } catch (ProductNotFoundException e) {
            System.out.println(e);
        }
    }

    public void getProductsByPrice(Products product) throws ProductNotFoundException {
        for (int i = 0; i < products.size(); i++) {
            if (product.getName().equals(products.get(i).getName())) {
                System.out.println("The product with price  '" + products.get(i).getPrice() + "' and id  '" + products.get(i).getId() + "'  has name:  " + products.get(i).getName());
                return;
            }
        }

        try {
            throw new ProductNotFoundException("Product " + product + " was not found by price");
        } catch (ProductNotFoundException e) {
            System.out.println(e);
        }
    }

    public String searchById(Products product) {
        Map<String, Double> map = new TreeMap<>();
        String mapEntry = null;

        for (Products p : products) {
            if (product.getId().equals(p.getId())) {
                map.put(p.getName(), p.getPrice());
            }
        }

        if (map.isEmpty()) {
            try {
                throw new ProductNotFoundException("Product " + product + " was not found by id");
            } catch (ProductNotFoundException e) {
                System.out.println(e);
            }
        }

        for (Map.Entry<String, Double> m : map.entrySet()) {
            mapEntry = m.getKey() + " - " + m.getValue();
        }

        return mapEntry;
    }

    public Map.Entry<Integer, Double> searchByName(Products product) throws ProductNotFoundException {
        Map<Integer, Double> map = new TreeMap<>();
        Map.Entry<Integer, Double> mapEntry = null;

        for (Products p : products) {
            if (product.getName().equals(p.getName())) {
                map.put(p.getId(), p.getPrice());
            }
        }

        if (map.isEmpty()) {
            try {
                throw new ProductNotFoundException("Product " + product + " was not found by name");
            } catch (ProductNotFoundException e) {
                System.out.println(e);
            }
        }

        for (Map.Entry<Integer, Double> m : map.entrySet()) {
            mapEntry = m;
        }

        return mapEntry;
    }

    public Map.Entry<String, Integer> searchByPrice(Products product) {
        Map<String, Integer> map = new TreeMap<>();
        Map.Entry<String, Integer> mapEntry = null;

        for (Products p : products) {
            if (product.getName().equals(p.getName())) {
                map.put(p.getName(), p.getId());
            }
        }

        if (map.isEmpty()) {
            try {
                throw new ProductNotFoundException("Product " + product + " was not found by price");
            } catch (ProductNotFoundException e) {
                System.out.println(e);
            }
        }

        for (Map.Entry<String, Integer> m : map.entrySet()) {
            mapEntry = m;
        }

        return mapEntry;
    }

    @Override
    public String toString() {
        return "ProductsActions{" +
                "products=" + products +
                '}';
    }
}
