package lib;

import java.awt.*;

/**
 * Class to create RightTriangle who have angle between sides a and b of 90 degree
 */
public class RightTriangle extends Triangle {
    /**
     * Creates new instance of Rectangle of given width and height
     *
     * @param p starting point to draw the triangle
     * @param a Positive nonzero width of first side of triangle who forms 90 degree with second side
     * @param b Positive nonzero width of second side of triangle who forms 90 degree with first side
     */
    public RightTriangle(Point p, int a, int b) {
        super(new Point[]{new Point(p.x, p.y), new Point(p.x + a, p.y), new Point(p.x, p.y + b)});
        this.setWindowTitle("Drawing a RightTriangle");
    }
}
