package lib;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Heptagon has seven equal size edges
 * Class to create regular Heptagon whose all seven sides are equal length
 */
public class Heptagon extends RegularPolygon {
    private final Point[] vertices;
    private final int NO_OF_VERTICES = 7;
    private final float radius;

    /**
     * Creates new instance of Heptagon with seven equal size edges
     *
     * @param center Center point to draw the Heptagon
     * @param radius radius from Center point to draw the Heptagon
     */
    public Heptagon(Point center, float radius) {
        super(7);
        this.setWindowTitle("Drawing a Heptagon");
        this.radius = radius;
        vertices = calculateVertices(center, radius, NO_OF_VERTICES);
    }

    /**
     * Calculates area of the Heptagon with provided side length
     *
     * @return Area of the Heptagon
     */
    @Override
    public double getArea() {
        return area(NO_OF_VERTICES, radius);
    }

    /**
     * Calculates perimeter of the Heptagon with provided  side length
     *
     * @return Perimeter of the Heptagon
     */
    @Override
    public double getPerimeter() {
        return perimeter(vertices);
    }
}
