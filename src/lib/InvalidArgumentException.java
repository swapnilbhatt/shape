package lib;

/**
 * Custom exception class to validate arguments provided in shape objects
 */
public class InvalidArgumentException extends Exception {
    public InvalidArgumentException(String errorMessage) {
        super(errorMessage);
    }
}
