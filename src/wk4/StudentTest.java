package wk4;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testAssertions(){

        assertTrue( 1 == 1);
        assertFalse( 1 == 2);
        assertTrue(1 == 1 && 1 < 2);
        assertNull(null);
        assertNotNull("hello");
        assertEquals(20, 5 * 4 + 2);
        assertNotEquals(20, 3 * 6);
    }

}