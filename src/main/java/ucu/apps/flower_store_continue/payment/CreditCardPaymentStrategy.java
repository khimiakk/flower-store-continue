package ucu.apps.flower_store_continue.payment;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public boolean pay(double price) {
        return true;
    }
}
