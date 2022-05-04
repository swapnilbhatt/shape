import lib.Circle;
import lib.InvalidArgumentException;
import lib.Shape;

import java.awt.*;

public class App {
    public static void main(String[] args){
        try {
            Shape c  = new Circle(5);
            System.out.println(c.getPerimeter());
            System.out.println(c.getArea());
        } catch (InvalidArgumentException e) {
            throw new RuntimeException(e);
        }
    }
}
