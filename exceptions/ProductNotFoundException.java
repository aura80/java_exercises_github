package java_exercises_github.exceptions;

public class ProductNotFoundException extends Exception{
    public ProductNotFoundException(String message) {
        super(message);
        System.out.println("Product not found!");
    }
}
