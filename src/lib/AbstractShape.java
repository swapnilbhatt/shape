package lib;

import javax.swing.*;
import java.awt.*;

/**
 * Abstact Class which implements Shape interface and provide
 * some utility functions used by all shape objects
 */
public abstract class AbstractShape extends JFrame implements Shape {
    final String invalidLengthMsg = "Please enter valid no of input points";

    private boolean isFill = false;
    final String windowTitle;
    final int windowWidth;
    final int windowHeight;

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

    AbstractShape(){
        this.windowHeight = 1200;
        this.windowWidth = 1600;
        this.windowTitle = "Drawing a shape";
    }

    AbstractShape(String title){
        this.windowHeight = 1200;
        this.windowWidth = 1600;
        this.windowTitle = title;
    }

    AbstractShape(int windowWidth, int windowHeight, String title){
        this.windowHeight = windowHeight;
        this.windowWidth = windowWidth;
        this.windowTitle = title;
    }

    @Override
    public void draw(){
        this.isFill = false;
        this.display();
    }

    @Override
    public void fill(Color border, Color fill){
        this.isFill = true;
        this.borderColor = border;
        this.fillColor = fill;
        this.display();
    }

    private void display(){
        this.setTitle(windowTitle);
        this.setSize(windowWidth, windowHeight);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    double getEuclideanDistance(Point p1, Point p2){
        return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
    }

    /**
     * Round off decimal value to 2 decimal places
     *
     * @param value Input Decimal value
     * @return decimal value with 2 decimal places of input decimal value
     */
    //
    double roundOff(double value) {
        return (double) Math.round(value * 100) / 100;
    }
}
