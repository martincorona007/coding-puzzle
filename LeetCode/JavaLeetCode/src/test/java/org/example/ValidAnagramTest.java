package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ValidAnagramTest {
    ValidAnagram instance = new ValidAnagram();

    @Test
    public void testCase1(){
        boolean expectedResult = true;
        boolean actualResult = instance.isAnagram("anagram","nagaram");
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testCase2(){
        boolean expectedResult = false;
        boolean actualResult = instance.isAnagram("rat","car");
        assertEquals(expectedResult,actualResult);
    }
}
