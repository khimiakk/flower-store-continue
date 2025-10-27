package ucu.apps.flower_store_continue.store.decorators;

import ucu.apps.flower_store_continue.store.items.Item;

public class PaperDecorator extends Decorator{

    private final Item item;

    public PaperDecorator(Item item) {
        this.item = item;
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " + added paper deco.";
    }

    @Override
    public double price() {
        return item.price() + 13.0;
    }
}
