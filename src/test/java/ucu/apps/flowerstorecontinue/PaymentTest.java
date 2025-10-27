package ucu.apps.flowerstorecontinue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ucu.apps.flowerstorecontinue.payment.CreditCardPaymentStrategy;
import ucu.apps.flowerstorecontinue.payment.PayPalPaymentStrategy;
import ucu.apps.flowerstorecontinue.payment.Payment;

class PaymentTest {

    private static final double AMOUNT_LARGE = 250.0;
    private static final double AMOUNT_SMALL = 75.0;
    private static final double AMOUNT_ZERO  = 0.0;

    private Payment cardProcessor;
    private Payment onlinePaymentProcessor;

    @BeforeEach
    void setUp() {
        cardProcessor = new CreditCardPaymentStrategy();
        onlinePaymentProcessor = new PayPalPaymentStrategy();
    }

    @Test
    void testCreditCardPayment() {
        Assertions.assertTrue(cardProcessor.pay(AMOUNT_LARGE));
        Assertions.assertTrue(cardProcessor.pay(AMOUNT_ZERO));
    }

    @Test
    void testPayPalPayment() {
        Assertions.assertTrue(onlinePaymentProcessor.pay(AMOUNT_SMALL));
    }

    @Test
    void zeroAmountStillReturnsTrue() {
        Assertions.assertTrue(onlinePaymentProcessor.pay(AMOUNT_ZERO));
    }
}
