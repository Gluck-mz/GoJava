package Module7.Task7_3;

import Module4.Task4_2.Currency;
import Module7.Task7_1.Order;
import Module7.Task7_1.User;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Order order1 = new Order(1, 50, Currency.EUR, "Keyboard", "Rozetka", new User(1, "Ivan", "Ivanov", "Kyiv", 100));
        Order order2 = new Order(2, 150, Currency.EUR, "Monitor", "Get It All", new User(2, "Sergey", "Sergeev", "Lviv", 300));
        Order order3 = new Order(3, 5, Currency.EUR, "Cup", "Tip Top Shop", new User(3, "Petro", "Petrov", "Warsaw", 20));
        Order order4 = new Order(4, 450, Currency.USD, "Sell Phone", "Rozetka", new User(4, "Sidor", "Sidorov", "Kharkiv", 1000));
        Order order5 = new Order(5, 850, Currency.EUR, "iPhone", "Rozetka", new User(5, "Katya", "Ivanova", "Kyiv", 2100));
        Order order6 = new Order(6, 2500, Currency.USD, "Video Card", "Shop China", new User(6, "Michael", "Petrov", "Odessa", 2100));
        Order order7 = new Order(7, 40, Currency.USD, "Mouse", "Ebay", new User(7, "Inna", "Petrova", "Kyiv", 200));
        Order order8 = new Order(8, 170, Currency.EUR, "Motherboard", "Rozetka", new User(8, "Evgen", "Nomninmom", "New York", 600));
        Order order9 = new Order(9, 450, Currency.USD, "GoPro", "Amazon", new User(9, "Sveta", "Trambon", "Kyiv", 800));
        Order order10 = new Order(9, 450, Currency.USD, "GoPro", "Amazon", new User(9, "Sveta", "Trambon", "Kyiv", 800));

        Set<Order> set = new TreeSet<>();
        set.add(order1);
        set.add(order2);
        set.add(order3);
        set.add(order4);
        set.add(order5);
        set.add(order6);
        set.add(order7);
        set.add(order8);
        set.add(order9);
        set.add(order10);

        //check if set contain Order where User’s lastName is - “Petrov”
        System.out.println(isPetrovPresent(set));

        //delete orders where currency is USD using Iterator
        printOut(removeUsdOrders(set));

    }

    public static boolean isPetrovPresent(Set<Order> set) {
       for (Order o : set) {
           if (o.getUser().getLastName().equalsIgnoreCase("Petrov")) {
               return true;
           }
       }
       return false;
    }

    public static Set<Order> removeUsdOrders(Set<Order> set) {
        Iterator iterator = set.iterator();
        Set<Order> result = new TreeSet<>();
        while (iterator.hasNext()) {
            Order order = (Order) iterator.next();
            if (order.getCurrency() == Currency.EUR) {
                result.add(order);
            }
        }
        return result;
    }

    public static void printOut(Set<Order> set) {
        for (Order o : set) {
            System.out.println(o);
        }
    }
}
