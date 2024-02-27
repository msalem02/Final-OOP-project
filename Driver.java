//1203022-Mohammed Salem - section 5L

package FinalProject;
import java.util.*;


public class Driver {

    public static void main(String[] args) {
        // Create a list to store different types of payments
        ArrayList<CustomerPayment> payments = new ArrayList<>();

        // Create a check payment and add it to the list if it is authorized
        CustomerPayment check1 = new Check("Rana", 7777, 400, 1111, 350, Check.PERSONAL);
        if (((Check)check1).isAuthorized())
            payments.add(check1);

        // Create a cash payment and add it to the list
        CustomerPayment cash = new Cash("Ahmad", 4444, 150, 5.0);
        payments.add(cash);

        // Create another check payment and add it to the list if it is authorized
        CustomerPayment check2 = new Check("Suha", 5555, 100, 1111, 200, Check.CASHIER);
        if (((Check)check2).isAuthorized())
            payments.add(check2);

        // Create a third check payment and add it to the list if it is authorized
        CustomerPayment check3 = new Check("Rania", 7777, 600.0, 1111, 750, Check.CERTIFIED);
        if (((Check)check3).isAuthorized())
            payments.add(check3);

        // Create a credit card payment and add it to the list if it is authorized
        CustomerPayment creditCard1 = new CreditCard("Randa", 9999, 170, 20, new Date(124, 05, 03));
        if (((CreditCard)creditCard1).isAuthorized())
            payments.add(creditCard1);

        // Create another credit card payment and add it to the list if it is authorized
        CustomerPayment creditCard2 = new CreditCard("Hani", 6666, 150, 10, new Date(120, 06, 07));
        if (((CreditCard)creditCard2).isAuthorized())
            payments.add(creditCard2);

        // Sort the payments in the list
        Collections.sort(payments);

        // Print the details of each payment in the sorted list
        for (CustomerPayment payment : payments)
            payment.printPaymentInfo();
    }
}