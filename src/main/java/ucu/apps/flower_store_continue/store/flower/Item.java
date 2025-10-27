package ucu.apps.flower_store_continue.store.flower;

import lombok.Getter;

@Getter
public abstract class Item {

    private String description;

    public abstract double getPrice();

    public String getDescription() {
        return description;
    }

}