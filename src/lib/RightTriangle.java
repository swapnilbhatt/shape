package lib;

/**
 * Class to create RightTriangle who have angle between sides a and b of 90 degree
 */
public class RightTriangle extends Triangle {
    /**
     * Creates new instance of Rectangle of given width and height
     *
     * @param a Positive nonzero width of first side of triangle who forms 90 degree with second side
     * @param b Positive nonzero width of second side of triangle who forms 90 degree with first side
     */
    public RightTriangle(double a, double b) throws InvalidArgumentException {
        super(a, b, Math.sqrt(a * a + b * b));
    }
}
