package lib;

/**
 * Abstact Class which implements Shape interface and provide
 * some utility functions used by all shape objects
 */
public abstract class AbstractShape implements Shape {
    final String invalidLengthMsg = "Please enter valid length";

    /**
     * Round off decimal value to 2 decimal places
     *
     * @param value Input Decimal value
     * @return decimal value with 2 decimal places of input decimal value
     */
    //
    double roundOff(double value) {
        return (double) Math.round(value * 100) / 100;
    }
}
