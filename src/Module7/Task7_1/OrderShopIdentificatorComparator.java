package Module7.Task7_1;

import java.util.Comparator;

public class OrderShopIdentificatorComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return o1.getShopIndicator().compareTo(o2.getShopIndicator());
    }
}
