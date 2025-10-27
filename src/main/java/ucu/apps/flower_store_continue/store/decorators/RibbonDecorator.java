package ucu.apps.flower_store_continue.store.decorators;

import ucu.apps.flower_store_continue.store.items.Item;

public class RibbonDecorator extends Decorator{

    private final Item item;

    public RibbonDecorator(Item item) {
        this.item = item;
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " + added ribbon.";
    }

    @Override
    public double price() {
        return item.price() + 40.0;
    }
}