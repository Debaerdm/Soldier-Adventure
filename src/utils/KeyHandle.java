package utils;

import javafx.scene.input.KeyCode;

@FunctionalInterface
public interface KeyHandle {
    void KeyBinding(KeyCode keyCode);
}
