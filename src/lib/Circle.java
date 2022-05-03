package lib;

public class Circle extends AbstractShape {
    private final int r;

    public Circle(Point c, int r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * this.r * this.r;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.r;
    }
}
