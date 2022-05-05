package lib;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class OctagonTest {
    Octagon octagon;

    @BeforeEach
    void setUp() throws InvalidArgumentException {
        this.octagon = new Octagon(new Point(150, 150), 200);
    }

    @Test
    void getArea() {
        assertEquals(this.octagon.getArea(), 113137.08);
    }

    @Test
    void getPerimeter() {
        assertEquals(this.octagon.getPerimeter(), 1222.8);
    }

    @Test
    void getInternalAngle(){
        assertEquals(this.octagon.internalAngle(), 135);
    }

    @Test
    void getExternalAngle(){
        assertEquals(this.octagon.externalAngle(), 45);
    }


    @AfterEach
    void tearDown() {
        this.octagon = null;
    }
}