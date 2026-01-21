package org.example;

//import org.junit.Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.Assert.*;

public class ReturnNegativeTest {
    private ReturnNegative returnNeative;
   
    @Test
    public void test1() {
        assertEquals(-42, returnNeative.makeNegative(42));
    }
    @Test
    public void test2() {
        assertEquals(-1, returnNeative.makeNegative(1));
    }
    @Test
    public void test3() {
        assertEquals(0, returnNeative.makeNegative(0));
    }
    @Test
    public void test4() {
        assertEquals(-5, returnNeative.makeNegative(-5));
    }
}
