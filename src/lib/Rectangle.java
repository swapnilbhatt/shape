package lib;

/**
 * Class to create Rectangle who has opposite sides parallel to each other and of equal size
 */
public class Rectangle extends Polygon {
    private final int width, height;

    /**
     * Creates new instance of Rectangle of given width and height
     *
     * @param width  Positive nonzero width of Rectangle
     * @param height Positive nonzero height of Rectangle
     */
    public Rectangle(Point p, int width, int height) throws InvalidArgumentException {
        super(new Point[]{p, new Point(p.x + width, p.y),
                new Point(p.x + width, p.y + height), new Point(p.x, p.y + height)}, 4);

        if (width <= 0 || height <= 0)
            throw new InvalidArgumentException(this.invalidLengthMsg);

        this.width = width;
        this.height = height;
    }

    /**
     * Calculates area of the Rectangle with given width and height
     *
     * @return Area of the Rectangle
     */
    @Override
    public double getArea() {
        double area = this.width * this.height;
        return this.roundOff(area);
    }

    /**
     * Calculates perimeter of the Rectangle with given width and height
     *
     * @return Perimeter of the Rectangle
     */
    @Override
    public double getPerimeter() {
        double perimeter = 2 * (this.width + this.height);
        return this.roundOff(perimeter);
    }
}
