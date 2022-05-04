package lib;

/**
 * Pentagon has five equal size edges
 * Class to create regular Pentagon whose all five sides are equal length
 */
public class Pentagon extends AbstractShape {
    private final double side;

    /**
     * Creates new instance of Pentagon with five equal size edges
     *
     * @param side Positive nonzero length of Pentagon
     */
    public Pentagon(double side) throws InvalidArgumentException {
        if (side <= 0)
            throw new InvalidArgumentException(this.invalidLengthMsg);

        this.side = side;
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
