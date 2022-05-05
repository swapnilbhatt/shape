package lib;

import lib.Heptagon;
import lib.Shape;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class HeptagonTest {
    Heptagon heptagon;

    @BeforeEach
    void setUp() {
        this.heptagon = new Heptagon(new Point(150, 150), 200);
    }

    @Test
    void setDrawColor(){
        this.heptagon.setDrawColor(Color.BLUE);
        assertEquals(this.heptagon.getDrawColor(), Color.BLUE);
    }

    @Test
    void setFillColor(){
        this.heptagon.setFillColor(Color.RED);
        assertEquals(this.heptagon.getFillColor(), Color.RED);
    }

    @Test
    void fill() {
        this.heptagon.fill(Color.BLUE, Color.RED);
        assertEquals(this.heptagon.getDrawColor(), Color.BLUE);
        assertEquals(this.heptagon.getFillColor(), Color.RED);
        assertTrue(this.heptagon.isFill());
    }

    @Test
    void draw() {
        this.heptagon.draw();
        assertFalse(this.heptagon.isFill());
    }

    @Test
    void getArea() {
        assertEquals(this.heptagon.getArea(), 109456.41);
    }

    @Test
    void getPerimeter() {
        assertEquals(this.heptagon.getPerimeter(), 1214.71);
    }

    @Test
    void getInternalAngle(){
        assertEquals(this.heptagon.internalAngle(), 128.0);
    }

    @Test
    void getExternalAngle(){
        assertEquals(this.heptagon.externalAngle(), 52.0);
    }

    @AfterEach
    void tearDown() {
        this.heptagon = null;
    }
}