package lib;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Shape triangle;

    @BeforeEach
    void setUp() {
        this.triangle = new Triangle(5 , 4, 7);
    }

    @Test
    void getArea() {
        assertEquals(this.triangle.getArea(), 9.80);
    }

    @Test
    void getPerimeter() {
        assertEquals(this.triangle.getPerimeter(), 16);
    }

    @AfterEach
    void tearDown() {
        this.triangle = null;
    }
}