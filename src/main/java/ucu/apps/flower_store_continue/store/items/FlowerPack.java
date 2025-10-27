package ucu.apps.flower_store_continue.store.items;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ucu.apps.flower_store_continue.store.items.flowers.Flower;
import ucu.apps.flower_store_continue.store.items.properties.FlowerType;

@Getter 
@Setter 
@NoArgsConstructor 
@AllArgsConstructor
public class FlowerPack {
    private Flower flower;
    private int amount;

    public double getPrice() {
        return flower.getPrice() * amount;
    }

    public FlowerType getPackFlowerType() {
        return flower.getFlowerType();
    }
}
