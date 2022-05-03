package lib;

public class Octagon extends AbstractShape {
    private final double s;

    public Octagon(double s) {
        this.s = s;
    }

    @Override
    public double getArea() {
        double area = (2 * (1 + Math.sqrt(2)) * this.s * this.s);
        return this.roundOff(area);
    }

    @Override
    public double getPerimeter() {
        double perimeter = 8 * this.s;
        return this.roundOff(perimeter);
    }
}
