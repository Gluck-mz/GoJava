package Module8.Task8_4;

import Module8.Task8_3.AbstractDAOImpl;

import java.util.Arrays;
import java.util.List;

public class Main {
    private static AbstractDAOImpl<User> abstractDAO = new AbstractDAOImpl();
    private static UserDAO<User> userDAO = new UserDAO();
    private static User user1 = new User(1, "Bill");
    private static User user2 = new User(2, "Bruce");
    private static User user3 = new User(3, "John");
    private static User user4 = new User(4, "Ryan");
    private static User user5 = new User(5, "Steve");
    private static User user6 = new User(6, "Kate");
    private static List<User> temp = Arrays.asList(user4, user5, user6);

    public static void main(String[] args) {
//        abstractDaoUsed();
        userDaoUsed();
    }

    public static void abstractDaoUsed() {
        abstractDAO.save(user1);
        abstractDAO.save(user2);
        abstractDAO.save(user3);
        System.out.println("**********\nAfter save() method:");
        System.out.println(abstractDAO.getList());
        abstractDAO.delete(user2);
        System.out.println("**********\nAfter delete() method:");
        System.out.println(abstractDAO.getList());
        abstractDAO.saveAll(temp);
        System.out.println("**********\nAfter saveAll() method:");
        System.out.println(abstractDAO.getList());
        abstractDAO.deleteAll(temp);
        System.out.println("**********\nAfter deleteAll() method:");
        System.out.println(abstractDAO.getList());
        abstractDAO.deleteById(1);
        System.out.println("**********\nAfter deleteById() method:");
        System.out.println(abstractDAO.getList());
        System.out.println("**********\nAfter get() method:");
        System.out.println(abstractDAO.get(3));
    }

    public static void userDaoUsed() {
        userDAO.save(user1);
        userDAO.save(user2);
        userDAO.save(user3);
        System.out.println("**********\nAfter save() method:");
        System.out.println(userDAO.getList());
        userDAO.delete(user2);
        System.out.println("**********\nAfter delete() method:");
        System.out.println(userDAO.getList());
        userDAO.saveAll(temp);
        System.out.println("**********\nAfter saveAll() method:");
        System.out.println(userDAO.getList());
        userDAO.deleteAll(temp);
        System.out.println("**********\nAfter deleteAll() method:");
        System.out.println(userDAO.getList());
        userDAO.deleteById(1);
        System.out.println("**********\nAfter deleteById() method:");
        System.out.println(userDAO.getList());
        System.out.println("**********\nAfter get() method:");
        System.out.println(userDAO.get(3));
    }
}
