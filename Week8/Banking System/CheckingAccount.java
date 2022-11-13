public class CheckingAccount extends Account {
    /**
     * Comment.
     */
    public CheckingAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * Comment.
     */
    public void withdraw(double amount) {
        try {
            double lastBalance = getBalance();
            super.doWithdrawing(amount);
            addTransaction(new Transaction(Transaction.TYPE_WITHDRAW_CHECKING, 
                amount, lastBalance, getBalance()));
        } 
        catch (Exception e) {
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
            addTransaction(new Transaction(Transaction.TYPE_DEPOSIT_CHECKING, 
                amount, lastBalance, getBalance()));
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }

}
