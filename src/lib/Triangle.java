package lib;

public class Triangle extends AbstractShape {
    private final Point p1, p2, p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    // The area of a triangle with 3 sides a, b and c is,
    // Area = square root of (p*(p-a)*(p-b)*(p-c)) (where p = (a+b+c)/2).
    @Override
    public double getArea() {
        double a = this.getDistance(p1, p2);
        double b = this.getDistance(p2, p3);
        double c = this.getDistance(p3, p1);

        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }


    @Override
    public double getPerimeter() {
        double d1 = this.getDistance(p1, p2);
        double d2 = this.getDistance(p2, p3);
        double d3 = this.getDistance(p3, p1);

        return d1 + d2 + d3;
    }
}
