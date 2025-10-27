package ucu.apps.flower_store_continue.store.decorators;

import ucu.apps.flower_store_continue.store.flower.Item;

public class BasketDecorator extends ItemDecorator {

    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " in basket.";
    }

    @Override
    public double getPrice() {
        return 4 + item.getPrice();
    }
}