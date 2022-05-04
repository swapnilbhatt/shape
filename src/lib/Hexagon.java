package lib;

/**
 * Hexagon has six equal size edges
 * Class to create regular Hexagon whose all six sides are equal length
 */
public class Hexagon extends AbstractShape {
    private final double side;

    /**
     * Creates new instance of Hexagon with six equal size edges
     *
     * @param side Positive nonzero length of Hexagon
     */
    public Hexagon(double side) throws InvalidArgumentException {
        if (side <= 0)
            throw new InvalidArgumentException(this.invalidLengthMsg);

        this.side = side;
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
