package lib;

import lib.Heptagon;
import lib.Shape;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HeptagonTest {
    Shape heptagon;

    @BeforeEach
    void setUp() {
        this.heptagon = new Heptagon(5);
    }

    @Test
    void getArea() {
        assertEquals(this.heptagon.getArea(), 90.85);
    }

    @Test
    void getPerimeter() {
        assertEquals(this.heptagon.getPerimeter(), 35);
    }

    @AfterEach
    void tearDown() {
        this.heptagon = null;
    }
}