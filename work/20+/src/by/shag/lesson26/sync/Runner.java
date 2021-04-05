package by.shag.lesson26.sync;

public class Runner {

    public static void main(String[] args) throws InterruptedException {
        Account account = new Account(10_000);
        System.out.println("Start balance = " + account.getBalanceInEuro());

        Thread depositThread = new DepositThread(account);
        Thread withdrawThread = new WithdrawThread(account);

        withdrawThread.start();
        Thread.sleep(1_000L);
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
