package ucu.apps.flowerstorecontinue.store.flower;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Flower extends Item {

    private FlowerColor color;
    private FlowerType type;
    private double sepalLength;
    private double price;

    public Flower(Flower flower) {
        this.color = flower.color;
        this.type = flower.type;
        this.sepalLength = flower.sepalLength;
        this.price = flower.price;
    }

    public Flower(double price,
                  FlowerColor color,
                  double sepalLength,
                  FlowerType type) {
        this.price = price;
        this.color = color;
        this.sepalLength = sepalLength;
        this.type = type;
    }

    public String getColorCode() {
        return color.getCode();
    }

    public FlowerType getFlowerType() {
        return type;
    }

    public void setFlowerType(FlowerType flowerType) {
        this.type = flowerType;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return toString();
    }

    @Override
    public String toString() {
        return "Flower{"
            + "type=" + type
            + ", color=" + color
            + ", sepalLength=" + sepalLength
            + ", price=" + price
            + '}';
    }
}
