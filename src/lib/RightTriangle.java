package lib;

public class RightTriangle extends Triangle {
    //Acute triangle have angle between sides a and b of 90 degree
    public RightTriangle(double a, double b) throws InvalidArgumentException {
        super(a, b, Math.sqrt(a * a + b * b));
    }
}
