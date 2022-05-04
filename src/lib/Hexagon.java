package lib;

/**
 * Hexagon has six equal size edges
 * Class to create regular Hexagon whose all six sides are equal length
 */
public class Hexagon extends Polygon {
    private final double side;

    /**
     * Creates new instance of Hexagon with six equal size edges
     *
     * @param points Six points array to draw the Heptagon
     */
    public Hexagon(Point[] points) throws InvalidArgumentException {
        super(points, 6);
        this.side = this.getEuclideanDistance(points[0], points[1]);
    }

    /**
     * Calculates area of the Hexagon with provided side length
     *
     * @return Area of the Hexagon
     */
    @Override
    public double getArea() {
        double area = ((3 * Math.sqrt(3) * (this.side * this.side)) / 2);
        return this.roundOff(area);
    }

    /**
     * Calculates perimeter of the Hexagon with provided  side length
     *
     * @return Perimeter of the Hexagon
     */
    @Override
    public double getPerimeter() {
        double perimeter = 6 * this.side;
        return this.roundOff(perimeter);
    }
}
