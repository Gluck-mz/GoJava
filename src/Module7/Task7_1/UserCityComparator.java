package Module7.Task7_1;

import java.util.Comparator;

public class UserCityComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return o1.getUser().getCity().compareTo(o2.getUser().getCity());
    }
}
