import lib.*;
import lib.Rectangle;
import lib.Shape;

import java.awt.*;

public class App {
    public static void main(String[] args) {
        try {
            Shape circle = new Circle(new Point(250, 250), 100);
            circle.fill(Color.RED, Color.ORANGE);

            Point[] points = {new Point(150, 200), new Point(250, 120), new Point(130, 140)};
            Shape triangle = new Triangle(points);
            triangle.fill(Color.RED, Color.BLUE);

            Shape rightTriangle = new RightTriangle(new Point(100,100), 100, 200);
            rightTriangle.fill(Color.BLUE, Color.GRAY);

            Shape equilateralTriangle = new EquilateralTriangle(new Point(100,100), 100);
            equilateralTriangle.fill(Color.BLUE, Color.BLACK);

            Shape rec = new Rectangle(new Point(150, 150), 400, 200);
            rec.fill(Color.RED, Color.BLUE);

            Shape square = new Square(new Point(250, 250), 400);
            square.fill(Color.RED, Color.GREEN);

            Shape pentagon = new Pentagon(new Point(250, 250), 100);
            pentagon.fill(Color.RED, Color.GRAY);

            Shape hex = new Hexagon(new Point(250, 250), 100);
            hex.fill(Color.RED, Color.BLUE);

            Shape hep = new Heptagon(new Point(250, 250), 100);
            hep.fill(Color.RED, Color.BLUE);

            Shape oct = new Octagon(new Point(250, 250), 100);
            oct.fill(Color.RED, Color.GREEN);

            System.out.println(triangle.getPerimeter());
            System.out.println(triangle.getArea());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
