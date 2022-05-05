package lib;

import java.awt.*;
import java.util.Arrays;

/**
 * Class to create Triangle of given three side lengths
 */
public class Triangle extends Polygon {
    private final double a, b, c;

    /**
     * Creates new instance of Triangle of given three side lengths
     *
     * @param points Three points array to draw the triangle
     */
    public Triangle(Point[] points) {
        super(points, 3);

        this.a = this.getEuclideanDistance(points[0], points[1]);
        this.b = this.getEuclideanDistance(points[1], points[2]);
        this.c = this.getEuclideanDistance(points[2], points[0]);
    }

    /**
     * Calculates area of the Triangle with given side lengths
     *
     * @return Area of the Triangle
     */
    @Override
    public double getArea() {
        double p = (this.a + this.b + this.c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return this.roundOff(area);
    }

    /**
     * Calculates perimeter of the Triangle with given side lengths
     *
     * @return Perimeter of the Triangle
     */
    @Override
    public double getPerimeter() {
        double perimeter = this.a + this.b + this.c;
        return this.roundOff(perimeter);
    }
}
