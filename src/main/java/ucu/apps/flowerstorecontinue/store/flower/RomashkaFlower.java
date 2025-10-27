package ucu.apps.flowerstorecontinue.store.flower;

public class RomashkaFlower extends Flower {
    public RomashkaFlower(Flower base) {
        super(base);
        setFlowerType(FlowerType.ROMASHKA);
    }
    public RomashkaFlower() {
        setFlowerType(FlowerType.ROMASHKA);
    }
}
