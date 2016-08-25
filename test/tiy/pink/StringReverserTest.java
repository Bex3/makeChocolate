package tiy.pink;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bearden-tellez on 8/24/16.
 */
public class StringReverserTest {

    StringReverser reverser; //don't want to initialize it here

    @Before //annotation - can be assoc. with methods, classes etc. this allows for hardcoding of when in the process it should begin. This runs before your test runs.
    public void setUp() throws Exception {
        reverser = new StringReverser();
    }

    @After //This runs after the test is completed.
    public void tearDown() throws Exception {

    }

    @Test
    public void reverseString() throws Exception {
    String sampleString = "something";
        String reversedString = reverser.reverseString(sampleString);
        System.out.println(reversedString);
        assertEquals("gnihtemos", reversedString); //validating the output is what we expect it to be. assertEquals(what you expect, where it came from)
    }

}