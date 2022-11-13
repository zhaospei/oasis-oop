import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long idNumber;
    private String fullName;
    private List<Account> accountList = new ArrayList<>();

    /**
     * Comment.
     */
    public Customer() {
        
    }

    /**
     * Comment.
     */
    public Customer(long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
    }

    /**
     * Comment.
     */
    public String getCustomerInfo() {
        String str = "";
        str += "Số CMND: " + idNumber;
        str += ". Họ tên: " + fullName + ".";
        return str;
    }

    /**
     * Comment.
     */
    public void addAccount(Account account) {
        accountList.add(account);
    }

    /**
     * Comment.
     */
    public void removeAccount(Account account) {
        accountList.remove(account);
    }

    /**
     * Comment.
     */
    public long getIdNumber() {
        return idNumber;
    }

    /**
     * Comment.
     */
    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * Comment.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Comment.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Comment.
     */
    public List<Account> getAccountList() {
        return accountList;
    }
}
