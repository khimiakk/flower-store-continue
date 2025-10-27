package ucu.apps.flower_store_continue.store.items;

import lombok.Getter;

@Getter
public abstract class Item {

    private String description;

    public abstract double price();

}