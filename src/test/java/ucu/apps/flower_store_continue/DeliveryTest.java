package ucu.apps.flower_store_continue;

import org.junit.jupiter.api.Test;

import ucu.apps.flower_store_continue.delivery.DHLDeliveryStrategy;
import ucu.apps.flower_store_continue.delivery.PostDeliveryStrategy;
import ucu.apps.flower_store_continue.store.flower.Flower;
import ucu.apps.flower_store_continue.store.flower.FlowerColor;
import ucu.apps.flower_store_continue.store.flower.FlowerType;
import ucu.apps.flower_store_continue.store.flower.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import java.util.ArrayList;

public class DeliveryTest {

    @Test
    public void testDHLDelivery() {
        DHLDeliveryStrategy dhlStrategy = new DHLDeliveryStrategy();
        List<Item> items = new ArrayList<>();

        double cost = dhlStrategy.deliver(items);
        assertEquals(0.0, cost, 0.01);
    }

    @Test
    public void testPostDelivery() {
        PostDeliveryStrategy postStrategy = new PostDeliveryStrategy();
        List<Item> items = new ArrayList<>();

        double cost = postStrategy.deliver(items);
        assertEquals(0.0, cost, 0.01);
    }

    @Test
    public void postFivePercentOfSum() {
        Item a = new Flower(80, FlowerColor.GREEN, 8, FlowerType.CACTUS);
        Item b = new Flower(20, FlowerColor.WHITE, 3, FlowerType.ROMASHKA);
        double cost = new PostDeliveryStrategy().deliver(List.of(a, b));
        assertEquals(5.0, cost, 0.01);
    }
}
