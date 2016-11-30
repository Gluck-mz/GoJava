package Module5.Task5_6;

import Module5.Task5_1.Room;
import Module5.Task5_3.API;
import Module5.Task5_4.BookingComAPI;
import Module5.Task5_4.GoogleAPI;
import Module5.Task5_4.TripAdvisorAPI;

public class Controller {
    private BookingComAPI bookingComAPI = new BookingComAPI();
    private GoogleAPI googleAPI = new GoogleAPI();
    private TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();

    public API[] apis = {bookingComAPI, googleAPI, tripAdvisorAPI};

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        for (int i = 0; i < apis.length; i++) {
            return apis[i].findRooms(price, persons, city, hotel);
        }
        System.out.printf("No rooms with such parameters.");
        return null;
    }

    public Room[] check(API api1, API api2) {
        Room[] result = new Room[api1.getAll().length];
        Room[] rooms1 = api1.getAll();
        Room[] rooms2 = api2.getAll();

        for (int i = 0; i < rooms1.length; i++) {
            for (int j = 0; j < rooms2.length; j++) {
                if (rooms2[j].equals(rooms1[i])) {
                    result[i] = rooms1[i];
                    break;
                } else {
                    result[i] = null;
                }
            }
        }
        return result;
    }
}
