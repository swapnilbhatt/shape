package lib;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class HexagonTest {
    Hexagon hexagon;

    @BeforeEach
    void setUp() {
        this.hexagon = new Hexagon(new Point(150, 150), 200);
    }

    @Test
    void getArea() {
        assertEquals(this.hexagon.getArea(), 103923.05);
    }

    @Test
    void getPerimeter() {
        assertEquals(this.hexagon.getPerimeter(), 1198.92);
    }

    @Test
    void getInternalAngle(){
        assertEquals(this.hexagon.internalAngle(), 120);
    }

    @Test
    void getExternalAngle(){
        assertEquals(this.hexagon.externalAngle(), 60);
    }

    @AfterEach
    void tearDown() {
        this.hexagon = null;
    }
}