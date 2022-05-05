package lib;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class RightTriangleTest {
    Shape rightTriangle;

    @BeforeEach
    void setUp() {
        this.rightTriangle = new RightTriangle(new Point(50, 50), 50 , 40);
    }

    @Test
    void getArea() {
        assertEquals(this.rightTriangle.getArea(), 1000.0);
    }

    @Test
    void getPerimeter() {
        assertEquals(this.rightTriangle.getPerimeter(), 154.03);
    }

    @AfterEach
    void tearDown() {
        this.rightTriangle = null;
    }
}