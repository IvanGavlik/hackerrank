package com.solutions.hackerrank.ps.basic.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JumpingCloudsRevisitedTest {

    @Test
    public void testSimpleInput() {
        int c[] = {0, 0, 1, 0, 0, 1, 1, 0};
        int k = 2;
        Assertions.assertEquals(92, JumpingCloudsRevisited.jumpingOnClouds(c, k));
    }

    @Test
    public void testSimeleInput2() {
        int c[] = {1, 1, 1, 0, 1, 1, 0, 0, 0, 0};
        int k = 3;
        Assertions.assertEquals(80, JumpingCloudsRevisited.jumpingOnClouds(c, k));
    }
}
