package view;

import javafx.scene.layout.BorderPane;

public class StatusPane extends BorderPane implements ConfigurationComponent {

    private MapViewPort mapViewPort;
    private DescriptionScene descriptionScene;
    private BuildScene buildScene;

    public StatusPane() {
        this.mapViewPort = new MapViewPort();
        this.descriptionScene = new DescriptionScene();
        this.buildScene = new BuildScene();

        this.initComponent();
    }

    @Override
    public void initComponent() {
        this.setCenter(descriptionScene);
        this.setLeft(buildScene);
        this.setRight(mapViewPort);
    }
}
