package lib;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Shape square;

    @BeforeEach
    void setUp() throws InvalidArgumentException {
        this.square = new Square(new Point(250,250),150);
    }

    @Test
    void invalidParameter() {
        try {
            this.square = new Square(new Point(40,50), -50);
        } catch (InvalidArgumentException ex) {
            assertEquals(ex.getMessage(), "Enter valid height and width");
        }
    }

    @Test
    void getArea() {
        assertEquals(this.square.getArea(), 22500);
    }

    @Test
    void getPerimeter() {
        assertEquals(this.square.getPerimeter(), 600);
    }

    @AfterEach
    void tearDown() {
        this.square = null;
    }
}