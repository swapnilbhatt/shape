package lib;

public abstract class AbstractShape implements Shape{
    //Get Euclidean distance of two points
    double getDistance(Point p1, Point p2){
        // Find euclidean distance between two points
        return Math.sqrt(Math.pow((p1.x - p2.x),2) - Math.pow((p1.y - p2.y),2));
    }

    //Round off to 2 decimal places
    double roundOff(double value){
       return (double) Math.round(value * 100) / 100;
    }
}
