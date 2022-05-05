package lib;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle triangle;

    @BeforeEach
    void setUp() {
        Point[] points = {new Point(150, 200), new Point(250, 120), new Point(130, 140)};
        this.triangle = new Triangle(points);
    }

    @Test
    void setDrawColor() {
        this.triangle.setDrawColor(Color.BLUE);
        assertEquals(this.triangle.getDrawColor(), Color.BLUE);
    }

    @Test
    void setFillColor() {
        this.triangle.setFillColor(Color.RED);
        assertEquals(this.triangle.getFillColor(), Color.RED);
    }

    @Test
    void getArea() {
        assertEquals(this.triangle.getArea(), 3800.33);
    }

    @Test
    void getPerimeter() {
        assertEquals(this.triangle.getPerimeter(), 312.97);
    }

    @Test
    void fill() {
        this.triangle.fill(Color.BLUE, Color.RED);
        assertEquals(this.triangle.getDrawColor(), Color.BLUE);
        assertEquals(this.triangle.getFillColor(), Color.RED);
        assertTrue(this.triangle.isFill());
    }

    @Test
    void draw() {
        this.triangle.draw();
        assertFalse(this.triangle.isFill());
    }

    @AfterEach
    void tearDown() {
        this.triangle = null;
    }
}