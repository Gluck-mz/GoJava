package Module5.Task5_7;

import Module5.Task5_1.Room;
import Module5.Task5_4.BookingComAPI;
import Module5.Task5_4.GoogleAPI;
import Module5.Task5_4.TripAdvisorAPI;
import Module5.Task5_6.Controller;

import java.util.Date;

public class Main {
    private static Controller controller = new Controller();
    private static BookingComAPI bookingComAPI = new BookingComAPI();
    private static GoogleAPI googleAPI = new GoogleAPI();
    private static TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();

    public static void main(String[] args) {
        Room[] rooms1 = controller.requestRooms(100, 1, "Berlin", "Royal");
        Room[] rooms2 = controller.requestRooms(150, 2, "Berlin", "Royal");
        Room[] rooms3 = controller.requestRooms(200, 3, "Berlin", "Royal");
        Room[] rooms4 = controller.requestRooms(200, 1, "Berlin", "Royal");

        Room[] rooms5 = controller.requestRooms(100, 1, "Ibis", "Warsaw");
        Room[] rooms6 = controller.requestRooms(150, 2, "Ibis", "Warsaw");
        Room[] rooms7 = controller.requestRooms(200, 3, "Ibis", "Warsaw");
        Room[] rooms8 = controller.requestRooms(200, 1, "Ibis", "Warsaw");

        Room[] rooms9 = controller.requestRooms(100, 1, "Dnipro", "Kyiv");
        Room[] rooms10 = controller.requestRooms(150, 2, "Dnipro", "Kyiv");
        Room[] rooms11 = controller.requestRooms(200, 3, "Dnipro", "Kyiv");
        Room[] rooms12 = controller.requestRooms(200, 1, "Dnipro", "Kyiv");

        Room[] rooms0 = controller.check(bookingComAPI, googleAPI);

        printOut(rooms1);
    }

    public static void printOut(Room[] room) {
        for (int i = 0; i < room.length; i++) {
            System.out.println(room[i]);
        }
    }
}
