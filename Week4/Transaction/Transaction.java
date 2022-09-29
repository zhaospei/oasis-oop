public class Transaction {
    private String operation;
    private double amount;
    private double balance;

    public static final String DEPOSIT = "deposit";
    public static final String WITHDRAW = "withdraw";

    Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    public String getOperation() {
        return operation;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * Comment.
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * Comment.
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Comment.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
}