package Module5.Task5_3;

import Module5.Task5_1.Room;

import java.util.List;

public interface API {
//    Room[] findRooms(int price, int persons, String city, String hotel);
//    Room[] getAll();

    List<Room> findRooms(int price, int persons, String city, String hotel);
    List<Room> getAll();
}
