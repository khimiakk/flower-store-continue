package ucu.apps.flower_store_continue.delivery;

import java.util.List;

import ucu.apps.flower_store_continue.store.flower.Item;

public interface Delivery {
    double deliver(List<Item> items);
}