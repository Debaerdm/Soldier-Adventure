package model;

import javafx.beans.NamedArg;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import utils.Constants;

public abstract class GameObject {

    private Node view;
    private Point2D velocity = new Point2D(0,0);

    protected GameObject(@NamedArg("view") Node view) {
        this.view = view;
    }

    public double getRotate() {
        return this.view.getRotate();
    }

    public void rotateRight() {
        this.view.setRotate(this.getRotate() + Constants.UNIT_ROTATE);
    }

    public void rotateLeft() {
        this.view.setRotate(this.getRotate() - Constants.UNIT_ROTATE);
    }
}
