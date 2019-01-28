package com.sc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by vvaghicharla on 1/28/2019.
 */
public class StringCalculatorTest {

  @Test
    public void testInputWithhasNewlineWithSpace() {
    StringCalculator he = new StringCalculator();
    assertEquals("Result", 6, he.processStringArray("1 \n2, 3"));
  }

    @Test
    public void testInputWithhasNewlineWithOutSpace() {
        StringCalculator he = new StringCalculator();
        assertEquals("Result", 6, he.processStringArray("1\n2,3"));
    }

    @Test
    public void testInputWithhasMultipleDelimiters() {
        StringCalculator he = new StringCalculator();
        assertEquals("Result", 6, he.processStringArray("//[**]\n1***2***3"));
    }

    @Test
    public void testInputWithhasMultipleDelimitersAndSpecialChars() {
        StringCalculator he = new StringCalculator();
        assertEquals("Result", 6, he.processStringArray("//[*][%]\n1*2%3"));
    }

    @Test
    public void testInputWithhasIntegerValueMoreThan1000() {
        StringCalculator he = new StringCalculator();
        assertEquals("Result", 4, he.processStringArray("1\n1000,3"));
    }

    @Test
    public void testValidateInputMethodWithStringHasSpecialChars() {
        StringCalculator he = new StringCalculator();
        assertEquals("Result", "1 1000 3", he.validateInput("1\n1000,3"));
    }

    @Test
    public void testArrayResultWithArrayOfIntegers() {
        StringCalculator he = new StringCalculator();
        assertEquals("Result", 6, he.arrayResult(new int[]{1,2,3}));
    }

}
