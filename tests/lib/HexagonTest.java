package lib;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexagonTest {

    Shape hexagon;

    @BeforeEach
    void setUp() throws InvalidArgumentException {
        this.hexagon = new Hexagon(5);
    }

    @Test
    void invalidParameter(){
        try {
            this.hexagon = new Hexagon(-5);
        } catch (InvalidArgumentException ex){
            assertEquals(ex.getMessage(), "Please enter valid length");
        }
    }

    @Test
    void getArea() {
        assertEquals(this.hexagon.getArea(), 64.95);
    }

    @Test
    void getPerimeter() {
        assertEquals(this.hexagon.getPerimeter(), 30);
    }

    @AfterEach
    void tearDown() {
        this.hexagon = null;
    }
}