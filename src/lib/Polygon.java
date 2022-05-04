package lib;

import java.awt.*;
import java.util.Arrays;

public abstract class Polygon extends AbstractShape{
    private final int sides;
    private final int[] x, y;

    Polygon(Point[] points, int sides) throws InvalidArgumentException {
        if (points.length < sides)
            throw new InvalidArgumentException(this.invalidLengthMsg);

        this.sides = sides;
        this.x = Arrays.stream(points).mapToInt(p -> p.x).toArray();
        this.y = Arrays.stream(points).mapToInt(p -> p.y).toArray();
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        if (this.isFill()) {
            g2d.setColor(this.getFillColor());
            g2d.fillPolygon(x, y, this.sides);

            g2d.setColor(this.getBorderColor());
            g2d.drawPolygon(x, y, this.sides);
        } else {
            g2d.drawPolygon(x, y, this.sides);
        }
    }
}
