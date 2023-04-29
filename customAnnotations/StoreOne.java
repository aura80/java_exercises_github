package java_exercises_github.customAnnotations;

import java.util.Objects;

@UrgentAnnotation
public class StoreOne {

    @RunOnlyAnnotatedFields
    private String productName;
    private double price;

    public StoreOne(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    @RunMultipleTimes(times = 4)
    public String getProductName() {
        return productName;
    }

    @RunItNow
    public Double getPrice() {
        System.out.print("Price:  ");
        return price;
    }

    @RunItNow
    private String message() {
        return "I'm a private method";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StoreOne storeOne = (StoreOne) o;
        return Double.compare(storeOne.getPrice(), getPrice()) == 0 && Objects.equals(getProductName(), storeOne.getProductName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductName(), getPrice());
    }

    @Override
    public String toString() {
        return "StoreOne{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
