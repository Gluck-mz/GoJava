package Module4.Task4_4;

import Module4.Task4_3.User;

public class BankSystemImplementation implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        user.setBalance(user.getBalance() - amount);
    }

    @Override
    public void fundUser(User user, int amount) {
        user.setBalance(user.getBalance() + amount);
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        fromUser.setBalance(fromUser.getBalance() - amount);
        toUser.setBalance(toUser.getBalance() + amount);
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
    }
}
