package lib;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle;

    @BeforeEach
    void setUp() throws InvalidArgumentException {
        this.rectangle = new Rectangle(new Point(250, 250), 400 , 200);
    }

    @Test
    void invalidParameter(){
        Point p = new Point(100, 400);
        String msg = "Enter valid height and width";

        try {
            this.rectangle = new Rectangle(p, -50 , 40);
        } catch (InvalidArgumentException ex){
            assertEquals(ex.getMessage(), msg);
        }

        try {
            this.rectangle = new Rectangle(p, 50 , -40);
        } catch (InvalidArgumentException ex){
            assertEquals(ex.getMessage(), msg);
        }

        try {
            this.rectangle = new Rectangle(p, -50 , -40);
        } catch (InvalidArgumentException ex){
            assertEquals(ex.getMessage(), msg);
        }
    }

    @Test
    void setDrawColor(){
        this.rectangle.setDrawColor(Color.BLUE);
        assertEquals(this.rectangle.getDrawColor(), Color.BLUE);
    }

    @Test
    void setFillColor(){
        this.rectangle.setFillColor(Color.RED);
        assertEquals(this.rectangle.getFillColor(), Color.RED);
    }

    @Test
    void fill() {
        this.rectangle.fill(Color.BLUE, Color.RED);
        assertEquals(this.rectangle.getDrawColor(), Color.BLUE);
        assertEquals(this.rectangle.getFillColor(), Color.RED);
        assertTrue(this.rectangle.isFill());
    }

    @Test
    void draw() {
        this.rectangle.draw();
        assertFalse(this.rectangle.isFill());
    }

    @Test
    void getArea() {
        assertEquals(this.rectangle.getArea(), 80000);
    }

    @Test
    void getPerimeter() {
        assertEquals(this.rectangle.getPerimeter(), 1200);
    }

    @AfterEach
    void tearDown() {
        this.rectangle = null;
    }
}