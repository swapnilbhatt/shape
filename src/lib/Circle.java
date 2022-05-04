package lib;

/**
 * Class to create Circle with given radius
 */
public class Circle extends AbstractShape {
    private final double radius;

    /**
     * Creates new instance of Circle with given radius
     *
     * @param radius Positive nonzero radius
     */
    public Circle(double radius) throws InvalidArgumentException {
        if (radius <= 0)
            throw new InvalidArgumentException(this.invalidLengthMsg);

        this.radius = radius;
    }

    /**
     * Calculates area of the Circle with provided radius
     *
     * @return Area of the Circle
     */
    @Override
    public double getArea() {
        double area = Math.PI * this.radius * this.radius;
        return this.roundOff(area);
    }

    /**
     * Calculates perimeter of the Circle with provided radius
     *
     * @return Perimeter of the Circle
     */
    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * this.radius;
        return this.roundOff(perimeter);
    }
}
