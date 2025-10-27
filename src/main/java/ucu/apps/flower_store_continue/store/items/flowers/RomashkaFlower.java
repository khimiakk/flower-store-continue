package ucu.apps.flower_store_continue.store.items.flowers;

import ucu.apps.flower_store_continue.store.items.properties.FlowerType;

public class RomashkaFlower extends Flower {
    public RomashkaFlower(Flower chamomile) {
        super(chamomile);
        this.setFlowerType(FlowerType.ROMASHKA);
    }

    public RomashkaFlower() {
        super();
        this.setFlowerType(FlowerType.ROMASHKA);
    }

}