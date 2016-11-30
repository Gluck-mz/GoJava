package Module5.Task5_5;

import Module5.Task5_1.Room;
import Module5.Task5_4.BookingComAPI;
import Module5.Task5_4.GoogleAPI;
import Module5.Task5_4.TripAdvisorAPI;

public class DAOImpl implements DAO {


    @Override
    public Room save(Room room) {
        return null;
    }

    @Override
    public boolean delete(Room room) {
        return false;
    }

    @Override
    public Room update(Room room) {
        return null;
    }

    @Override
    public Room findById(long id) {

//        for (int i = 0; i < bookingComAPI.rooms.length; i++) {
//            if (bookingComAPI.rooms[i].getId() == id) {
//                return bookingComAPI.rooms[i];
//            } else {
//                for (int j = 0; j < googleAPI.rooms.length; j++) {
//                    if (googleAPI.rooms[j].getId() == id) {
//                        return googleAPI.rooms[j];
//                    } else {
//                        for (int k = 0; k < tripAdvisorAPI.rooms.length; k++) {
//                            if (tripAdvisorAPI.rooms[k].getId() == id) {
//                                return tripAdvisorAPI.rooms[k];
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        System.out.printf("There is no room with such id: " + id);
        return null;
    }
}
