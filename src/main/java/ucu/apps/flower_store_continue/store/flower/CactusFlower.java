package ucu.apps.flower_store_continue.store.flower;

public class CactusFlower extends Flower {
    
    public CactusFlower(Flower cactus) {
        super(cactus);
        setFlowerType(FlowerType.CACTUS);
        setColor(FlowerColor.GREEN);
    }

    public CactusFlower() {
        setFlowerType(FlowerType.CACTUS);
    }
}
