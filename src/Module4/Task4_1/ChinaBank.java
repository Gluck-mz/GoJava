package Module4.Task4_1;

import Module4.Task4_2.Currency;

public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (getCurrency().equals(Currency.USD)) {
            return 100;
        } else if (getCurrency().equals(Currency.EUR)) {
            return 150;
        } else {
            return 0;
        }
    }

    @Override
    public int getLimitOfFunding() {
        if (getCurrency().equals(Currency.EUR)) {
            return 5000;
        } else if (getCurrency().equals(Currency.USD)) {
            return 10000;
        } else {
            return 0;
        }
    }

    @Override
    public double getMonthlyRate() {
        if (getCurrency().equals(Currency.USD)) {
            return 0.01;
        } else {
            return 0;
        }
    }

    @Override
    public double getCommission(int sum) {
        if (getCurrency().equals(Currency.USD)) {
            if (sum <= 0) {
                return 0;
            } else if (sum < 1000) {
                return sum * 0.03;
            } else {
                return sum * 0.05;
            }
        } else if (getCurrency().equals(Currency.EUR)) {
            if (sum < 0) {
                return 0;
            } else if (sum < 1000) {
                return sum * 0.1;
            } else {
                return sum * 0.11;
            }
        } else {
            return 0;
        }
    }

    @Override
    public double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
