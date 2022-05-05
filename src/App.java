import lib.*;
import lib.Rectangle;
import lib.Shape;

import java.awt.*;

public class App {
    public static void main(String[] args) {
        try {
     //       Shape rec = new Rectangle(new Point(250, 250), 400, 200);
      //      rec.fill(Color.RED, Color.BLUE);

//            Shape hex = new Hexagon(new Point(250, 250), 100);
//            hex.fill(Color.RED, Color.BLUE);
//
//            Shape hep = new Heptagon(new Point(250, 250), 100);
//            hep.fill(Color.RED, Color.BLUE);
//
//            Shape oct = new Octagon(new Point(250, 250), 100);
//            oct.fill(Color.RED, Color.GREEN);
//
          //  Shape circle = new Circle(new Point(250, 250), 100);
          //  circle.fill(Color.RED, Color.ORANGE);

//            Shape p = new Pentagon(new Point(250, 250), 100);
//            p.fill(Color.RED, Color.GRAY);

            Point[] points = {new Point(150, 200), new Point(250, 120), new Point(130, 140)};
            Shape triangle = new Triangle(points);
            triangle.fill(Color.RED, Color.ORANGE);

            System.out.println(triangle.getPerimeter());
            System.out.println(triangle.getArea());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
