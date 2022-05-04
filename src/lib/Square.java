package lib;

/**
 * Class to create Square which is type of Rectangle whose all four sides are of same width
 */
public class Square extends Rectangle {
    /**
     * Creates new instance of Square of given width
     *
     * @param width Positive nonzero width of Square
     */
    public Square(double width) throws InvalidArgumentException {
        super(width, width);
    }
}
