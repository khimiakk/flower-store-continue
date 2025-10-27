package ucu.apps.flowerstorecontinue.delivery;

import java.util.List;

import ucu.apps.flowerstorecontinue.store.flower.Item;

public interface Delivery {
    double deliver(List<Item> items);
}