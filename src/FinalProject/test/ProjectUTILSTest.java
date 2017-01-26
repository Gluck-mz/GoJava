package FinalProject.test;

import FinalProject.main.Hotel;
import FinalProject.main.ProjectUTILS;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ProjectUTILSTest {
    private static List<Hotel> emptyList = new ArrayList<>();

    @Ignore
    @Test
    public void createUsersRequest() throws Exception {

    }

    @Test
    public void createHotels_withNegativeNumber() throws Exception {
        assertEquals(emptyList, ProjectUTILS.createHotels(-1));
    }

    @Test
    public void createDefaultRooms_noHotelsCreated() throws Exception {
        assertEquals(emptyList, ProjectUTILS.createDefaultRooms(emptyList));
    }

    @Ignore
    @Test
    public void readOnlyFillLine() throws Exception {

    }

}