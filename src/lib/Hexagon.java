package lib;

import java.awt.*;

/**
 * Hexagon has six equal size edges
 * Class to create regular Hexagon whose all six sides are equal length
 */
public class Hexagon extends RegularPolygon {
    private final Point[] vertices;
    private final int NO_OF_VERTICES = 6;
    private final float radius;

    /**
     * Creates new instance of Hexagon with six equal size edges
     *
     * @param center Center point to draw the Heptagon
     * @param radius Radius from Center point to draw the Heptagon
     */
    public Hexagon(Point center, float radius) {
        super(6);
        this.setWindowTitle("Drawing a Hexagon");
        this.radius = radius;
        vertices = calculateVertices(center, radius, NO_OF_VERTICES);
    }

    /**
     * Calculates area of the Hexagon with provided side length
     *
     * @return Area of the Hexagon
     */
    @Override
    public double getArea() {
        return area(NO_OF_VERTICES, radius);
    }

    /**
     * Calculates perimeter of the Hexagon with provided  side length
     *
     * @return Perimeter of the Hexagon
     */
    @Override
    public double getPerimeter() {
        return perimeter(vertices);
    }
}
