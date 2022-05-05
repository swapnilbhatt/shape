package lib;

import java.awt.*;
import java.util.Arrays;

/**
 * Class to create regular Octagon whose all eight sides are equal length
 */
public class Octagon extends RegularPolygon {
    private final Point[] vertices;
    private final int NO_OF_VERTICES = 8;
    private final float radius;

    /**
     * Creates new instance of Octagon with six equal size edges
     *
     * @param center Center point to draw the Heptagon
     * @param radius Radius from center to draw the Heptagon
     */
    public Octagon(Point center, float radius) {
        super(8);
        this.setWindowTitle("Drawing an Octagon");
        this.radius = radius;
        vertices = calculateVertices(center, radius, NO_OF_VERTICES);
    }

    /**
     * Calculates area of the Octagon with provided side length
     *
     * @return Area of the Octagon
     */
    @Override
    public double getArea() {
        return area(NO_OF_VERTICES, radius);
    }

    /**
     * Calculates perimeter of the Octagon with provided  side length
     *
     * @return Perimeter of the Octagon
     */
    @Override
    public double getPerimeter() {
        return perimeter(vertices);
    }
}
