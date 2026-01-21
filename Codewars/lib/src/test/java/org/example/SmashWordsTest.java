package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.Test;
//import static org.junit.Assert.*;

//import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmashWordsTest {
    SmashWords smashWords = new SmashWords();
    @Test
    public void validate1() {
        assertEquals("hello", smashWords.smash(new String[] { "hello" }));
    }
    @Test
    public void validate2() {
         assertEquals("hello world", smashWords.smash(new String[] { "hello", "world"}));
    }
    @Test
    public void validate3() {
        assertEquals("hello world this is great", smashWords.smash(new String[] {"hello", "world", "this", "is", "great"}));
    }
}
