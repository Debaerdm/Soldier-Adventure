package view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class MainMenu extends BorderPane {

    public MainMenu() {
        this.setBackground(new Background(new BackgroundFill(Color.BLACK, new CornerRadii(0), new Insets(0))));
        Button button = new Button("SoloPlayer");
        button.setMnemonicParsing(true);
        button.setStyle("-fx-background-color: darkgrey; -fx-border-width: 1px; -fx-border-color: black");
        button.setOnAction(e -> SceneManager.getInstance().switchRootOfScene(new GameView()));
        this.setCenter(button);
    }
}
