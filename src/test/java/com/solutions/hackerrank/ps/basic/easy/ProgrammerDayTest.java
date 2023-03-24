package com.solutions.hackerrank.ps.basic.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

public class ProgrammerDayTest {

    @Test
    public void gregorianNotLeap()  {
        Assertions.assertEquals("13.09.2017", ProgrammerDay.dayOfProgrammer(2017));
    }

    @Test
    public void gregorianLeap()  {
        Assertions.assertEquals("12.09.2016", ProgrammerDay.dayOfProgrammer(2016));
    }

    @Test
    public void julianNotLeap()  {
        Assertions.assertEquals("13.09.1801", ProgrammerDay.dayOfProgrammer(1801));
    }

    @Test
    public void julianLeap()  {
        Assertions.assertEquals("12.09.1800", ProgrammerDay.dayOfProgrammer(1800));
    }

    @Test
    public void transitionYear() {
        Assertions.assertEquals("26.09.1918", ProgrammerDay.dayOfProgrammer(1918));
    }

    @Test
    public void invalidParam() {
        Assertions.assertThrows(InvalidParameterException.class, () -> ProgrammerDay.dayOfProgrammer(1600));
        Assertions.assertThrows(InvalidParameterException.class, () -> ProgrammerDay.dayOfProgrammer(2800));
    }

}
