package lib;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcuteTriangleTest {
    Shape acuteTriangle;

    @BeforeEach
    void setUp() {
        this.acuteTriangle = new AcuteTriangle(5 , 4);
    }

    @Test
    void getArea() {
        assertEquals(this.acuteTriangle.getArea(), 10);
    }

    @Test
    void getPerimeter() {
        assertEquals(this.acuteTriangle.getPerimeter(), 15.4);
    }

    @AfterEach
    void tearDown() {
        this.acuteTriangle = null;
    }
}