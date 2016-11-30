package Module5.Task5_3;

import Module5.Task5_1.Room;

public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
    Room[] getAll();
}
