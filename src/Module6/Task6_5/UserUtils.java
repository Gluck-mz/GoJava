package Module6.Task6_5;

import Module6.Task6_4.User;

public class UserUtils {
    public static User[] uniqueUsers(User[] users) {
        User[] result = new User[users.length];
        for (int i = 0; i < users.length - 1; i++) {
            for (int j = i + 1; j < users.length; j++) {
                if (!users[i].equals(users[j])) {
                    result[i] = users[i];
                } else {
                    result[i] = null;
                }
            }
        }
        return result;
    }

    public static User[] usersWithConditionalBalance(User[] users, int balance) {
        User[] result = new User[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                result[i] = users[i];
            } else {
                result[i] = null;
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
            if (users[i].getFirstName().equals(null) && users[i].getLastName().equals(null)) {
                result[i] = null;
            } else {
                result[i] = users[i];
            }
        }
        return result;
    }
}
