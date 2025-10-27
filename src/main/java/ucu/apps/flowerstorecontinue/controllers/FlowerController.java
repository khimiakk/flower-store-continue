package ucu.apps.flowerstorecontinue.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ucu.apps.flowerstorecontinue.store.flower.Flower;
import ucu.apps.flowerstorecontinue.store.flower.FlowerColor;
import ucu.apps.flowerstorecontinue.store.flower.FlowerType;

@RestController
@RequestMapping("/flowers")
public class FlowerController {

    private static final double DEFAULT_PRICE = 100.0;
    private static final double DEFAULT_SEPAL_LENGTH = 50.0;

    @GetMapping
    public List<Flower> getFlowers() {
        Flower sampleFlower = new Flower(
            DEFAULT_PRICE,
            FlowerColor.GREEN,
            DEFAULT_SEPAL_LENGTH,
            FlowerType.CACTUS
        );
        return List.of(sampleFlower);
    }
}
