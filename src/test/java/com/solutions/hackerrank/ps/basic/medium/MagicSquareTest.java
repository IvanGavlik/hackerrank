package com.solutions.hackerrank.ps.basic.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MagicSquareTest {

    @Test
    public void testCost0() {
        List<List<Integer>> square = new ArrayList<>();
        square.add(Arrays.asList(4, 9, 2));
        square.add(Arrays.asList(3, 5, 7));
        square.add(Arrays.asList(8, 1, 6));
        Assertions.assertEquals(0, new MagicSquare().formingMagicSquare(square));
    }

    @Test
    public void testCost1() {
        List<List<Integer>> square = new ArrayList<>();
        square.add(Arrays.asList(4, 9, 2));
        square.add(Arrays.asList(3, 5, 7));
        square.add(Arrays.asList(8, 1, 5));
        Assertions.assertEquals(1, new MagicSquare().formingMagicSquare(square));
    }

    @Test
    public void testCost7() {
        List<List<Integer>> square = new ArrayList<>();
        square.add(Arrays.asList(5, 3, 4));
        square.add(Arrays.asList(1, 5, 8));
        square.add(Arrays.asList(6, 4, 2));
        Assertions.assertEquals(7, new MagicSquare().formingMagicSquare(square));
    }
}
