package ucu.apps.flowerstorecontinue.store.decorators;

import ucu.apps.flowerstorecontinue.store.flower.Item;

public abstract class ItemDecorator extends Item {

    private final Item item;

    protected ItemDecorator(Item item) {
        this.item = item;
    }

    protected Item getItem() {
        return item;
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }
}
