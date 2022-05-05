package lib;

import java.awt.*;

/**
 * Interface for all shape
 */
public interface Shape {
    /**
     * Calculates area of the Shape object
     *
     * @return Area of the Shape object
     */
    double getArea();

    /**
     * Calculates perimeter of the Shape object
     *
     * @return Perimeter of the Shape object
     */
    double getPerimeter();

    /**
     * Draws given object
     *
     */
    void draw();

    /**
     * Fills given object with specified border color and fill color
     */
    void fill();

    /**
     * Fills given object with specified border color and fill color
     * @param border Color of border color used for drawing the object
     * @param fill Color used for filling the object
     */
    void fill(Color border, Color fill);

    /**
     * Given object will get draw with this color
     * @param color Color of border color used for drawing the object
     */
    void setDrawColor(Color color);

    /**
     * Given object will get filled with this color
     * @param color Color of border color used for filling the object
     */
    void setFillColor(Color color);

    /**
     * Get draw color
     */
    Color getDrawColor();

    /**
     * Get fill color
     */
    Color getFillColor();
}
