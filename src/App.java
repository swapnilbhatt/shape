import lib.Circle;
import lib.Point;
import lib.Shape;

public class App {
    public static void main(String[] args){
        Shape c = new Circle(5);
        System.out.println(c.getPerimeter());
        System.out.println(c.getArea());
    }
}
