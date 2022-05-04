package lib;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquilateralTriangleTest {
    Shape equilateralTriangle;

    @BeforeEach
    void setUp() throws InvalidArgumentException {
        this.equilateralTriangle = new EquilateralTriangle(5);
    }

    @Test
    void invalidParameter(){
        try {
            this.equilateralTriangle = new EquilateralTriangle(-5);
        } catch (InvalidArgumentException ex){
            assertEquals(ex.getMessage(), "Please enter valid length");
        }
    }

    @Test
    void getArea() {
        assertEquals(this.equilateralTriangle.getArea(), 10.83);
    }

    @Test
    void getPerimeter() {
        assertEquals(this.equilateralTriangle.getPerimeter(), 15);
    }

    @AfterEach
    void tearDown() {
        this.equilateralTriangle = null;
    }
}