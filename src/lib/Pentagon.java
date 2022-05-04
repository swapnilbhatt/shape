package lib;

import java.awt.*;
import java.util.Arrays;

/**
 * Pentagon has five equal size edges
 * Class to create regular Pentagon whose all five sides are equal length
 */
public class Pentagon extends Polygon {
    private final double side;

    /**
     * Creates new instance of Pentagon with five equal size edges
     *
     * @param points Five points array to draw the Pentagon
     */
    public Pentagon(Point[] points) throws InvalidArgumentException {
        super(points, 5);
        this.side = this.getEuclideanDistance(points[0], points[1]);
    }

    /**
     * Calculates area of the Pentagon with provided side length
     *
     * @return Area of the Pentagon
     */
    @Override
    public double getArea() {
        double area = (Math.sqrt(5 * (5 + 2 * (Math.sqrt(5)))) * this.side * this.side) / 4;
        return this.roundOff(area);
    }

    /**
     * Calculates perimeter of the Pentagon with provided  side length
     *
     * @return Perimeter of the Pentagon
     */
    @Override
    public double getPerimeter() {
        double perimeter = 5.0 * this.side;
        return this.roundOff(perimeter);
    }
}
