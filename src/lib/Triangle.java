package lib;

public class Triangle extends AbstractShape {
    private final double a, b, c;

    public Triangle(double a, double b, double c) throws InvalidArgumentException {
        if (a <= 0 || b <= 0 || c <= 0)
            throw new InvalidArgumentException(this.invalidLengthMsg);

        this.a = a;
        this.b = b;
        this.c = c;
    }

    // The area of a triangle with 3 sides a, b and c is,
    // Area = square root of (p*(p-a)*(p-b)*(p-c)) (where p = (a+b+c)/2).
    @Override
    public double getArea() {
        double p = (this.a + this.b + this.c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return this.roundOff(area);
    }

    @Override
    public double getPerimeter() {
        double perimeter = this.a + this.b + this.c;
        return this.roundOff(perimeter);
    }
}
