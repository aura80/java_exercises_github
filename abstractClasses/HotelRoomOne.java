package java_exercises_github.abstractClasses;

public class HotelRoomOne extends HotelAbstractClass{

    private Integer noOfBeds;

    public HotelRoomOne(String name, Integer noOfBeds) {
        super(name);
        this.noOfBeds = noOfBeds;
    }

    @Override
    public String toString() {
        return "HotelRoomOne { " + super.toString() +
                ", noOfBeds='" + noOfBeds + '\'' +
                " }";
    }
}
