package lib;

import java.awt.*;

/**
 * Class to create Square which is type of Rectangle whose all four sides are of same width
 */
public class Square extends Rectangle {
    /**
     * Creates new instance of Square of given width
     *
     * @param p     Top left point of Square
     * @param width Positive nonzero width of Square
     */
    public Square(Point p, int width) throws InvalidArgumentException {
        super(p, width, width);
        this.setWindowTitle("Drawing a Square");
    }
}
