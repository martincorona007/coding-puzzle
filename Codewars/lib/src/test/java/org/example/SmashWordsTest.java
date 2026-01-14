import org.example.SmashWords;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import static org.junit.Assert.*;

//import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmashWordsTest {
    @Test
    public void validate1() {
        assertEquals("hello", SmashWords.smash(new String[] { "hello" }));
    }
    @Test
    public void validate2() {
         assertEquals("hello world", SmashWords.smash(new String[] { "hello", "world"}));
    }
    @Test
    public void validate3() {
        assertEquals("hello world this is great", SmashWords.smash(new String[] {"hello", "world", "this", "is", "great"}));
    }
}
