package Module5.Task5_4;

import Module5.Task5_1.Room;
import Module5.Task5_3.API;
import java.util.Date;

public class GoogleAPI implements API {
    public Room[] rooms = new Room[]{
            new Room(21, 100, 1, new Date(20161111), "Ibis", "Warsaw"),
            new Room(22, 100, 1, new Date(20161111), "Ibis", "Warsaw"),
            new Room(23, 100, 1, new Date(20161111), "Ibis", "Warsaw"),
            new Room(24, 100, 1, new Date(20161111), "Ibis", "Warsaw"),
            new Room(25, 100, 1, new Date(20161111), "Ibis", "Warsaw"),
            new Room(26, 150, 2, new Date(20161111), "Ibis", "Warsaw"),
            new Room(27, 150, 2, new Date(20161111), "Ibis", "Warsaw"),
            new Room(28, 150, 2, new Date(20161111), "Ibis", "Warsaw"),
            new Room(29, 150, 2, new Date(20161111), "Ibis", "Warsaw"),
            new Room(30, 150, 2, new Date(20161111), "Ibis", "Warsaw"),
            new Room(31, 200, 3, new Date(20161111), "Ibis", "Warsaw"),
            new Room(32, 200, 3, new Date(20161111), "Ibis", "Warsaw"),
            new Room(33, 200, 3, new Date(20161111), "Ibis", "Warsaw"),
            new Room(34, 200, 3, new Date(20161111), "Ibis", "Warsaw"),
            new Room(35, 200, 3, new Date(20161111), "Ibis", "Warsaw"),
            new Room(36, 250, 4, new Date(20161111), "Ibis", "Warsaw"),
            new Room(37, 250, 4, new Date(20161111), "Ibis", "Warsaw"),
            new Room(38, 250, 4, new Date(20161111), "Ibis", "Warsaw"),
            new Room(39, 250, 4, new Date(20161111), "Ibis", "Warsaw"),
            new Room(40, 250, 4, new Date(20161111), "Ibis", "Warsaw"),
            new Room(41, 250, 4, new Date(20161111), "Royal", "Berlin")
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

    @Override
    public Room[] getAll() {
        return rooms;
    }
}