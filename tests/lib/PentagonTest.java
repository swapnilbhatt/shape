package lib;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class PentagonTest {
    Pentagon pentagon;

    @BeforeEach
    void setUp() {
        this.pentagon = new Pentagon(new Point(150, 150), 200);
    }

    @Test
    void getArea() {
        assertEquals(this.pentagon.getArea(), 95105.65);
    }

    @Test
    void getPerimeter() {
        assertEquals(this.pentagon.getPerimeter(), 1177.1);
    }

    @Test
    void getInternalAngle(){
        assertEquals(this.pentagon.internalAngle(), 108);
    }

    @Test
    void getExternalAngle(){
        assertEquals(this.pentagon.externalAngle(), 72);
    }

    @AfterEach
    void tearDown() {
        this.pentagon = null;
    }
}