package lib;

import java.awt.*;
import java.util.Arrays;

public abstract class Polygon extends AbstractShape{
    private final int sides;
    private int[] x, y;
    private Point[] vertices;

    public int getSides() {
        return sides;
    }

    Polygon(int sides){
        this.sides = sides;
    }

    Polygon(Point[] vertices, int sides)  {
        this(sides);
        this.setVertices(vertices);
    }

    public void setVertices(Point[] vertices)  {
        this.vertices = vertices;
        this.x = Arrays.stream(vertices).mapToInt(p -> p.x).toArray();
        this.y = Arrays.stream(vertices).mapToInt(p -> p.y).toArray();
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
