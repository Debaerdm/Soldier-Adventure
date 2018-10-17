package view;

import javafx.scene.Parent;
import javafx.scene.Scene;

public class SceneManager {
    private static SceneManager sceneManager;
    private Scene current;

    private SceneManager() { }

    public static SceneManager getInstance() {
        if (sceneManager == null) {
            sceneManager = new SceneManager();
        }

        return sceneManager;
    }

    public void setCurrent(Scene current) {
        this.current = current;
    }

    public void switchRootOfScene(Parent root) {
        this.current.setRoot(root);
    }
}
