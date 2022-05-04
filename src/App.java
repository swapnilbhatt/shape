import lib.*;
import lib.Point;
import lib.Rectangle;
import lib.Shape;

import java.awt.*;

public class App {
    public static void main(String[] args) {
        try {
            //  Shape c  = new Square(new Point(150,150),400);
           Shape p  = new Pentagon(new Point[]{new Point(260,10),new Point(498,183), new Point(407,462),
                    new Point(113,462), new Point(22,183)});

            Shape h  = new Hexagon(new Point[]{new Point(200,350),new Point(300,350), new Point(350,250),
                    new Point(300,150), new Point(200,150), new Point(150,250)});

         //   Shape c = new EquilateralTriangle(new Point(200, 500), 300);
            Shape r = new RightTriangle(new Point(300, 300), 200, 300);

            Shape s = new Square(new Point(300, 300), 300);

      //      Shape c = new Triangle(new Point[]{new Point(100, 100), new Point(200, 150), new Point(120, 160)});
            p.fill(Color.blue, Color.GREEN);
            r.fill(Color.black, Color.RED);
            s.fill(Color.black, Color.yellow);
            h.fill(Color.RED, Color.GRAY);
            //  Shape c  = new Circle(5);
          //  System.out.println(c.getPerimeter());
          //  System.out.println(c.getArea());
        } catch (InvalidArgumentException e) {
            throw new RuntimeException(e);
        }
    }
}
