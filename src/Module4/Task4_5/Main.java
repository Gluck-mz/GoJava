package Module4.Task4_5;

import Module4.Task4_1.ChinaBank;
import Module4.Task4_1.EUBank;
import Module4.Task4_1.USBank;
import Module4.Task4_2.Currency;
import Module4.Task4_3.User;
import Module4.Task4_4.BankSystemImplementation;

public class Main {
    private static BankSystemImplementation bsi = new BankSystemImplementation();
    public static void main(String[] args) {
        user1();
//        user1_2();
//        user2();
//        user3();
//        user4();
//        user5();
//        user6();

    }

    public static void user1() {
        User user1 = new User(1, "User1", 5000, 36, "Google", 2500, new USBank(11, "New York", Currency.USD, 2000, 4500, 90, 1000000000));
        checkUser(user1, 2500, 3000, 1200);
    }

    public static void user1_2() {
        User user1 = new User(1, "User1", 5000, 36, "Google", 2500, new USBank(11, "New York", Currency.USD, 2000, 4500, 90, 1000000000));
        User user2 = new User(2, "User2", 4000, 24, "Amazon", 2200, new USBank(22, "Chicago", Currency.USD, 1500, 4000, 90, 1000000000));
        System.out.println("Balances before money transfer:");
        System.out.println("User 1: " + user1.getBalance());
        System.out.println("User 2: " + user2.getBalance());
        bsi.transferMoney(user1, user2, 4000);
        System.out.println("Balances after money transfer:");
        System.out.println("User 1: " + user1.getBalance());
        System.out.println("User 2: " + user2.getBalance());
    }

    public static void user2() {
        User user2 = new User(2, "User2", 4000, 24, "Amazon", 2200, new USBank(22, "Chicago", Currency.USD, 1500, 4000, 90, 1000000000));
        checkUser(user2, 2500, 3000, 1200);
    }

    public static void user3() {
        User user3 = new User(3, "User3", 6000, 30, "Mercedes", 3000, new EUBank(33, "Berlin", Currency.EUR, 2000, 3000, 85, 900000000));
        checkUser(user3, 2500, 3000, 1200);
    }

    public static void user4() {
        User user4 = new User(4, "User4", 10000, 44, "UBS", 5000, new EUBank(44, "London", Currency.EUR, 5000, 6000, 95, 2000000000));
        checkUser(user4, 2500, 3000, 1200);
    }

    public static void user5() {
        User user5 = new User(5, "User5", 12000, 48, "Ebay", 3500, new ChinaBank(55, "Beijing", Currency.EUR, 12000, 2000, 80, 900000000));
        checkUser(user5, 2500, 3000, 1200);
    }

    public static void user6() {
        User user6 = new User(6, "User6", 16000, 56, "Aliexpress", 5500, new ChinaBank(66, "Beijing", Currency.USD, 15000, 2000, 75, 2000000000));
        checkUser(user6, 2500, 3000, 1200);
    }

    public static void checkUser(User user, int fundAmount, int withdrawalAmount, int amountForCommission) {
        System.out.println("Balance before: " + user.getBalance());
        bsi.fundUser(user, fundAmount);
        System.out.println("Balance after funding of " + fundAmount + ": " + user.getBalance());
        bsi.withdrawOfUser(user, withdrawalAmount);
        System.out.println("Balance after withdrawal of " + withdrawalAmount + ": " + user.getBalance());
        bsi.paySalary(user);
        System.out.println("Balance after salary: " + user.getBalance());
        System.out.println("User bank's limit of funding: " + user.getBank().getLimitOfFunding());
        System.out.println("User bank's limit of withdrawal: " + user.getBank().getLimitOfWithdrawal());
        System.out.println("User bank's monthly rate: " + user.getBank().getMonthlyRate());
        System.out.println("User bank's commission on amount of "+ amountForCommission + user.getBank().getCurrency() +
                " equals to " + user.getBank().getCommission(amountForCommission) + user.getBank().getCurrency());
    }
}
