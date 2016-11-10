package Module3.Task3_4;

public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
        if (monthsOfEmployment < 0) {
            this.monthsOfEmployment = 0;
        } else {
            this.monthsOfEmployment = monthsOfEmployment;
        }
        this.companyName = companyName;
        if (salary < 0) {
            if (this.monthsOfEmployment <= 12) {
                this.salary = 1000;
            } else if (this.monthsOfEmployment <=24) {
                this.salary = 2000;
            } else if (this.monthsOfEmployment <=36) {
                this.salary = 3000;
            } else {
                this.salary = 5000;
            }
        } else {
            this.salary = salary;
        }
        this.currency = currency;
    }

    public void paySalary() {
        this.balance += salary;
        System.out.println(this.name + " got salary. New balance is: " + this.currency + this.balance);
    }

    public void withdraw(int summ) {
        if (summ < 1000) {
            if (summ * 1.05 > balance) {
                System.out.println("Not enough money on the account");
            } else {
                balance -= (summ * 1.05);
                System.out.println("Success! Remaining balance: " + currency + balance);
            }
        } else {
            if (summ * 1.1 > balance) {
                System.out.println("Not enough money on the account");
            } else {
                balance -= (summ * 1.1);
                System.out.println("Success! Remaining balance: " + currency + balance);
            }
        }
    }

    public void companyNameLenght() {
        System.out.println("Company " + this.companyName + " has length: " + companyName.length());
    }

    public void monthIncreaser(int addMonth) {
        if (addMonth <= 0) {
            System.out.println("Nothing changed. " + this.name + " still has " +
                    this.monthsOfEmployment + " month of experience!");
        } else {
            this.monthsOfEmployment += addMonth;
            System.out.println("Time seems to pass quickly. " + this.name + " has now " +
                    this.monthsOfEmployment + " month of experience!");
        }
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
