package Module5.Task5_4;

import Module5.Task5_1.Room;
import Module5.Task5_3.API;
import java.util.Date;

public class TripAdvisorAPI implements API {
    public Room[] rooms = new Room[]{
            new Room(41, 100, 1, new Date(20161111), "Dnipro", "Kyiv"),
            new Room(42, 100, 1, new Date(20161111), "Dnipro", "Kyiv"),
            new Room(43, 100, 1, new Date(20161111), "Dnipro", "Kyiv"),
            new Room(44, 100, 1, new Date(20161111), "Dnipro", "Kyiv"),
            new Room(45, 100, 1, new Date(20161111), "Dnipro", "Kyiv"),
            new Room(46, 150, 2, new Date(20161111), "Dnipro", "Kyiv"),
            new Room(47, 150, 2, new Date(20161111), "Dnipro", "Kyiv"),
            new Room(48, 150, 2, new Date(20161111), "Dnipro", "Kyiv"),
            new Room(49, 150, 2, new Date(20161111), "Dnipro", "Kyiv"),
            new Room(50, 150, 2, new Date(20161111), "Dnipro", "Kyiv"),
            new Room(51, 200, 3, new Date(20161111), "Dnipro", "Kyiv"),
            new Room(52, 200, 3, new Date(20161111), "Dnipro", "Kyiv"),
            new Room(53, 200, 3, new Date(20161111), "Dnipro", "Kyiv"),
            new Room(54, 200, 3, new Date(20161111), "Dnipro", "Kyiv"),
            new Room(55, 200, 3, new Date(20161111), "Dnipro", "Kyiv"),
            new Room(56, 250, 4, new Date(20161111), "Dnipro", "Kyiv"),
            new Room(57, 250, 4, new Date(20161111), "Dnipro", "Kyiv"),
            new Room(58, 250, 4, new Date(20161111), "Dnipro", "Kyiv"),
            new Room(59, 250, 4, new Date(20161111), "Dnipro", "Kyiv"),
            new Room(60, 250, 4, new Date(20161111), "Dnipro", "Kyiv")
    };

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] findRooms = new Room[rooms.length];
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].equals(new Room(-1, price, persons, null, hotel, city))) {
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