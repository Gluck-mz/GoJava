package Module6.Task6_5;

import Module6.Task6_4.User;

import java.util.ArrayList;
import java.util.List;

public final class UserUtils {

    public static User[] uniqueUsers(User[] users) {
        User[] result = new User[users.length];
        result[0] = users[0];
        for (int i = 1; i < users.length; i++) {
            if (!isUserPresent(users[i], result)) {
                result[i] = users[i];
            } else {
                result[i] = null;
            }
        }
        return result;
    }

    public static User[] usersWithConditionalBalance(User[] users, int balance) {
        User[] result = new User[numberOfUsersWithBalance(users, balance)];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < users.length; j++) {
                if (users[j].getBalance() == balance) {
                    result[i] = users[j];
                }
            }
        }
        return result;
    }

    public final static User[] paySalaryToUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            users[i].setBalance(users[i].getBalance() + users[i].getSalary());
        }
        return users;
    }

    public final static long[] getUsersId(User[] users) {
        long[] result = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            result[i] = users[i].getId();
        }
        return result;
    }

    public static User[] deleteEmptyUsers(User[] users) {
        User[] result = new User[users.length];
        for (int i = 0; i < users.length; i++) {
            if (isUserEmpty(users[i])) {
                result[i] = null;
            } else {
                result[i] = users[i];
            }
        }
        return result;
    }

    //created to simplify usersWithConditionalBalance() method
    public static int numberOfUsersWithBalance(User[] users, int balance) {
        int num = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                num++;
            }
        }
        return num;
    }

    //created to simplify uniqueUsers() method
    public static boolean isUserPresent(User user, User[] users) {
        for (User u : users) {
            if (user.equals(u)) {
                return true;
            }
        }
        return false;
    }

    //created to simplify deleteEmptyUsers() method
    public static boolean isUserEmpty(User user) {
        if (user.getFirstName() == null && user.getLastName() == null) {
            return true;
        } else {
            return false;
        }
    }

    //private empty constructor
    private UserUtils() {}
}
