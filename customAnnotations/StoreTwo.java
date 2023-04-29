package java_exercises_github.customAnnotations;

import java.util.Objects;

public class StoreTwo {

    @RunOnlyAnnotatedFields
    private String productName;
    private double price;

    public StoreTwo(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    @RunMultipleTimes(times = 3)
    public String getProductName() {
        return productName;
    }

    @RunItNow
    public double getPrice() {
        System.out.print("Price:  ");
        return price;
    }

    private String message() {
        return "I'm a private method";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StoreTwo storeTwo = (StoreTwo) o;
        return Double.compare(storeTwo.getPrice(), getPrice()) == 0 && Objects.equals(getProductName(), storeTwo.getProductName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductName(), getPrice());
    }

    @Override
    public String toString() {
        return "StoreTwo{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
