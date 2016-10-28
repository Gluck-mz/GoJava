package Module2.Task2_2;

public class Main {
    public static void main(String[] args) {
        withdraw(-500, 100); //Error message expected here
        withdraw(500, -100); //Error message expected here
        withdraw(500, 500);  //No
        withdraw(500, 100);  //Yes
    }

    public static void withdraw(double balance, double withdrawalAmount) {
        if (balance < 0 || withdrawalAmount < 0) {
            System.out.println("Balance or withdrawal amount cannot be less than 0");
        } else if (withdrawalAmount * 1.05 > balance) {
            System.out.println("NO");
        } else {
            System.out.println("OK " + withdrawalAmount * 0.05 + " " + (balance - withdrawalAmount * 1.05));
        }
    }
}
