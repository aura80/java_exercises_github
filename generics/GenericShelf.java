package java_exercises_github.generics;

public class GenericShelf<T> {
    private T product;

    public T getProduct() {
        return product;
    }

    public void setProduct(T product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "GenericShelf{" +
                "product = " + product +
                '}';
    }
}
