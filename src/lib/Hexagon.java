package lib;

public class Hexagon extends AbstractShape {
    private final double side;

    public Hexagon(double side) throws InvalidArgumentException {
        if (side <= 0)
            throw new InvalidArgumentException(this.invalidLengthMsg);

        this.side = side;
    }

    @Override
    public double getArea() {
        double area = ((3 * Math.sqrt(3) * (this.side * this.side)) / 2);
        return this.roundOff(area);
    }

    @Override
    public double getPerimeter() {
        double perimeter = 6 * this.side;
        return this.roundOff(perimeter);
    }
}
