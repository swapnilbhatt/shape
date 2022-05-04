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
    public EquilateralTriangle(Point p, int side) throws InvalidArgumentException {
        super(new Point[]{new Point(p.x, p.y),
                new Point(p.x + side, p.y),
                new Point(p.x + (side / 2), (p.y + (int) (side * Math.sqrt(3)) / 2))});
    }
}
