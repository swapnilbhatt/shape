package lib;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class RightTriangleTest {
    RightTriangle rightTriangle;

    @BeforeEach
    void setUp() {
        this.rightTriangle = new RightTriangle(new Point(50, 50), 50 , 40);
    }

    @Test
    void setDrawColor(){
        this.rightTriangle.setDrawColor(Color.BLUE);
        assertEquals(this.rightTriangle.getDrawColor(), Color.BLUE);
    }

    @Test
    void setFillColor(){
        this.rightTriangle.setFillColor(Color.RED);
        assertEquals(this.rightTriangle.getFillColor(), Color.RED);
    }

    @Test
    void getArea() {
        assertEquals(this.rightTriangle.getArea(), 1000.0);
    }

    @Test
    void fill() {
        this.rightTriangle.fill(Color.BLUE, Color.RED);
        assertEquals(this.rightTriangle.getDrawColor(), Color.BLUE);
        assertEquals(this.rightTriangle.getFillColor(), Color.RED);
        assertTrue(this.rightTriangle.isFill());
    }

    @Test
    void draw() {
        this.rightTriangle.draw();
        assertFalse(this.rightTriangle.isFill());
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