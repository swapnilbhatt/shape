package lib;

/**
 * Heptagon has seven equal size edges
 * Class to create regular Heptagon whose all seven sides are equal length
 */
public class Heptagon extends AbstractShape {
    private final double side;

    /**
     * Creates new instance of Heptagon with seven equal size edges
     *
     * @param side Positive nonzero length of Heptagon
     */
    public Heptagon(double side) throws InvalidArgumentException {
        if (side <= 0)
            throw new InvalidArgumentException(this.invalidLengthMsg);

        this.side = side;
    }

    /**
     * Calculates area of the Heptagon with provided side length
     *
     * @return Area of the Heptagon
     */
    @Override
    public double getArea() {
        double area = 3.634 * this.side * this.side;
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
