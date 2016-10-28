package Module2.Task2_3;

public class Main {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        withdraw(balances, ownerNames, "Jessi", 100);   //Jessi is not present in the list of owner names + valid withdrawal amount
        withdraw(balances, ownerNames, "Jessi", -100);  //Jessi is not present in the list of owner names + invalid withdrawal amount
        withdraw(balances, ownerNames, "Lane", 0);      //withdrawal amount = 0
        withdraw(balances, ownerNames, "Lane", -50);    //invalid withdrawal amount
        withdraw(balances, ownerNames, "Lane", 50);     //positive case for one of the clients
        withdraw(balances, ownerNames, "Oww", 500);     //not enough money on the account
        withdraw(balances, ownerNames, "Oww", 100);     //positive case for other client
    }

    public static void withdraw(int[] balancesArray, String[] namesArray, String ownerName, double withdrawalAmount) {
        boolean isOwnerExists = false;
        double balance = 0;
        for (int i = 0; i < namesArray.length;) {
            if (!ownerName.equals(namesArray[i])) {
                i++;
            } else {
                isOwnerExists = true;
                balance = balancesArray[i];
                break;
            }
        }
        if (isOwnerExists) {
            if (withdrawalAmount < 0) {
                System.out.println("Withdrawal amount cannot be less than 0");
            } else if (withdrawalAmount * 1.05 > balance) {
                System.out.println(ownerName + " NO");
            } else {
                System.out.println(ownerName + " " + withdrawalAmount + " " + (balance - withdrawalAmount * 1.05));
            }
        } else {
            System.out.println(ownerName + " has no account here");
        }
    }
}
