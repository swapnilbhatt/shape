package lib;

import javax.swing.*;
import java.awt.*;

/**
 * Abstact Class which implements Shape interface and provide
 * some utility functions used by all shape objects
 */
public abstract class AbstractShape extends JFrame implements Shape {
    private boolean isFill = false;
    private String windowTitle;
    private final int windowWidth, windowHeight;
    private Color borderColor, fillColor;

    public boolean isFill() {
        return isFill;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public Color getFillColor() {
        return fillColor;
    }

    public void setWindowTitle(String windowTitle) {
        this.windowTitle = windowTitle;
    }

    public AbstractShape() {
        this.windowHeight = 1200;
        this.windowWidth = 1600;
        this.windowTitle = "Drawing a shape";
    }

    @Override
    public void draw() {
        this.isFill = false;
        this.display();
    }

    @Override
    public void fill(Color border, Color fill) {
        this.isFill = true;
        this.borderColor = border;
        this.fillColor = fill;
        this.display();
    }

    private void display() {
        this.setTitle(windowTitle);
        this.setSize(windowWidth, windowHeight);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public double getEuclideanDistance(Point p1, Point p2) {
        return roundOff(Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2)));
    }

    /**
     * Round off decimal value to 2 decimal places
     *
     * @param value Input Decimal value
     * @return decimal value with 2 decimal places of input decimal value
     */
    //
    public double roundOff(double value) {
        return (double) Math.round(value * 100) / 100;
    }
}
