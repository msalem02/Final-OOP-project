//1203022-Mohammed Salem - section 5L

package FinalProject;

// Concrete subclass representing a check payment, implementing Payable interface
public class Check extends CustomerPayment implements Payable{

    // Constants for different types of checks
    public static final int CASHIER = 1;
    public static final int CERTIFIED = 2;
    public static final int PERSONAL = 3;


    private int accountNumber;
    private double accountBalance;
    private int type;

    // Constructors for Check payment
    public Check() {
    }

    public Check(String customerName, int customerId, double amount, int accountNumber, double accountBalance, int type) {
        super(customerName, customerId, amount);
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.type = type;
    }


    // Getter and setter methods for account details and check type
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        if (type == CASHIER || type == CERTIFIED || type == PERSONAL) {
            this.type = type;
        } else {
            throw new IllegalArgumentException("Invalid check type");
        }
    }


    // Implementation of calculatePayment to return the payment amount without changes
    @Override
    protected double calculatePayment() {
        return getAmount();
    }


    // Implementation of isAuthorized to check authorization
    @Override
    public boolean isAuthorized() {
        boolean isAuthorized = this.type == CASHIER || getAmount() <= accountBalance;
        if (isAuthorized && this.type != Check.CASHIER) {
            deductAmountFromBalance();
        }
        return isAuthorized;
    }

    // Method to deduct the payment amount from account balance
    private void deductAmountFromBalance() {
        this.accountBalance -= getAmount();
    }


    // toString method to print account details and payment information
    @Override
    public String toString() {
        return String.format
                ("Check [accountNumber=%d, accountBalance=%.1f, type=%d, customerName=%s, customerId=%d, amount=%.1f] ",
                        accountNumber, accountBalance, type, getCustomerName(), getCustomerId(), getAmount());
    }
}
