public class Transaction {
    public static final int TYPE_DEPOSIT_CHECKING = 1;
    public static final int TYPE_WITHDRAW_CHECKING = 2;
    public static final int TYPE_DEPOSIT_SAVINGS = 3;
    public static final int TYPE_WITHDRAW_SAVINGS = 4;
    private int type;
    private double amount;
    private double initalBalance;
    private double finalBalance;

    /**
     * Comment.
     */
    public Transaction(int type, double amount, 
        double initalBalance, double finalBalance) {
            this.type = type;
            this.amount = amount;
            this.initalBalance = initalBalance;
            this.finalBalance = finalBalance;
    }

    /**
     * Comment.
     */
    private String getTransactionTypeString(int type) {
        if (type == TYPE_DEPOSIT_CHECKING) {
            return "Nạp tiền vãng lai";
        }
        if (type == TYPE_WITHDRAW_CHECKING) {
            return "Rút tiền vãng lai";
        }
        if (type == TYPE_DEPOSIT_SAVINGS) {
            return "Nạp tiền tiết kiệm";
        }
        if (type == TYPE_WITHDRAW_SAVINGS) {
            return "Rút tiền tiết kiệm";
        }
        return null;
    }

    /**
     * Comment.
     */
    public String getTransactionSummary() {
        return "Kiểu giao dịch: " + getTransactionTypeString(type)
            + ". Số dư ban đầu: $" + String.format("%.2f", initalBalance) 
            + ". Số tiền: $" + String.format("%.2f", amount) 
            + ". Số dư cuối: $" + String.format("%.2f", finalBalance) + ".";
    }
    
}
