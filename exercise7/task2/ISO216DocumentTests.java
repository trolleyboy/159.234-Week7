package exercise7.task2;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class ISO216DocumentTests {
    
    @Test
    void testA4Height() {
        ISO216Document d = new ISO216Document("A4");
        assertEquals(297, d.getHeight());
    }

    @Test
    void testA4Width() {
        ISO216Document d = new ISO216Document("A4");
        assertEquals(210, d.getWidth());
    }

    @Test
    void testA3Height() {
        ISO216Document d = new ISO216Document("A3");
        assertEquals(420, d.getHeight());
    }

    @Test
    void testA3Width() {
        ISO216Document d = new ISO216Document("A3");
        assertEquals(297, d.getWidth());
    }

    @Test
    void testEmptyString() {
        ISO216Document d = new ISO216Document();
        assertEquals(297, d.getHeight());
        assertEquals(210, d.getWidth());
    }
}
