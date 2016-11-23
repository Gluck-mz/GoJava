package Module5.Task5_4;

import Module5.Task5_1.Room;
import Module5.Task5_3.API;

import java.util.Date;

public class BookingComAPI implements API {
    public Room[] rooms = new Room[]{
            new Room(1, 100, 1, new Date(20161111), "Royal", "Berlin"),
            new Room(2, 100, 1, new Date(20161111), "Royal", "Berlin"),
            new Room(3, 100, 1, new Date(20161111), "Royal", "Berlin"),
            new Room(4, 100, 1, new Date(20161111), "Royal", "Berlin"),
            new Room(5, 100, 1, new Date(20161111), "Royal", "Berlin"),
            new Room(6, 150, 2, new Date(20161111), "Royal", "Berlin"),
            new Room(7, 150, 2, new Date(20161111), "Royal", "Berlin"),
            new Room(8, 150, 2, new Date(20161111), "Royal", "Berlin"),
            new Room(9, 150, 2, new Date(20161111), "Royal", "Berlin"),
            new Room(10, 150, 2, new Date(20161111), "Royal", "Berlin"),
            new Room(11, 200, 3, new Date(20161111), "Royal", "Berlin"),
            new Room(12, 200, 3, new Date(20161111), "Royal", "Berlin"),
            new Room(13, 200, 3, new Date(20161111), "Royal", "Berlin"),
            new Room(14, 200, 3, new Date(20161111), "Royal", "Berlin"),
            new Room(15, 200, 3, new Date(20161111), "Royal", "Berlin"),
            new Room(16, 250, 4, new Date(20161111), "Royal", "Berlin"),
            new Room(17, 250, 4, new Date(20161111), "Royal", "Berlin"),
            new Room(18, 250, 4, new Date(20161111), "Royal", "Berlin"),
            new Room(19, 250, 4, new Date(20161111), "Royal", "Berlin"),
            new Room(20, 250, 4, new Date(20161111), "Royal", "Berlin")
    };

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] findRooms = new Room[rooms.length];
        for (int i = 0; i < rooms.length; i++) {
            if (price == rooms[i].getPrice() &&
                    persons == rooms[i].getPersons() &&
                    city.equalsIgnoreCase(rooms[i].getCityName()) &&
                    hotel.equalsIgnoreCase(rooms[i].getHotelName())) {
                findRooms[i] = rooms[i];
            } else {
                findRooms[i] = null;
            }
        }
        return findRooms;
    }
}