package ucu.apps.flower_store_continue.payment;

public class PayPalPaymentStrategy implements Payment{

    private final double DISCOUNTED_MULTIPLIER = 0.95;

    @Override
    public boolean pay(double price) {
        double toBePayed = DISCOUNTED_MULTIPLIER * price;
        return true;
    }
}
