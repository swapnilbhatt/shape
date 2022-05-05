package lib;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle circle;

    @BeforeEach
    void setUp() throws InvalidArgumentException {
        this.circle = new Circle(new Point(250,250), 100);
    }

    @Test
    void invalidParameter(){
        try {
            this.circle = new Circle(new Point(20, 40),-5);
        } catch (InvalidArgumentException ex){
            assertEquals(ex.getMessage(), "Enter valid radius");
        }
    }

    @Test
    void setDrawColor(){
        this.circle.setDrawColor(Color.BLUE);
        assertEquals(this.circle.getDrawColor(), Color.BLUE);
    }

    @Test
    void setFillColor(){
        this.circle.setFillColor(Color.RED);
        assertEquals(this.circle.getFillColor(), Color.RED);
    }

    @Test
    void fill() {
        this.circle.fill(Color.BLUE, Color.RED);
        assertEquals(this.circle.getDrawColor(), Color.BLUE);
        assertEquals(this.circle.getFillColor(), Color.RED);
        assertTrue(this.circle.isFill());
    }

    @Test
    void draw() {
        this.circle.draw();
        assertFalse(this.circle.isFill());
    }

    @Test
    void getArea() {
        double p = this.circle.getArea();
        assertEquals(p, 31415.93);
    }

    @Test
    void getPerimeter() {
        double p = this.circle.getPerimeter();
        assertEquals(p, 628.32);
    }

    @AfterEach
    void tearDown() {
        this.circle = null;
    }
}