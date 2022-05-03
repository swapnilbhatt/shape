package lib;

public class Rectangle extends AbstractShape {
    private final double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        double area = this.width * this.height;
        return this.roundOff(area);
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * (this.width + this.height);
        return this.roundOff(perimeter);
    }
}
