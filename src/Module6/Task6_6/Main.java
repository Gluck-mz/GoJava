package Module6.Task6_6;

import Module6.Task6_4.User;
import Module6.Task6_5.UserUtils;

public class Main {
    public static void main(String[] args) {
        User[] users = {
                new User(1, "Ben", "Smith", 1250, 7500),
                new User(2, "James", "Bond", 2500, 5000),
                new User(5, null, null, 5000, 7500),
                new User(1, "Ben", "Smith", 1250, 3000),
                new User(3, "Darth", "Wader", 3250, 7500),
                new User(4, "Bruce", "Willis", 5000, 15000)
        };

        User[] users1 = {
                new User(1,"Vadim","Ozarinskiy",2500,3000),
                new User(1,"Vadim","Ozarinskiy",2500,3000),
                new User(2,"Maxim","Mikituk",4000,8000),
                new User(3,"Pasha","Bevz",3500,666),
                new User(4,"Petro","Semerenko",1000,666)
        };

//        uniqueUsersCheck(users1);
        conditionalBalanceCheck(users, 7500);
//        paySalaryCheck(users);
//        getIdCheck(users);
//        deleteEmptyUsersCheck(users);

    }

    public static void uniqueUsersCheck(User[] users) {
        User[] uniqueUsers = UserUtils.uniqueUsers(users);
        printOut(uniqueUsers);
    }

    public static void conditionalBalanceCheck(User[] users, int balance) {
        printOut(UserUtils.usersWithConditionalBalance(users, 7500));
    }

    public static void paySalaryCheck(User[] users) {
        System.out.println("Before method execution:");
        for (int i = 0; i < users.length; i++) {
            System.out.println("User with id: " + users[i].getId() + " has balance: " + users[i].getBalance() + " and salary: " + users[i].getSalary());
        }

        UserUtils.paySalaryToUsers(users);
        System.out.println();
        System.out.println("After method execution:");
        for (int i = 0; i < users.length; i++) {
            System.out.println("User with id: " + users[i].getId() + " has balance: " + users[i].getBalance());
        }

        UserUtils.paySalaryToUsers(users);
        System.out.println();
        System.out.println("Executed paySalary() method one more time:");
        for (int i = 0; i < users.length; i++) {
            System.out.println("User with id: " + users[i].getId() + " has balance: " + users[i].getBalance());
        }
    }

    public static void getIdCheck(User[] users) {
        for (long i : UserUtils.getUsersId(users)) {
            System.out.println(i);
        }
    }

    public static void deleteEmptyUsersCheck(User[] users) {
        printOut(UserUtils.deleteEmptyUsers(users));
    }

    public static void printOut(User[] users) {
        for (User u : users) {
            System.out.println(u);
        }

    }
}