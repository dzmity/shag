package by.shag.lesson26.sync;

public class Account {

    private long balanceInEuro;

    public Account() {
    }

    public Account(long balanceInEuro) {
        this.balanceInEuro = balanceInEuro;
    }

    public long getBalanceInEuro() {
        return balanceInEuro;
    }

    public void deposit(long amount) {

        balanceInEuro += amount;
    }

    public void withdraw(long amount) {


        if (balanceInEuro < amount) {
            throw new NotEnoughMoneyException("not enough money for operation");
        }
        balanceInEuro -= amount;
    }
}
