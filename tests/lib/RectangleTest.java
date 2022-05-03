package lib;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Shape rectangle;

    @BeforeEach
    void setUp() {
        this.rectangle = new Rectangle(5 , 4);
    }

    @Test
    void getArea() {
        assertEquals(this.rectangle.getArea(), 20);
    }

    @Test
    void getPerimeter() {
        assertEquals(this.rectangle.getPerimeter(), 18);
    }

    @AfterEach
    void tearDown() {
        this.rectangle = null;
    }
}