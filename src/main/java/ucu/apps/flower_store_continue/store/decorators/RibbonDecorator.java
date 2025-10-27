package ucu.apps.flower_store_continue.store.decorators;

import ucu.apps.flower_store_continue.store.flower.Item;

public class RibbonDecorator extends ItemDecorator {

    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with ribbon.";
    }

    @Override
    public double getPrice() {
        return 40 + item.getPrice();
    }
}