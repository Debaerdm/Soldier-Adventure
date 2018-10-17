package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Scene scene = new Scene(new GridPane(), 800, 600);
        SceneManager.getInstance().setCurrent(scene);
        primaryStage.setTitle("Pacman");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
        SceneManager.getInstance().switchRootOfScene(new MainMenu());
    }


    public static void main(String[] args) {
        launch(args);
    }
}
