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

    public synchronized void deposit(long amount) throws InterruptedException {
        balanceInEuro += amount;
        System.out.println("Добавил на счет " + amount + " Текущий баланс = " + balanceInEuro);
        notify();
    }

    public synchronized void withdraw(long amount) {
//        if (balanceInEuro < amount) {
//            throw new NotEnoughMoneyException("not enough money for operation");
//        }
        balanceInEuro -= amount;
    }

    public synchronized void waitAndWithdraw(long amount) throws InterruptedException {
        while (balanceInEuro < amount) {
            System.out.println("Balance = " + balanceInEuro + " is less than amount for withdraw. Waiting");
            notify();
            wait();
        }
        balanceInEuro -= amount;
        System.out.println("Списали со счета " + amount + " Текущий баланс = " + balanceInEuro);

    }
}
