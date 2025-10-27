package ucu.apps.flower_store_continue.delivery;

import ucu.apps.flower_store_continue.store.items.Item;

import java.util.List;

public interface Delivery {
    double deliver(List<Item> items);
}