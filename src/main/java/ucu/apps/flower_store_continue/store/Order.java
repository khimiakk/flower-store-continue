package ucu.apps.flower_store_continue.store;

import ucu.apps.flower_store_continue.delivery.Delivery;
import ucu.apps.flower_store_continue.payment.Payment;
import ucu.apps.flower_store_continue.store.flower.Item;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items = new ArrayList<>();
    private Payment payment;
    private Delivery delivery;

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public boolean processOrder() {
        if (payment == null) {
            return false;
        }
        double total = calculateTotalPrice();
        double deliveryCost = (delivery != null) ? delivery.deliver(items) : 0.0;
        return payment.pay(total + deliveryCost);
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }
}