package lib;

public abstract class AbstractShape implements Shape {
    final String invalidLengthMsg = "Please enter valid length";

    //Round off to 2 decimal places
    double roundOff(double value) {
        return (double) Math.round(value * 100) / 100;
    }
}
