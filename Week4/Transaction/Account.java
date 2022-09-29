import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<Transaction>();
    
    private void roundTwoDemical(double x) {
        long xround = Math.round(x * 100);
        double ans = (double) xround / 100;
        if (xround % 100 == 0) {
            System.out.print(ans + "0");
        } else {
            System.out.print(ans);
        }
    }

    private void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("So tien ban nap vao khong hop le!");    
        }
    }

    private void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            balance -= amount;
        }
    }

    /**
     * Comment.
     */
    public void addTransaction(double amount, String operation) {
        if (operation != Transaction.DEPOSIT && operation != Transaction.WITHDRAW) {
            System.out.println("Yeu cau khong hop le!");
        } else {
            if (operation == Transaction.DEPOSIT) {
                deposit(amount);
            } else {
                withdraw(amount);
            } 
            transitionList.add(new Transaction(operation, amount, balance));
        }
    }

    /**
     * Comment.
     */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            System.out.print("Giao dich " + (i + 1) + ": ");
            if (transitionList.get(i).getOperation() == Transaction.DEPOSIT) {
                System.out.print("Nap tien $");
                roundTwoDemical(transitionList.get(i).getAmount());
                System.out.print(". So du luc nay: $");
                roundTwoDemical(transitionList.get(i).getBalance());
                System.out.print(".\n");
            } else {
                System.out.print("Rut tien $");
                roundTwoDemical(transitionList.get(i).getAmount());
                System.out.print(". So du luc nay: $");
                roundTwoDemical(transitionList.get(i).getBalance());
                System.out.print(".\n");
            }
        }
    }
}
