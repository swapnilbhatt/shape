package lib;

public class Pentagon extends AbstractShape {
    private final double side;

    //s is side length of pentagon
    public Pentagon(double side) throws InvalidArgumentException {
        if (side <= 0)
            throw new InvalidArgumentException(this.invalidLengthMsg);

        this.side = side;
    }

    @Override
    public double getArea() {
        double area = (Math.sqrt(5 * (5 + 2 * (Math.sqrt(5)))) * this.side * this.side) / 4;
        return this.roundOff(area);
    }

    @Override
    public double getPerimeter() {
        double perimeter = 5.0 * this.side;
        return this.roundOff(perimeter);
    }
}
