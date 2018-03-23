package me.apoorvaagupta;

import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {

    Processor<Integer> p = new Processor<Integer>(Integer.class);
    Integer v1 = 12;
    Integer v2 = 13;

    @Test
    public void testProcessorforInteger() {
        assertEquals(new Integer(25), p.process(v1, v2));
    }

    Processor<String> s = new Processor<String>(String.class);

    @Test
    public void testProcessorforString() {
        assertEquals(("abcdef"), s.process("abc", "def"));
    }
}
