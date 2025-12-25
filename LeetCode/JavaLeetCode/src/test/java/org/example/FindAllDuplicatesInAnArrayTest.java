package org.example;


import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
public class FindAllDuplicatesInAnArrayTest {

    FindAllDuplicatesInAnArray instance = new FindAllDuplicatesInAnArray();
    @Test
    public void verifyTestCase1(){
        assertEquals("test case 1", Arrays.asList(2,3),instance.findDuplicates(new int[]{4,3,2,7,8,2,3,1}));
    }

}
