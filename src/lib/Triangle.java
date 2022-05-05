package lib;

import java.awt.*;
import java.util.Arrays;

/**
 * Class to create Triangle of given three side lengths
 */
public class Triangle extends Polygon {
    private final double[] sideLengths;

    public double[] getSideLengths() {
        return Arrays.copyOf(sideLengths, 3);
    }

    /**
     * Creates new instance of Triangle of given three side lengths
     *
     * @param points Three points array to draw the triangle
     */
    public Triangle(Point[] points) {
        super(points, 3);
        this.setWindowTitle("Drawing a Triangle");

        this.sideLengths = new double[3];

        this.sideLengths[0] = this.getEuclideanDistance(points[0], points[1]);
        this.sideLengths[1] = this.getEuclideanDistance(points[1], points[2]);
        this.sideLengths[2] = this.getEuclideanDistance(points[2], points[0]);
    }

    /**
     * Calculates area of the Triangle with given side lengths
     *
     * @return Area of the Triangle
     */
    @Override
    public double getArea() {
        double p = this.getPerimeter() / 2;
        double area = Math.sqrt(p * (p - this.sideLengths[0]) * (p - this.sideLengths[1]) * (p - this.sideLengths[2]));
        return this.roundOff(area);
    }

    /**
     * Calculates perimeter of the Triangle with given side lengths
     *
     * @return Perimeter of the Triangle
     */
    @Override
    public double getPerimeter() {
        double perimeter = Arrays.stream(this.sideLengths).sum();
        return this.roundOff(perimeter);
    }
}
