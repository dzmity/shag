package by.shag.lesson26.sync;

public class Runner {

    public static void main(String[] args) throws InterruptedException {
        Account account = new Account(100_000);
        System.out.println("Start balance = " + account.getBalanceInEuro());

        Thread depositThread = new DepositThread(account);
        Thread withdrawThread = new WithdrawThread(account);

        withdrawThread.start();
        depositThread.start();

        withdrawThread.join();
        depositThread.join();

        System.out.println("End balance = " + account.getBalanceInEuro());

        // 1 way - method
        // 2 way - block
        // 3 way
        // пример с wait на списание средств
    }
}
