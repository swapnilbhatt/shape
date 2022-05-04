package lib;

public class Octagon extends AbstractShape {
    private final double side;

    public Octagon(double side) throws InvalidArgumentException {
        if (side <= 0)
            throw new InvalidArgumentException(this.invalidLengthMsg);

        this.side = side;
    }

    @Override
    public double getArea() {
        double area = (2 * (1 + Math.sqrt(2)) * this.side * this.side);
        return this.roundOff(area);
    }

    @Override
    public double getPerimeter() {
        double perimeter = 8 * this.side;
        return this.roundOff(perimeter);
    }
}
