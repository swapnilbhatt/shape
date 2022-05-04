package lib;

/**
 * Class to create regular Octagon whose all six sides are equal length
 */
public class Octagon extends AbstractShape {
    private final double side;

    /**
     * Creates new instance of Octagon with six equal size edges
     *
     * @param side Positive nonzero length of Octagon
     */
    public Octagon(double side) throws InvalidArgumentException {
        if (side <= 0)
            throw new InvalidArgumentException(this.invalidLengthMsg);

        this.side = side;
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
