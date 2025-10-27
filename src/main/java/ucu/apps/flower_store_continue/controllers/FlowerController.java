package ucu.apps.flower_store_continue.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ucu.apps.flower_store_continue.store.flower.Flower;
import ucu.apps.flower_store_continue.store.flower.FlowerColor;
import ucu.apps.flower_store_continue.store.flower.FlowerType;

@RestController
@RequestMapping("/flowers")
public class FlowerController {

    @GetMapping
    public List<Flower> getFlowers() {
        return List.of(new Flower(100, FlowerColor.GREEN, 50, FlowerType.CACTUS));
    }
    
}