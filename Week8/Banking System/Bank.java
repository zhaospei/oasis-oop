import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bank {
    private List<Customer> customerList = new ArrayList<>();
    
    /**
     * Comment.
     */
    public void readCustomerList(InputStream in) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        try {
            Customer customer = null;
            String line = bufferedReader.readLine(); 
            while (line != null) {           
                if (line.contains("CHECKING") || line.contains("SAVINGS")) {
                    int a = line.indexOf(' ');
                    long accountNumber = Long.parseLong(line.substring(0, a));
                    int b = line.lastIndexOf(' ');
                    double balance = Double.parseDouble(line.substring(b + 1));
                    if (line.contains("CHECKING")) {
                        customer.addAccount(new CheckingAccount(accountNumber, balance));
                    } else {
                        customer.addAccount(new SavingsAccount(accountNumber, balance));
                    }
                } else {
                    int a = line.lastIndexOf(' ');
                    String fullName = line.substring(0, a);
                    long idNumber = Long.parseLong(line.substring(a + 1));
                    customer = new Customer(idNumber, fullName);
                    customerList.add(customer);
                }
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Comment.
     */
    Comparator<Customer> rankId =  new Comparator<Customer>() {
        @Override
        public int compare(Customer a, Customer b) {
            if (a.getIdNumber() < b.getIdNumber()) {
                return -1;
            } else {
                if (a.getIdNumber() > b.getIdNumber()) {
                    return 1;
                } else {
                    return 0;
                }
            }            
        }
    };

    /**
     * Comment.
     */
    Comparator<Customer> rankName =  new Comparator<Customer>() {
        @Override
        public int compare(Customer a, Customer b) {
            return a.getFullName().compareTo(b.getFullName());   
        }
    };

    /**
     * Comment.
     */
    public String getCustomersInfoByNameOrder() {
        Collections.sort(customerList, rankName);
        String str = "";
        for (Customer customer: customerList) {
            str += customer.getCustomerInfo() + "\n";
        }   
        return str;
    }

    /**
     * Comment.
     */
    public String getCustomersInfoByIdOrder() {
        Collections.sort(customerList, rankId);
        String str = "";
        for (Customer customer: customerList) {
            str += customer.getCustomerInfo() + "\n";
        }   
        return str;
    }

    /**
     * Comment.
     */
    public List<Customer> getCustomerList() {
        return customerList;
    }

}
