package lib;

public class AcuteTriangle extends Triangle {
    public AcuteTriangle(double a, double b) {
        super(a, b, Math.sqrt(a * a + b * b));
    }
}
