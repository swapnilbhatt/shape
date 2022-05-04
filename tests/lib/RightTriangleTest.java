package lib;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RightTriangleTest {
    Shape rightTriangle;

    @BeforeEach
    void setUp() throws InvalidArgumentException {
        this.rightTriangle = new RightTriangle(5 , 4);
    }

    @Test
    void invalidParameter(){
        try {
            this.rightTriangle = new RightTriangle(-5, 4);
        } catch (InvalidArgumentException ex){
            assertEquals(ex.getMessage(), "Please enter valid length");
        }

        try {
            this.rightTriangle = new RightTriangle(5, -4);
        } catch (InvalidArgumentException ex){
            assertEquals(ex.getMessage(), "Please enter valid length");
        }

        try {
            this.rightTriangle = new RightTriangle(-5, -4);
        } catch (InvalidArgumentException ex){
            assertEquals(ex.getMessage(), "Please enter valid length");
        }
    }

    @Test
    void getArea() {
        assertEquals(this.rightTriangle.getArea(), 10);
    }

    @Test
    void getPerimeter() {
        assertEquals(this.rightTriangle.getPerimeter(), 15.4);
    }

    @AfterEach
    void tearDown() {
        this.rightTriangle = null;
    }
}