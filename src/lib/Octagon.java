package lib;

import java.awt.*;
import java.util.Arrays;

/**
 * Class to create regular Octagon whose all eight sides are equal length
 */
public class Octagon extends Polygon {
    private final double side;

    /**
     * Creates new instance of Octagon with six equal size edges
     *
     * @param points Eight points array to draw the Heptagon
     */
    public Octagon(Point[] points) throws InvalidArgumentException {
        super(points, 8);
        this.side = this.getEuclideanDistance(points[0], points[1]);
    }

    /**
     * Calculates area of the Octagon with provided side length
     *
     * @return Area of the Octagon
     */
    @Override
    public double getArea() {
        double area = (2 * (1 + Math.sqrt(2)) * this.side * this.side);
        return this.roundOff(area);
    }

    /**
     * Calculates perimeter of the Octagon with provided  side length
     *
     * @return Perimeter of the Octagon
     */
    @Override
    public double getPerimeter() {
        double perimeter = 8 * this.side;
        return this.roundOff(perimeter);
    }
}
