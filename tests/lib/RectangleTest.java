package lib;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Shape rectangle;

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