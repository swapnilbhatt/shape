package lib;

public abstract class AbstractShape implements Shape{
    double getDistance(Point p1, Point p2){
        // Find euclidean distance between two points
        return Math.sqrt(Math.pow((p1.x - p2.x),2) - Math.pow((p1.y - p2.y),2));
    }
}
