package ucu.apps.flower_store_continue.store.flower;

public class RomashkaFlower extends Flower {
    public RomashkaFlower(Flower base) {
        super(base);
        setFlowerType(FlowerType.ROMASHKA);
    }
    public RomashkaFlower() {
        setFlowerType(FlowerType.ROMASHKA);
    }
}
