package lib;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square square;

    @BeforeEach
    void setUp() throws InvalidArgumentException {
        this.square = new Square(new Point(250,250),150);
    }

    @Test
    void setDrawColor(){
        this.square.setDrawColor(Color.BLUE);
        assertEquals(this.square.getDrawColor(), Color.BLUE);
    }

    @Test
    void setFillColor(){
        this.square.setFillColor(Color.RED);
        assertEquals(this.square.getFillColor(), Color.RED);
    }

    @Test
    void fill() {
        this.square.fill(Color.BLUE, Color.RED);
        assertEquals(this.square.getDrawColor(), Color.BLUE);
        assertEquals(this.square.getFillColor(), Color.RED);
        assertTrue(this.square.isFill());
    }

    @Test
    void draw() {
        this.square.draw();
        assertFalse(this.square.isFill());
    }

    @Test
    void invalidParameter() {
        try {
            this.square = new Square(new Point(40,50), -50);
        } catch (InvalidArgumentException ex) {
            assertEquals(ex.getMessage(), "Enter valid height and width");
        }
    }

    @Test
    void sameWidthAndHeight(){
        assertEquals(square.getHeight(), square.getWidth());
    }

    @Test
    void getArea() {
        assertEquals(this.square.getArea(), 22500);
    }

    @Test
    void getPerimeter() {
        assertEquals(this.square.getPerimeter(), 600);
    }

    @AfterEach
    void tearDown() {
        this.square = null;
    }
}