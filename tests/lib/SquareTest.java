package lib;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Shape square;

    @BeforeEach
    void setUp() throws InvalidArgumentException {
        this.square = new Square(5);
    }

    @Test
    void invalidParameter() {
        try {
            this.square = new Square(-5);
        } catch (InvalidArgumentException ex) {
            assertEquals(ex.getMessage(), "Please enter valid length");
        }
    }

    @Test
    void getArea() {
        assertEquals(this.square.getArea(), 25);
    }

    @Test
    void getPerimeter() {
        assertEquals(this.square.getPerimeter(), 20);
    }

    @AfterEach
    void tearDown() {
        this.square = null;
    }
}