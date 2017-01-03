package Module7.Task7_1;

import java.util.Comparator;

public class OrderPriceComparatorDesc implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
