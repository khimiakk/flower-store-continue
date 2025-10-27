package ucu.apps.flower_store_continue.store.items.properties;

import lombok.Getter;

@Getter
public enum FlowerColor {
    GREEN("#008000"), 
    WHITE("#FFFFFF");

    private final String code;

    FlowerColor(String code) {
        this.code = code;
    }
}
