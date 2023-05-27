package java_exercises_github.records;

public enum ShopSpeciality {
    PIZZA_FRESCA(35.44),
    PIZZA_FORMAGGI(38.42),
    PIZZA_ANANAS(28.5),
    ORANGE_JUICE(5.0),
    LEMON_JUICE(5.5);

    private final Double price;

    ShopSpeciality(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return this.price;
    }
}
