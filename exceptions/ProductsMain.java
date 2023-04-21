package java_exercises_github.exceptions;

public class ProductsMain {
    public static void main(String[] args) throws ProductNotFoundException {
        ProductsActions pa = new ProductsActions();

        System.out.println(pa.getProducts() + "  -  " + pa.getProducts().size() + " elements");
        System.out.println();
        if (pa.getProducts().isEmpty()) {
            // this way we handle the exception as a string message, not as an error message
            try {
                throw new ProductNotFoundException("We have to add products to the list because it's empty!");
            } catch (ProductNotFoundException e) {
                System.out.println(e);
            }
        }

        System.out.println();

        Products produs = new Products(1, "honey", 45.0);
        pa.addProducts(produs);
        System.out.println(pa + "  -  " + pa.getProducts().size() + " elements");
        System.out.println(pa.getProducts() + "  -  " + pa.getProducts().size() + " elements");
        Products produs1 = new Products(2, "milk", 6.73);
        Products produs2 = new Products(4, "ginger", 2.89);
        Products produs3 = new Products(3, "onion", 1.75);
        pa.addProducts(produs1);
        pa.addProducts(produs2);
        pa.addProducts(produs3);
        System.out.println(pa + "  -  " + pa.getProducts().size() + " elements");
        System.out.println(pa.getProducts() + "  -  " + pa.getProducts().size() + " elements");

        System.out.println();

        pa.getProductsById(produs);
        pa.getProductsById(produs1);
        pa.getProductsById(produs2);
        pa.getProductsById(produs3);
        pa.removeProducts(produs3);
        System.out.println("*");
        pa.getProductsById(produs3);
        System.out.println("*");
        System.out.println(pa.getProducts() + "  -  " + pa.getProducts().size() + " elements");
        pa.getProductsById(produs);
        pa.getProductsById(produs1);
        pa.getProductsById(produs2);
        System.out.println("*");
        pa.getProductsById(produs3);
        System.out.println("*");
        pa.getProductsByName(produs);
        pa.getProductsByName(produs1);
        pa.getProductsByName(produs2);
        System.out.println("*");
        pa.getProductsByName(produs3);
        System.out.println("*");
        pa.getProductsByPrice(produs);
        pa.getProductsByPrice(produs1);
        pa.getProductsByPrice(produs2);
        System.out.println("*");
        pa.getProductsByPrice(produs3);
        System.out.println("*");
        pa.removeProducts(produs2);
        pa.getProductsById(produs);
        pa.getProductsByName(produs);
        pa.getProductsByPrice(produs);
        pa.getProductsById(produs1);
        pa.getProductsByName(produs1);
        pa.getProductsByPrice(produs1);
        System.out.println("*");
        pa.getProductsById(produs2);
        pa.getProductsByName(produs2);
        pa.getProductsByPrice(produs2);
        System.out.println("*");
        Products produs4 = new Products(5, "bread", 5.49);
        Products produs5 = new Products(7, "chocolate", 4.58);
        Products produs6 = new Products(6, "salt", 4.29);
        pa.addProducts(produs4);
        pa.addProducts(produs5);
        pa.addProducts(produs6);
        System.out.println(pa + "  -  " + pa.getProducts().size() + " elements");

        System.out.println();

        System.out.println(pa.searchById(produs));
        System.out.println(pa.searchById(produs1));
        System.out.println(pa.searchById(produs4));
        System.out.println(pa.searchById(produs5));
        System.out.println(pa.searchById(produs6));

        System.out.println();

        System.out.println(pa.searchByPrice(produs));
        System.out.println(pa.searchByPrice(produs1));
        System.out.println(pa.searchByPrice(produs4));
        System.out.println(pa.searchByPrice(produs5));
        System.out.println(pa.searchByPrice(produs6));

        System.out.println();

        System.out.println(pa.searchByName(produs));
        System.out.println(pa.searchByName(produs1));
        System.out.println(pa.searchByName(produs4));
        System.out.println(pa.searchByName(produs5));
        System.out.println(pa.searchByName(produs6));

        System.out.println();

        pa.removeProducts(produs6);
        System.out.println(pa.searchByName(produs6));
        System.out.println(pa.searchByPrice(produs6));
        System.out.println(pa.searchById(produs6));
    }

}
