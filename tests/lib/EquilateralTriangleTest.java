package lib;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class EquilateralTriangleTest {
    Shape equilateralTriangle;

    @BeforeEach
    void setUp() throws InvalidArgumentException {
        this.equilateralTriangle = new EquilateralTriangle(new Point(50, 50), 50);
    }

    @Test
    void getArea() {
        assertEquals(this.equilateralTriangle.getArea(), 1075.0);
    }

    @Test
    void getPerimeter() {
        assertEquals(this.equilateralTriangle.getPerimeter(), 149.48);
    }

    @AfterEach
    void tearDown() {
        this.equilateralTriangle = null;
    }
}