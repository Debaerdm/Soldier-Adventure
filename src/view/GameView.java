package view;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;

public class GameView extends BorderPane implements ConfigurationComponent{

    private StatusPane statusPane;
    private ToolBar toolBar;

    public GameView() {
        this.statusPane = new StatusPane();
        this.toolBar = new ToolBar();
        this.initComponent();
    }

    @Override
    public void initComponent() {
        this.setBottom(statusPane);
        this.setTop(toolBar);
    }
}
