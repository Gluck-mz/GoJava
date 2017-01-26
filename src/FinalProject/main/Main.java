package FinalProject.main;

/**
 * Created by GetFire on 15.01.2017 for ProgectGojavaGroup-7.
 */

import FinalProject.test.TestRunner;
import org.junit.runner.JUnitCore;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //JUnitCore.runClasses(TestRunner.class);


        //создаем данные
        List<Hotel> hotels = ProjectUTILS.createHotels(1);
        ProjectUTILS.createDefaultRooms(hotels);

        for (Hotel hotel : hotels) {
            System.out.println(hotel);
        }

/*
        // создаем контроллер
        Controller controller = new Controller(hotels);

        List<Hotel> sdf = (ArrayList<Hotel>) controller.findHotelByCity("Львов");
        System.out.println(sdf);


        // создаем параметры для поиска комнаты
        Map<String, String> params = ProjectUTILS.createUsersRequest();


        List<Room> testFound = (ArrayList<Room>) controller.findRoom(params);
        testFound.forEach(System.out::println);
*/

    }
}
