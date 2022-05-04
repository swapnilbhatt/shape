package lib;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PentagonTest {
    Shape pentagon;

    @BeforeEach
    void setUp() throws InvalidArgumentException {
        this.pentagon = new Pentagon(5);
    }

    @Test
    void invalidParameter(){
        try {
            this.pentagon = new Pentagon(-5);
        } catch (InvalidArgumentException ex){
            assertEquals(ex.getMessage(), "Please enter valid length");
        }
    }

    @Test
    void getArea() {
        assertEquals(this.pentagon.getArea(), 43.01);
    }

    @Test
    void getPerimeter() {
        assertEquals(this.pentagon.getPerimeter(), 25);
    }

    @AfterEach
    void tearDown() {
        this.pentagon = null;
    }
}