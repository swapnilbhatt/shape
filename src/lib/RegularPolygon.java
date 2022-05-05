package lib;

import java.awt.*;

/**
 * Class for regular polygon whose all sides are equal
 */
public abstract class RegularPolygon extends Polygon {
    public RegularPolygon(int sides) {
        super(sides);
    }

    /**
     * Function to calculate the coordinates of the vertices
     */
    public Point[] calculateVertices(Point center, float radius, int numVertices) {
        Point[] vertices = new Point[numVertices];
        double a = (2 * Math.PI) / numVertices;

        for (int i = 0; i < numVertices; i++) {
            int px = (int) (Math.cos(i * a) * radius);
            int py = (int) (Math.sin(i * a) * radius);
            vertices[i] = new Point(center.x + px, center.y + py);
        }

        this.setVertices(vertices);

        return vertices;
    }

    /**
     * Function to calculate the area of the regular polygon.
     */
    public double area(int numVertices, float radius) {
        double area = (radius * radius * numVertices * Math.sin((2 * Math.PI) / numVertices)) / 2;
        return roundOff(area);
    }

    /**
     * Function to calculate the internal angle of the regular polygon
     */
    public double perimeter(Point[] vertices) {
        double perimeter = this.getEuclideanDistance(vertices[0], vertices[1]) * vertices.length;
        return this.roundOff(perimeter);
    }

    /**
     * Function to calculate the internal angle of the regular polygon
     */
    public float internalAngle() {
        int sides = this.getSides();
        return sides > 0 ? ((180 * sides) - 360) / sides : -1;
    }

    /**
     * Function to calculate the external angle of the regular polygon
     */
    public float externalAngle() {
        return 180 - internalAngle();
    }
}