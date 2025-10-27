package ucu.apps.flower_store_continue.store.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
