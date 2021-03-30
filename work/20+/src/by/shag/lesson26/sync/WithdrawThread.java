package by.shag.lesson26.sync;

public class WithdrawThread extends Thread {

    private final Account account;

    public WithdrawThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                account.waitAndWithdraw(5_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
