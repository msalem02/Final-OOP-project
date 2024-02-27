//1203022-Mohammed Salem - section 5L

package FinalProject;

import java.text.SimpleDateFormat;
import java.util.*;

// Concrete subclass representing a credit card payment implementing Payable interface
public class CreditCard extends CustomerPayment implements Payable {
    private double chargingFee;
    private Date expiryDate;

    // Constructors for CreditCard payment
    public CreditCard() {
    }

    public CreditCard(String customerName, int customerId, double amount, double chargingFee, Date expiryDate) {
        super(customerName, customerId, amount);
        this.chargingFee = chargingFee;
        this.expiryDate = expiryDate;
    }

    // Getter and setter methods for charging fee and expiry date
    public double getChargingFee() {
        return chargingFee;
    }

    public void setChargingFee(double chargingFee) {
        this.chargingFee = chargingFee;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }


    // Implementation of calculatePayment by adding the charging fee to the amount
    @Override
    protected double calculatePayment() {
        return getAmount()+chargingFee;
    }


    // isAuthorized to check if the current date is before the expiry date
    @Override
    public boolean isAuthorized() {
        Date currentDate=new Date();
        if (currentDate.after(expiryDate))
            return false;
        return true;
    }


    // toString method
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
        return String.format("CreditCard [chargingFee=%.1f, expiryDate=%s, customerName=%s, customerId=%d, amount=%.1f] ",
                chargingFee, sdf.format(expiryDate), getCustomerName(), getCustomerId(), getAmount());
    }

}
