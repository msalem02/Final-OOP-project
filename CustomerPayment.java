//1203022-Mohammed Salem - section 5L
package FinalProject;

// Abstract class representing a generic customer payment implementing Comparable for sorting
public abstract class CustomerPayment implements Comparable {
    protected String customerName;
    protected  int customerId;
    protected double amount;

    // Default constructor
    public CustomerPayment() {
    }

    // Constructor with parameters to initialize customer details and payment amount
    public CustomerPayment(String customerName, int customerId, double amount) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.amount = amount;
    }

    // Getter and setter methods for the fields

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Abstract method to calculate the payment amount
    protected abstract double calculatePayment();

    // Method to print payment information
    public void printPaymentInfo() {
        System.out.println(this.toString() + ", Calculated Payment: " + calculatePayment());
    }

    // compareTo method to enable sorting based on calculated payment amounts
    @Override
    public int compareTo(Object o) {
        if (o instanceof CustomerPayment temp) {
            return Double.compare(temp.calculatePayment(), this.calculatePayment());
        }
        else
            throw new IllegalArgumentException("Object must be of type CustomerPayment");
    }

    // toString method for a string representation of CustomerPayment
    @Override
    public String toString() {
        return "CustomerPayment{" +
                "customerName='" + customerName + '\'' +
                ", customerId=" + customerId +
                ", amount=" + amount +
                '}';
    }
}
