package teste;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AssertTest {
    @Test
    public void testAssertArrayEquals(){
        byte[] esperado = "teste".getBytes();
        byte[] atual = "teste1".getBytes();
        assertArrayEquals(esperado, atual);
    }
    @Test
    public void testAssertEquals(){
        assertEquals("text", "text");
    }

    @Test
    public void testAssertNotNull(){
        assertNotNull(new Object());
    }

    @Test
    public void testAssertNotSame(){
        assertSame(new Object(), new Object());
    }

    @Test
    public void testAssertNull(){
        assertNull(null);
    }
}
