package lib;

import java.awt.*;
import java.util.Arrays;

/**
 * Pentagon has five equal size edges
 * Class to create regular Pentagon whose all five sides are equal length
 */
public class Pentagon extends RegularPolygon  {
    private final Point[] vertices;
    private final int NO_OF_VERTICES = 5;
    private final float radius;

    /**
     * Creates new instance of Pentagon with five equal size edges
     *
     * @param center Center point to draw the Pentagon
     * @param radius Radius from center point to draw the Pentagon
     */
    public Pentagon(Point center, float radius) {
        super(5);
        this.setWindowTitle("Drawing a Pentagon");
        this.radius = radius;
        vertices = calculateVertices(center, radius, NO_OF_VERTICES);
    }

    /**
     * Calculates area of the Pentagon with provided side length
     *
     * @return Area of the Pentagon
     */
    @Override
    public double getArea() {
        return area(NO_OF_VERTICES, radius);
    }

    /**
     * Calculates perimeter of the Pentagon with provided  side length
     *
     * @return Perimeter of the Pentagon
     */
    @Override
    public double getPerimeter() {
        return perimeter(vertices);
    }
}
