package ucu.apps.flower_store_continue.payment;

public class CreditCardPaymentStrategy implements Payment{

    @Override
    public boolean pay(double price) {
        System.out.println("Paid " + price + " using Credit Card.");
        return true;
    }
}
