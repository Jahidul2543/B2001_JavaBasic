package class_16_test;

import class_16.CalculatorApp;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorAppTest {
    /**
     *
     * 1. JUnit
     * 2. TestNG
     *
     * */

    @Test
    public void addTest() {
        CalculatorApp calculator = new CalculatorApp();
        int actualResult =  calculator.add(2,2);
    //System.out.println(expectedResult); // actualResult = 4;
        // expectedResult == actualResult
        int expectedResult = 4;
        //Assert.assertEquals(actualResult, 6);
        Assert.assertEquals(expectedResult, actualResult);
  }

    @Test
    public void multiplyTest(){
       int actualResult = CalculatorApp.multiply(4,4);
       int exectedResult = 16;
       Assert.assertEquals(actualResult, exectedResult);
    }
}
