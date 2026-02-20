package org.example;
import org.junit.Test;
import static org.junit.Assert.*;
public class IntegertoEnglishWordsTest {
    IntegerToEnglishWords integertoEnglishWords = new IntegerToEnglishWords();

    @Test
    public void test1(){
        String expectedResult = "Twelve Thousand Three Hundred Forty Five";
        String actualResult = integertoEnglishWords.numberToWords(12345);
        System.out.println(actualResult);
        assertEquals("test",expectedResult,actualResult);

    }
    @Test
    public void test2(){
        String expectedResult = "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven";
        String actualResult = integertoEnglishWords.numberToWords(1234567);
        System.out.println(actualResult);
        assertEquals("test",expectedResult,actualResult);

    }
    @Test
    public void test3(){
        String expectedResult = "One Hundred Twenty Three";
        String actualResult = integertoEnglishWords.numberToWords(123);

        assertEquals("test",expectedResult,actualResult);

    }

    @Test
    public void test4(){
        String expectedResult = "One Hundred Ten";
        String actualResult = integertoEnglishWords.numberToWords(110);

        assertEquals("test",expectedResult,actualResult);

    }
    @Test
    public void test5(){
        String expectedResult = "One Thousand One";
        String actualResult = integertoEnglishWords.numberToWords(1001);

        assertEquals("test",expectedResult,actualResult);

    }
}
