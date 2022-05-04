package lib;

/**
 * Class to create Triangle of given three side lengths
 */
public class Triangle extends AbstractShape {
    private final double a, b, c;

    /**
     * Creates new instance of Triangle of given three side lengths
     *
     * @param a Positive nonzero width of first side of Triangle
     * @param b Positive nonzero width of second side of Triangle
     * @param c Positive nonzero width of third side of Triangle
     */
    public Triangle(double a, double b, double c) throws InvalidArgumentException {
        if (a <= 0 || b <= 0 || c <= 0)
            throw new InvalidArgumentException(this.invalidLengthMsg);

        this.a = a;
        this.b = b;
        this.c = c;
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
