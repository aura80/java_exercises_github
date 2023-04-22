package java_exercises_github.abstractClasses;

public class HotelRoomTwo extends HotelAbstractClass{
    private Integer noOfBeds;
    private Boolean viewToSea;
    private String colorOfCourtains;

    public HotelRoomTwo(String name, Integer noOfBeds, Boolean viewToSea, String colorOfCourtains) {
        super(name);
        this.noOfBeds = noOfBeds;
        this.viewToSea = viewToSea;
        this.colorOfCourtains = colorOfCourtains;
    }

    @Override
    public String toString() {
        return "HotelRoomTwo { " +
                "name='" + name +
                "', noOfBeds=" + noOfBeds +
                ", viewToSea='" + viewToSea + '\'' +
                ", colorOfCourtains='" + colorOfCourtains + '\'' +
                " }";
    }
}
