package tuts.tut10.complete.strategy.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Concrete strategy. Implements credit card payment method.
 */
public class PayByCreditCard implements PayStrategy {

    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    /**
     * Collect credit card data.
     */
    @Override
    public void collectPaymentDetails() {
        //TO-DO: Add 'try-catch' block to catch the IO error
        Scanner sc = new Scanner(System.in);
        //TO-DO: Ask for card number, expiration date, CVV code then save them to suitable variable
        String number = null, date = null, cvv = null;
        try {
            System.out.println("Enter card number :");
            number = sc.nextLine();
            System.out.println("Enter date:");
            date = sc.nextLine();
            System.out.println("Enter cvv");
            cvv = sc.nextLine();
        } catch (Exception e) {
        }
        //TO-DO: Create new CreditCard instance with given information
        CreditCard c = new CreditCard(number, date, cvv);
        //TO-DO: Validate credit card number...

    }

    //TO-DO: Implement the pay() method
    /**
     * After card validation we can charge customer's credit card.
     */
    @Override
    public boolean pay(int paymentAmount) {
        /*if 'cardIsPresent' => display a message 
         to show that customer is paying with Credit Card with money amount
         then reduce the card amount with that number
         finally return true else return false */

        return false;
    }

    private boolean cardIsPresent() {
        return card != null;
    }
}
