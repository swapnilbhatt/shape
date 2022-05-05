package lib;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Shape triangle;

    @BeforeEach
    void setUp() {
        Point[] points = {new Point(150, 200), new Point(250, 120), new Point(130, 140)};
        this.triangle = new Triangle(points);
    }

    @Test
    void getArea() {
        assertEquals(this.triangle.getArea(), 3800.33);
    }

    @Test
    void getPerimeter() {
        assertEquals(this.triangle.getPerimeter(), 312.97);
    }

    @AfterEach
    void tearDown() {
        this.triangle = null;
    }
}