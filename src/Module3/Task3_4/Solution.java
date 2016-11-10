package Module3.Task3_4;

public class Solution {
    public static void main(String[] args) {
        user0();
        user1();
        user2();
    }

    //Positive scenario:
    static void user0() {
        User user = new User("Bill", 5000, 35, "Microsoft", 3500, "$");
        System.out.println(user.getName());
        System.out.println(user.getBalance());
        System.out.println(user.getMonthsOfEmployment());
        System.out.println(user.getCompanyName());
        System.out.println(user.getSalary());
        System.out.println(user.getCurrency());
        user.companyNameLenght();
        user.paySalary();
        user.withdraw(100);
        user.paySalary();
        user.withdraw(5000);
        user.monthIncreaser(6);
        user.monthIncreaser(-4);
    }

    //User created with negative balance (balance is set to 0)
    static void user1() {
        User user = new User("John", -15000, 5, "Amazon", 1500, "$");
        System.out.println(user.getName());
        System.out.println(user.getBalance());
        System.out.println(user.getMonthsOfEmployment());
        System.out.println(user.getCompanyName());
        System.out.println(user.getSalary());
        System.out.println(user.getCurrency());
        user.companyNameLenght();
        user.paySalary();
        user.withdraw(100);
        user.paySalary();
        user.withdraw(5000);
        user.monthIncreaser(6);
        user.monthIncreaser(-4);
    }

    //User created with negative salary (salary assigned based on his experience)
    static void user2() {
        User user = new User("Nick", 15000, 25, "Apple", -1500, "$");
        System.out.println(user.getName());
        System.out.println(user.getBalance());
        System.out.println(user.getMonthsOfEmployment());
        System.out.println(user.getCompanyName());
        System.out.println(user.getSalary());
        System.out.println(user.getCurrency());
        user.companyNameLenght();
        user.paySalary();
        user.withdraw(100);
        user.paySalary();
        user.withdraw(5000);
        user.monthIncreaser(6);
        user.monthIncreaser(-4);
    }
}
