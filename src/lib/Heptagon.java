package lib;

public class Heptagon extends AbstractShape {
    private final double s;

    public Heptagon(double s) {
        this.s = s;
    }

    @Override
    public double getArea() {
        double area = 3.634 * this.s * this.s;
        return this.roundOff(area);
    }

    @Override
    public double getPerimeter() {
        double perimeter = 7.0 * this.s;
        return this.roundOff(perimeter);
    }
}
