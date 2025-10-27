package ucu.apps.flowerstorecontinue.store.decorators;

import ucu.apps.flowerstorecontinue.store.flower.Item;

public class PaperDecorator extends ItemDecorator {

    private static final double PAPER_COST = 13.0;

    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " in paper.";
    }

    @Override
    public double getPrice() {
        return PAPER_COST + getItem().getPrice();
    }
}
