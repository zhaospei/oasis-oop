import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    private long accountNumber;
    private double balance;
    protected List<Transaction> transactionList = new ArrayList<>();
    
    /**
     * Comment.
     */
    public Account() {

    }

    /**
     * Comment.
     */
    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * Comment.
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     * Comment.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Comment.
     */
    public void doWithdrawing(double amount) throws Exception {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        } else if (amount > balance) {
            throw new InsufficientFundsException(amount);
        } else {
            balance -= amount;
        }        
    }

    /**
     * Comment.
     */
    public void doDepositing(double amount) throws Exception {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        } else {
            balance += amount;
        }        
    }

    public abstract void withdraw(double amount);

    public abstract void deposit(double amount);

    /**
     * Comment.
     */
    public String getTransactionHistory() {
        String str = "Lịch sử giao dịch của tài khoản " + accountNumber + ":\n";
        for (Transaction transaction: transactionList) {
            str += "- " + transaction.getTransactionSummary() + "\n";
        }
        return str;
    }

    /**
     * Comment.
     */
    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    /**
     * Comment.
     */
    @Override
    public boolean equals(Object object) {
        if (object instanceof Account) {
            Account other = (Account) object;
            if (this.accountNumber == other.accountNumber) {
                return true;
            }
        } 
        return false;
    }

}