package lib;

public class Heptagon extends AbstractShape {
    private final double side;

    public Heptagon(double side) throws InvalidArgumentException {
        if (side <= 0)
            throw new InvalidArgumentException(this.invalidLengthMsg);

        this.side = side;
    }

    @Override
    public double getArea() {
        double area = 3.634 * this.side * this.side;
        return this.roundOff(area);
    }

    @Override
    public double getPerimeter() {
        double perimeter = 7.0 * this.side;
        return this.roundOff(perimeter);
    }
}
