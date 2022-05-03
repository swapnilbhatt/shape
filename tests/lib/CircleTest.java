package lib;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Shape circle;

    @BeforeEach
    void setUp() {
        this.circle = new Circle(5);
    }

    @Test
    void getArea() {
        double p = this.circle.getArea();
        assertEquals(p, 78.54);
    }

    @Test
    void getPerimeter() {
        double p = this.circle.getPerimeter();
        assertEquals(p, 31.42);
    }

    @AfterEach
    void tearDown() {
        this.circle = null;
    }
}