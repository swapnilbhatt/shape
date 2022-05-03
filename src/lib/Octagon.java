package lib;

public class Octagon extends AbstractShape {
    private final double s;

    public Octagon(double s) {
        this.s = s;
    }

    @Override
    public double getArea() {
        return (2 * (1 + Math.sqrt(2)) * this.s * this.s);
    }

    @Override
    public double getPerimeter() {
        return 8 * this.s;
    }
}
