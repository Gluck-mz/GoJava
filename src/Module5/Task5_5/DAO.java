package Module5.Task5_5;

import Module5.Task5_1.Room;

public interface DAO {
    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
}
