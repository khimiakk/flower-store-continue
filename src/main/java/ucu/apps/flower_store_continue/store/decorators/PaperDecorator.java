package ucu.apps.flower_store_continue.store.decorators;

import ucu.apps.flower_store_continue.store.flower.Item;

public class PaperDecorator extends ItemDecorator {

    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " in paper.";
    }

    @Override
    public double getPrice() {
        return 13 + item.getPrice();
    }
}
