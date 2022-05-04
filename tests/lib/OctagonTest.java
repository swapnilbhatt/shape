package lib;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OctagonTest {
    Shape octagon;

    @BeforeEach
    void setUp() throws InvalidArgumentException {
        this.octagon = new Octagon(5);
    }

    @Test
    void invalidParameter(){
        try {
            this.octagon = new Octagon(-5);
        } catch (InvalidArgumentException ex){
            assertEquals(ex.getMessage(), "Please enter valid length");
        }
    }

    @Test
    void getArea() {
        assertEquals(this.octagon.getArea(), 120.71);
    }

    @Test
    void getPerimeter() {
        assertEquals(this.octagon.getPerimeter(), 40);
    }

    @AfterEach
    void tearDown() {
        this.octagon = null;
    }
}