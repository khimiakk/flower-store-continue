package ucu.apps.flower_store_continue.store.items.flowers;

import ucu.apps.flower_store_continue.store.items.properties.FlowerColor;
import ucu.apps.flower_store_continue.store.items.properties.FlowerType;

public class CactusFlower extends Flower {

    public CactusFlower(Flower cactus) {
        super(cactus);
        this.setFlowerType(FlowerType.CACTUS);
        this.setColor(FlowerColor.GREEN);
    }

    public CactusFlower() {
        super();
        this.setFlowerType(FlowerType.CACTUS);
        this.setColor(FlowerColor.GREEN);
    }

}

