package java_exercises_github.abstractClasses;

public class HotelMain {
    public static void main(String[] args) {

        HotelRoomOne hotelRoomOne = new HotelRoomOne("The Meridian", 2);
        HotelReception hotelReception = new HotelReception("Sorina", 1000, hotelRoomOne);
        System.out.println(hotelReception);
        System.out.println(hotelRoomOne);

        System.out.println();

        HotelRoomTwo hotelRoomTwo = new HotelRoomTwo("The Meridian", 2, true, "blue");
        HotelReception hotelReception1 = new HotelReception("Robert", 1000, hotelRoomTwo);
        System.out.println(hotelReception1);
        System.out.println(hotelRoomTwo);

        System.out.println();

        HotelRoomTwo hotelRoomTwo2 = new HotelRoomTwo("Neptun", 1, true, "green");
        HotelReception hotelReception2 = new HotelReception("Vlad", 835, hotelRoomTwo2);
        System.out.println(hotelReception2);
        System.out.println(hotelRoomTwo2);
    }
}
