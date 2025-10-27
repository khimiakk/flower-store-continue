package ucu.apps.flower_store_continue.store.items;

import java.util.List;

import ucu.apps.flower_store_continue.store.items.properties.FlowerType;

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
}
