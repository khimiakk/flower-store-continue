package ucu.apps.flowerstorecontinue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import ucu.apps.flowerstorecontinue.delivery.DHLDeliveryStrategy;
import ucu.apps.flowerstorecontinue.delivery.PostDeliveryStrategy;
import ucu.apps.flowerstorecontinue.store.flower.Flower;
import ucu.apps.flowerstorecontinue.store.flower.FlowerColor;
import ucu.apps.flowerstorecontinue.store.flower.FlowerType;
import ucu.apps.flowerstorecontinue.store.flower.Item;

import java.util.List;
import java.util.ArrayList;

public class DeliveryTest {

    private static final double DELTA = 0.01;
    private static final double ZERO = 0;
    private static final int EIGHT = 8;
    private static final int THREE = 3;
    private static final int FIVE = 5;
    private static final int TWENTY = 20;
    private static final int EIGHTY = 80;

    @Test
    public void testDHLDelivery() {
        DHLDeliveryStrategy dhlStrategy = new DHLDeliveryStrategy();
        List<Item> items = new ArrayList<>();

        double cost = dhlStrategy.deliver(items);
        Assertions.assertEquals(ZERO, cost, DELTA);
    }

    @Test
    public void testPostDelivery() {
        PostDeliveryStrategy postStrategy = new PostDeliveryStrategy();
        List<Item> items = new ArrayList<>();

        double cost = postStrategy.deliver(items);
        Assertions.assertEquals(ZERO, cost, DELTA);
    }

    @Test
    public void postFivePercentOfSum() {
        Item a = new Flower(
            EIGHTY,
            FlowerColor.GREEN,
            EIGHT,
            FlowerType.CACTUS
        );
        Item b = new Flower(
            TWENTY,
            FlowerColor.WHITE,
            THREE,
            FlowerType.ROMASHKA
        );

        double cost = new PostDeliveryStrategy()
            .deliver(List.of(a, b));

        Assertions.assertEquals(FIVE, cost, DELTA);
    }
}
