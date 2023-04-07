package com.solutions.hackerrank.ps.basic.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SaveThePrisonerTest {

    @Test
    public void testNEqualsM() {
        Assertions.assertEquals(3, SaveThePrisoner.saveThePrisoner(4, 4, 4));
        Assertions.assertEquals(2, SaveThePrisoner.saveThePrisoner(4, 4, 3));
        Assertions.assertEquals(1, SaveThePrisoner.saveThePrisoner(4, 4, 2));
    }

   @Test
    public void testNBiggerM() {
        Assertions.assertEquals(2, SaveThePrisoner.saveThePrisoner(4, 2, 1));
        Assertions.assertEquals(3, SaveThePrisoner.saveThePrisoner(4, 2, 2));
        Assertions.assertEquals(4, SaveThePrisoner.saveThePrisoner(4, 2, 3));
    }

    @Test
    public void testNSmallerM() {
        Assertions.assertEquals(1, SaveThePrisoner.saveThePrisoner(4, 5, 1));
        Assertions.assertEquals(2, SaveThePrisoner.saveThePrisoner(4, 5, 2));
        Assertions.assertEquals(3, SaveThePrisoner.saveThePrisoner(4, 5, 3));
    }

    @Test
    public void noCircle() {
        Assertions.assertEquals(2, SaveThePrisoner.saveThePrisoner(5, 2, 1));
        Assertions.assertEquals(3, SaveThePrisoner.saveThePrisoner(5, 2, 2));
    }


}
