package org.example.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTestJunit5 {

    @Test
    public void addTwoNumbersTest() {
       int actualResult= CalculatorService.addTwoNumber(12,12);
       int expectedResult=24;
        Assertions.assertEquals(expectedResult,actualResult,"Test Failed");
    }

    @Test
    public void addAnyNumbersTest() {
int result=CalculatorService.sumAnyNumber(12,1,2,3);
int expectedResult=6;
        Assertions.assertEquals(expectedResult,result);
    }
}
