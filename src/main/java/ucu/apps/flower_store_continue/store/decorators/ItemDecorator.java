package ucu.apps.flower_store_continue.store.decorators;

import ucu.apps.flower_store_continue.store.flower.Item;

public abstract class ItemDecorator extends Item {
    protected final Item item;

    protected ItemDecorator(Item item) {
        this.item = item;
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }

}
