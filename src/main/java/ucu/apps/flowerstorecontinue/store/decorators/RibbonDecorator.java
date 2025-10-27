package ucu.apps.flowerstorecontinue.store.decorators;

import ucu.apps.flowerstorecontinue.store.flower.Item;

public class RibbonDecorator extends ItemDecorator {

    private static final double RIBBON_COST = 40.0;

    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with ribbon.";
    }

    @Override
    public double getPrice() {
        return RIBBON_COST + getItem().getPrice();
    }
}