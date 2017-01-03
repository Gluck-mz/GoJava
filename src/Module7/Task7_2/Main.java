package Module7.Task7_2;

import Module4.Task4_2.Currency;
import Module7.Task7_1.*;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Order> list = new ArrayList<>();
    public static void main(String[] args) {
        Order order1 = new Order(1, 50, Currency.USD, "Keyboard", "Rozetka", new User(1, "Ivan", "Ivanov", "Kyiv", 100));
        Order order2 = new Order(2, 150, Currency.USD, "Monitor", "Get It All", new User(2, "Sergey", "Sergeev", "Lviv", 300));
        Order order3 = new Order(3, 5, Currency.USD, "Cup", "Tip Top Shop", new User(3, "Petro", "Petrov", "Warsaw", 20));
        Order order4 = new Order(4, 450, Currency.USD, "Sell Phone", "Rozetka", new User(4, "Sidor", "Sidorov", "Kharkiv", 1000));
        Order order5 = new Order(5, 850, Currency.USD, "iPhone", "Rozetka", new User(5, "Katya", "Ivanova", "Kyiv", 2100));
        Order order6 = new Order(6, 250, Currency.USD, "Video Card", "Shop China", new User(6, "Ivan", "Petrov", "Odessa", 2100));
        Order order7 = new Order(7, 40, Currency.USD, "Mouse", "Ebay", new User(7, "Inna", "Petrova", "Kyiv", 200));
        Order order8 = new Order(8, 170, Currency.USD, "Motherboard", "Rozetka", new User(8, "Evgen", "Nomninmom", "New York", 600));
        Order order9 = new Order(9, 450, Currency.USD, "GoPro", "Amazon", new User(9, "Sveta", "Trambon", "Kyiv", 800));
        Order order10 = new Order(10, 650, Currency.USD, "Bicycle", "Rozetka", new User(10, "Bruce", "Willis", "Kyiv", 900));

        list.add(order1);
        list.add(order2);
        list.add(order3);
        list.add(order4);
        list.add(order5);
        list.add(order6);
        list.add(order7);
        list.add(order8);
        list.add(order9);
        list.add(order10);

        //sortByOrderPriceDesc();
        //sortByOrderPriceAscAndUserCity();
        sortByOrderItemNameAndShopIdentificatorAndUserCity();
    }

    public static void sortByOrderPriceDesc() {
        list.sort(new OrderPriceComparatorDesc());
        printOutList(list);
    }

    public static void sortByOrderPriceAscAndUserCity() {
        list.sort(new OrderPriceComparatorAsc());
        list.sort(new UserCityComparator());
        printOutList(list);
    }

    public static void sortByOrderItemNameAndShopIdentificatorAndUserCity() {
        list.sort(new OrderItemNameComparator());
        list.sort(new OrderShopIdentificatorComparator());
        list.sort(new UserCityComparator());
        printOutList(list);
    }

    public static void printOutList(List<Order> list) {
        for (Order o : list) {
            System.out.println(o.toString());
        }
    }
}
