package com.example.springbootdockercomposeapi;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.client.ExpectedCount;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    //BDD
    @Test
    public void should_add_two_numbers() {
        //given
        Calculator calculator = new Calculator();
        //then
        Assert.assertEquals(calculator.add(10,15),25);
        Assert.assertEquals(calculator.add(-5,15),10);
        Assert.assertEquals(calculator.add(2,2),4);
        Assert.assertEquals(calculator.add(-26,-18),-44);
    }

    @Test
    public void should_not_add_two_numbers() {
        //given
        Calculator calculator = new Calculator();
        //then
        Assert.assertNotEquals(calculator.add(-3,15),25);
    }

    @Test
    public void should_divide_two_numbers() {
        //given
        Calculator calculator = new Calculator();
        //then
        Assert.assertEquals(calculator.divide(15,5),3);
    }

    @Test()
    public void should_not_divide_by_zero() {
        //given
        Calculator calculator = new Calculator();
        //then
       Throwable exception = assertThrows(ArithmeticException.class,()-> calculator.divide(15,0));
       assertEquals("It's impossible to divide by '0'",exception.getMessage());
    }

}