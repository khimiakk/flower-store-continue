package ucu.apps.flowerstorecontinue.store.flower;

import java.util.List;
import java.util.ArrayList;

public class FlowerBucket {
    private List<FlowerPack> flowerPacks;

    public FlowerBucket() {
        this.flowerPacks = new ArrayList<>();
    }

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        return flowerPacks.stream()
            .mapToDouble(pack -> pack.getPrice())
            .sum();
    }

    public List<FlowerType> getAllFlowerTypes() {
        List<FlowerType> allTypes = new ArrayList<>();
        for (FlowerPack pack : flowerPacks) {
            allTypes.add(pack.getPackFlowerType());
        }
        return allTypes;
    }

    public boolean searchFlower(Flower sampleFlower) {
        for (FlowerPack pack: flowerPacks) {
            Flower flower = pack.getFlower();
            if (flower.equals(sampleFlower)) {
                return true;
            }
        }
        return false;
    }

    public void addFlowers(List<Flower> flowers, int amountEach) {
        for (Flower flower : flowers) {
            flowerPacks.add(new FlowerPack(flower, amountEach));
        }
    }

}
