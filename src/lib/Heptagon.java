package lib;

public class Heptagon extends AbstractShape {
    private final double s;

    public Heptagon(double s) {
        this.s = s;
    }

    @Override
    public double getArea() {
        return 3.634 * this.s * this.s;
    }

    @Override
    public double getPerimeter() {
        return 7.0 * this.s;
    }
}
