package 多线程;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountWithSync {
    private static Account account = new Account();

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            executor.execute(new AddAPennyTask());
        }

        executor.shutdown();

        while (!executor.isTerminated()) {

        }

        System.out.println(account.getBalance());
    }

    private static class Account {
        private int balance = 0;

        public int getBalance() {
            return balance;
        }

        public synchronized void deposit(int account) {
            int newBalance = balance + account;

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance = newBalance;
        }
    }

    private static class AddAPennyTask implements Runnable {
        @Override
        public void run() {
            account.deposit(1);
        }
    }
}
