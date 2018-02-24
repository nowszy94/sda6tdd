package com.sda;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalcServiceTest {

    private CalcService calcService;

    @Before
    public void init() {
        calcService = new CalcService();
    }

    @Test
    public void shouldAddDigitsInStringAndProduceResult() {
        //given:
        String text = "2;3;4";
        int expected = 9;

        //when:
        int acutal = calcService.calculate(text);

        //then:
        Assert.assertEquals(expected, acutal);
    }
}
