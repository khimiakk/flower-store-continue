package ucu.apps.flower_store_continue.store.items.flowers;

import lombok.Data;
import lombok.NoArgsConstructor;
import ucu.apps.flower_store_continue.store.items.properties.FlowerColor;
import ucu.apps.flower_store_continue.store.items.properties.FlowerType;

@Data
@NoArgsConstructor
public class Flower {

    private FlowerColor color;
    private double price;
    private double sepalLength;

    private FlowerType flowerType;

    public Flower(Flower other) {
        this.color = other.color;
        this.price = other.price;
        this.sepalLength = other.sepalLength;
        this.flowerType = other.flowerType;
    }

    public String getColor() {
        return color.getCode();
    }
    
}
