package org.example;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class RepeatedDnaSequencesTest {
    RepeatedDnaSequences instance = new RepeatedDnaSequences();

    @Test
    public void testCase1(){
        List<String> expectedResult = List.of("AAAAACCCCC","CCCCCAAAAA");// immutable list, cannot add/remove elements later
        List<String>  actualResult = new ArrayList<>();
        actualResult = instance.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
        //Since its a immutable list we can not usre sort() method
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCase2(){
        List<String> expectedResult = Arrays.asList("TTGACCTTGA", "TGACCTTGAC", "GACCTTGACC");//fixed-size list, modify elements but cannot add/remove elements
        List<String>  actualResult = new ArrayList<>();

        actualResult = instance.findRepeatedDnaSequences("TTGACCTTGACCTTGACC");
        //In Leetcode Description says "You may return the answer in any order." for testing I order them.
        Collections.sort(actualResult);
        Collections.sort(expectedResult);
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCase3(){
        List<String> expectedResult = new ArrayList<>( Arrays.asList("ACGTGACGTG", "CGTGACGTGA", "GTGACGTGAC", "TGACGTGACG","GACGTGACGT"));//full modifiable list
        List<String>  actualResult = new ArrayList<>();

        actualResult = instance.findRepeatedDnaSequences("ACGTGACGTGACGTGACGTG");
        //In Leetcode Description says "You may return the answer in any order." for testing I order them.
        Collections.sort(actualResult);
        Collections.sort(expectedResult);
        assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testCase4(){
        List<String> expectedResult = new ArrayList<>();//full modifiable list
        List<String>  actualResult = new ArrayList<>();
        //In Leetcode Description says "You may return the answer in any order." for testing I order them.
        Collections.sort(actualResult);
        Collections.sort(expectedResult);
        actualResult = instance.findRepeatedDnaSequences("A");
        assertEquals(actualResult,expectedResult);
    }
}
