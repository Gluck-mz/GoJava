package Module5.Task5_4;

import Module5.Task5_1.Room;
import Module5.Task5_3.API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class GoogleAPI implements API {
    public List<Room> rooms = Arrays.asList(
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
    );

    @Override
    public List<Room> findRooms(int price, int persons, String city, String hotel) {
        List<Room> result = new ArrayList<>();
        Room room = new Room(-1, price, persons, null, hotel, city);
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).equals(room)) {
                result.add(rooms.get(i));
            }
        }
        return result;
    }

    @Override
    public List<Room> getAll() {
        return rooms;
    }

    /*public Room[] rooms = new Room[]{
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
    };*/

    /*@Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] findRooms = new Room[rooms.length];
        Room room = new Room(-1, price, persons, null, hotel, city);
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].equals(room)) {
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
    }*/
}