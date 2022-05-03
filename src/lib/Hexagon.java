package lib;

public class Hexagon extends AbstractShape {
    private final double s;

    public Hexagon(double s) {
        this.s = s;
    }

    @Override
    public double getArea() {
        double area = ((3 * Math.sqrt(3) * (this.s * this.s)) / 2);
        return this.roundOff(area);
    }

    @Override
    public double getPerimeter() {
        double perimeter = 6 * this.s;
        return this.roundOff(perimeter);
    }
}
