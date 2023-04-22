package java_exercises_github.abstractClasses;

public class HotelReception {
    private String receptionistName;
    private Integer noOfDays;
    private HotelAbstractClass hotelAbstractClass;

    public HotelReception(String receptionistName, Integer noOfDays, HotelAbstractClass hotelAbstractClass) {
        this.receptionistName = receptionistName;
        this.noOfDays = noOfDays;
        this.hotelAbstractClass = hotelAbstractClass;
    }

    @Override
    public String toString() {
        return "HotelReception { " +
                "receptionistName='" + receptionistName + '\'' +
                ", noOfDays=" + noOfDays +
                ", " + hotelAbstractClass +
                " }";
    }
}
