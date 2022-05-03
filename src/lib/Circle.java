package lib;

public class Circle extends AbstractShape {
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        double area = Math.PI * this.r * this.r;
        return this.roundOff(area);
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * this.r;
        return this.roundOff(perimeter);
    }
}
