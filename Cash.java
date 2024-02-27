//1203022-Mohammed Salem - section 5L

package FinalProject;

// Concrete subclass representing a cash payment
public class Cash extends CustomerPayment {
    private double discountRate;

    // Constructors
    public Cash() {
    }

    public Cash(String customerName, int customerId, double amount, double discountRate) {
        super(customerName, customerId, amount);
        this.discountRate = discountRate;
    }

    // Getter and setter for the discount rate
    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    // Implementation of calculatePayment to apply the discount
    @Override
    protected double calculatePayment() {
        return getAmount() * (1 - discountRate / 100);
    }

    // toString method specific to Cash, including discount and calculated payment
    @Override
    public String toString() {
        return String.format("Cash [discountRate=%.1f, customerName=%s, customerId=%d, amount=%.1f] ",
                discountRate, getCustomerName(), getCustomerId(), getAmount());
    }

}
