package Module2.Task2_4;

public class Main {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        fund(balances, ownerNames, "Jessi", 100);   //Jessi is not present in the list of owner names + valid fund amount
        fund(balances, ownerNames, "Jessi", -100);  //Jessi is not present in the list of owner names + invalid fund amount
        fund(balances, ownerNames, "Ann", 100);     //positive case for one of the clients
        fund(balances, ownerNames, "Ann", 0);       //fund amount = 0 for one of the clients
        fund(balances, ownerNames, "Jack", -100);   //invalid fund amount for one of the clients
        fund(balances, ownerNames, "Jack", 1000);   //positive case for other client
    }

    public static void fund(int[] balancesArray, String[] namesArray, String ownerName, int fundAmount) {
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
            if (fundAmount < 0) {
                System.out.println("Fund amount cannot be less than 0");
            } else {
                System.out.println(ownerName + " " + (balance + fundAmount));
            }
        } else {
            System.out.println(ownerName + " has no account here");
        }
    }
}
