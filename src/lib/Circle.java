package lib;

import java.awt.*;

/**
 * Class to create Circle with given radius
 */
public class Circle extends AbstractShape {
    private final int radius;
    private final Point center;

    /**
     * Creates new instance of Circle with given radius
     *
     * @param radius Positive nonzero radius
     */
    public Circle(Point center, int radius) throws InvalidArgumentException {
        super("Drawing circle");

        if (radius <= 0)
            throw new InvalidArgumentException(this.invalidLengthMsg);

        this.radius = radius;
        this.center = center;
    }

    /**
     * Draws or fill a circle based on isFill parameter value
     * This is called while JFrame is getting rendered
     * @param g Graphic object
     */
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        if (this.isFill()) {
            g2d.setColor(this.getFillColor());
            g2d.drawOval(center.x, center.y, radius, radius);

            g2d.setColor(this.getBorderColor());
            g2d.fillOval(center.x, center.y, radius, radius);
        } else {
            g2d.drawOval(center.x, center.y, radius, radius);
        }
    }

    /**
     * Calculates area of the Circle with provided radius
     *
     * @return Area of the Circle
     */
    @Override
    public double getArea() {
        double area = Math.PI * this.radius * this.radius;
        return this.roundOff(area);
    }

    /**
     * Calculates perimeter of the Circle with provided radius
     *
     * @return Perimeter of the Circle
     */
    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * this.radius;
        return this.roundOff(perimeter);
    }
}
