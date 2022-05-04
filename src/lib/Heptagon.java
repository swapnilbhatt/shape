package lib;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Heptagon has seven equal size edges
 * Class to create regular Heptagon whose all seven sides are equal length
 */
public class Heptagon extends Polygon {
    private final double side;

    /**
     * Creates new instance of Heptagon with seven equal size edges
     *
     * @param points Seven points array to draw the Heptagon
     */
    public Heptagon(Point[] points) throws InvalidArgumentException {
        super(points, 7);

        this.side = this.getEuclideanDistance(points[0], points[1]);
    }

    /**
     * Calculates area of the Heptagon with provided side length
     *
     * @return Area of the Heptagon
     */
    @Override
    public double getArea() {
        double area = 3.634 * Math.pow(this.side, 2);
        return this.roundOff(area);
    }

    /**
     * Calculates perimeter of the Heptagon with provided  side length
     *
     * @return Perimeter of the Heptagon
     */
    @Override
    public double getPerimeter() {
        double perimeter = 7.0 * this.side;
        return this.roundOff(perimeter);
    }
}
