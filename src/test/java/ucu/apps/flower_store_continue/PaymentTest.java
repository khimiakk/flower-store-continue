package ucu.apps.flower_store_continue;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ucu.apps.flower_store_continue.payment.CreditCardPaymentStrategy;
import ucu.apps.flower_store_continue.payment.PayPalPaymentStrategy;
import ucu.apps.flower_store_continue.payment.Payment;

class PaymentTest {
    private Payment cardProcessor;
    private Payment onlinePaymentProcessor;

    @BeforeEach
    void setUp() {
        cardProcessor = new CreditCardPaymentStrategy();
        onlinePaymentProcessor = new PayPalPaymentStrategy();
    }

    @Test
    void testCreditCardPayment() {
        assertTrue(cardProcessor.pay(250.0));
        assertTrue(cardProcessor.pay(0.0));
    }

    @Test
    void testPayPalPayment() {
        assertTrue(onlinePaymentProcessor.pay(75.0));
    }

    @Test
    void zeroAmountStillReturnsTrue() {
        assertTrue(onlinePaymentProcessor.pay(0.0));
    }

}