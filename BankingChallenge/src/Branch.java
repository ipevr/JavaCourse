import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double initialTransation) {
        if (findCustomer(name) == null) {
            customers.add(new Customer(name, initialTransation));
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer customer = findCustomer(customerName);
        if (customer != null) {
            customer.addTransaction(transaction);
            return true;
        }

        return false;
    }

    private Customer findCustomer(String name) {
        for (int i = 0; i < customers.size(); i++) {
            Customer customerCandidate = customers.get(i);
            if (customerCandidate.getName().equals(name)) {
                return customerCandidate;
            }
        }

        return null;
    }

}
