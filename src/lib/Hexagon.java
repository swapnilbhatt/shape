package lib;

public class Hexagon extends AbstractShape {
    private final double s;

    public Hexagon(double s) {
        this.s = s;
    }

    @Override
    public double getArea() {
        return ((3 * Math.sqrt(3) * (this.s * this.s)) / 2);
    }

    @Override
    public double getPerimeter() {
        return 6 * this.s;
    }
}
