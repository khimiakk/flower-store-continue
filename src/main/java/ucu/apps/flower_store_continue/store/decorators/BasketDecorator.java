package ucu.apps.flower_store_continue.store.decorators;

import lombok.ToString;
import ucu.apps.flower_store_continue.store.items.Item;;

@ToString
public class BasketDecorator extends Decorator {
    private static final double BASKET_PRICE = 4;
    private Item item;

    public BasketDecorator(Item item) {
        this.item = item;
    }

    public double price() {
        return BASKET_PRICE + item.price();
    }

    public String getDescription() {
        return item.getDescription() + "Wrapped in basket decorator";
    }
}