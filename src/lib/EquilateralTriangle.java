package lib;

//Equilateral triangle have all three sides of same length
public class EquilateralTriangle extends Triangle{
    public EquilateralTriangle(double side) throws InvalidArgumentException {
        super(side, side, side);
    }
}
