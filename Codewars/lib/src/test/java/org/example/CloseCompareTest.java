package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CloseCompareTest {


    @ParameterizedTest
    @MethodSource("testCases")
    public void exampleTestCases(double expectedResult,double a, double b,  String message) {
        CloseCompare closeCompare = new CloseCompare();

        double actualResult= closeCompare.closeCompare(a,b);
        assertEquals(expectedResult,actualResult ,message);

    }
    static Stream<Arguments> testCases(){
        return Stream.of(
                Arguments.of(-1, 4, 5,"Test 1"),
                Arguments.of(0,5, 5,"test 2"),
                Arguments.of(1, 6, 5,"Test 3")
        );
    }
    @ParameterizedTest
    @MethodSource("testCases2")
    public void exampleTestCases(double expectedResult,double a, double b, double margin, String message) {
        CloseCompare closeCompare = new CloseCompare();

        double actualResult= closeCompare.closeCompare(a,b,margin);
        assertEquals(expectedResult,actualResult ,message);
    }
    static Stream<Arguments> testCases2(){
        return Stream.of(
                Arguments.of(0, 2, 5, 3,"Test 5"),
                Arguments.of(1, 8.1, 5, 3,"Test 6"),
                Arguments.of(-1, 1.99, 5, 3,"Test 7")
        );
    }

}
