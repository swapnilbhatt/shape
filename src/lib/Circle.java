package lib;

public class Circle extends AbstractShape {
    private final double radius;

    public Circle(double radius) throws InvalidArgumentException {
        if (radius <= 0)
            throw new InvalidArgumentException(this.invalidLengthMsg);

        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * this.radius * this.radius;
        return this.roundOff(area);
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * this.radius;
        return this.roundOff(perimeter);
    }
}
