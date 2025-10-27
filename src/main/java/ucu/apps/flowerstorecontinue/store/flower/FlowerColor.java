package ucu.apps.flowerstorecontinue.store.flower;

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
