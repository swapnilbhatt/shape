package lib;

public class Pentagon extends AbstractShape {
    private final double s;

    //s is side length of pentagon
    public Pentagon(double s) {
        this.s = s;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(5 * (5 + 2 * (Math.sqrt(5)))) * this.s * this.s) / 4;
    }

    @Override
    public double getPerimeter() {
        return 5.0 * this.s;
    }
}
