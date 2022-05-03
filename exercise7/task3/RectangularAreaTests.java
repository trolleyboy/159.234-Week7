package exercise7.task3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectangularAreaTests {
   
    @Test
    void testGetArea() {
        RectangularArea r = new RectangularArea(12, 14);
        assertEquals(168, r.getArea(), 0.001);
    }

    
    @Test
    void testGetOrientation() {
        RectangularArea r1 = new RectangularArea(12, 14);
        assertEquals("portrait", r1.getOrientation());
        RectangularArea r2 = new RectangularArea(16, 14);
        assertEquals("landscape", r2.getOrientation());
    }

    @Test
    void testGetPerimeter() {
        RectangularArea r = new RectangularArea(12, 14);
        assertEquals(52, r.getPerimeter());
    }

    @Test
    void testIsSquare() {
        RectangularArea r1 = new RectangularArea(12, 14);
        assertFalse(r1.isSquare());
        RectangularArea r2 = new RectangularArea(14, 14);
        assertTrue(r2.isSquare());
    }

}
