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
    void setDrawColor(){
        this.octagon.setDrawColor(Color.BLUE);
        assertEquals(this.octagon.getDrawColor(), Color.BLUE);
    }

    @Test
    void setFillColor(){
        this.octagon.setFillColor(Color.RED);
        assertEquals(this.octagon.getFillColor(), Color.RED);
    }

    @Test
    void fill() {
        this.octagon.fill(Color.BLUE, Color.RED);
        assertEquals(this.octagon.getDrawColor(), Color.BLUE);
        assertEquals(this.octagon.getFillColor(), Color.RED);
        assertTrue(this.octagon.isFill());
    }

    @Test
    void draw() {
        this.octagon.draw();
        assertFalse(this.octagon.isFill());
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