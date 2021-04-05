package by.shag.lesson26.sync;

import java.util.concurrent.atomic.AtomicLong;

public class Account {

    private AtomicLong balanceInEuro;

    public Account() {
    }

    public Account(long balanceInEuro) {
        this.balanceInEuro = new AtomicLong(balanceInEuro);
    }

    public AtomicLong getBalanceInEuro() {
        return balanceInEuro;
    }

    public void deposit(long amount) throws InterruptedException {
        balanceInEuro.getAndAdd(amount);
        System.out.println("Добавил на счет " + amount + " Текущий баланс = " + balanceInEuro);
//        notify();
    }

    public synchronized void withdraw(long amount) {
//        if (balanceInEuro < amount) {
//            throw new NotEnoughMoneyException("not enough money for operation");
//        }
        balanceInEuro.getAndAdd(-1 * amount);
    }

    public void waitAndWithdraw(long amount) throws InterruptedException {
        while (balanceInEuro.get() < amount) {
            System.out.println("Balance = " + balanceInEuro + " is less than amount for withdraw. Waiting");
//            notify();
//            wait();
        }
        balanceInEuro.getAndAdd(-1 * amount);
        System.out.println("Списали со счета " + amount + " Текущий баланс = " + balanceInEuro);
    }
}
