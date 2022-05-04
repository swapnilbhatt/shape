package lib;

/**
 * EquilateralTriangle is a triangle whose all three sides are of same width
 */
public class EquilateralTriangle extends Triangle {
    /**
     * Creates new instance of Triangle of given three side lengths
     *
     * @param side Positive nonzero width of sides of EquilateralTriangle
     */
    public EquilateralTriangle(double side) throws InvalidArgumentException {
        super(side, side, side);
    }
}
