package org.example;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindAllDuplicatesInAnArrayTest {

    FindAllDuplicatesInAnArray instance = new FindAllDuplicatesInAnArray();

    @Test
    public void verifyTestCase1(){


       assertEquals(Arrays.asList(2,3),instance.findDuplicates(new int[]{4,3,2,7,8,2,3,1}));
    }

}
