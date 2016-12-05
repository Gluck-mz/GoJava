package Module6.Task6_6;

import Module6.Task6_4.User;
import Module6.Task6_5.UserUtils;

public class Main {
    public static void main(String[] args) {
        User[] users = {
                new User(1, "Ben", "Smith", 1250, 3000),
                new User(2, "James", "Bond", 2500, 5000),
                new User(3, "Darth", "Wader", 3250, 7500),
                new User(4, "Bruce", "Willis", 5000, 15000),
                new User(1, "Ben", "Smith", 1250, 3000)
        };

        User[] uniqueUsers = UserUtils.uniqueUsers(users);
        User[] usersWithConditionalBalance = UserUtils.usersWithConditionalBalance(users, 7500);
        User[] usersWithPayedSalary = UserUtils.paySalaryToUsers(users);

        printOut(uniqueUsers);
        printOut(usersWithConditionalBalance);
        printOut(usersWithPayedSalary);
    }

    public static void printOut(User[] users) throws NullPointerException {
        for (User user : users) {
            System.out.println(user);
        }

    }
}