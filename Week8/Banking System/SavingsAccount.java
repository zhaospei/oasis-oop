public class SavingsAccount extends Account {
    /**
     * Comment.
     */
    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * Comment.
     */
    public void withdraw(double amount) {
        try {
            if (amount <= 1000 && getBalance() >= 5000) {
                double lastBalance = getBalance();
                super.doWithdrawing(amount);
                addTransaction(new Transaction(Transaction.TYPE_WITHDRAW_SAVINGS, 
                    amount, lastBalance, getBalance()));
            } 
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }

    /**
     * Comment.
     */
    public void deposit(double amount) {
        try {
            double lastBalance = getBalance();
            super.doDepositing(amount);
            addTransaction(new Transaction(Transaction.TYPE_DEPOSIT_SAVINGS, 
                amount, lastBalance, getBalance()));
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}
