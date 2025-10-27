package ucu.apps.flowerstorecontinue.store.decorators;

import ucu.apps.flowerstorecontinue.store.flower.Item;

public class BasketDecorator extends ItemDecorator {

    private static final double BASKETCOST = 4.0;

    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " in basket.";
    }

    @Override
    public double getPrice() {
        return BASKETCOST + getItem().getPrice();
    }
}