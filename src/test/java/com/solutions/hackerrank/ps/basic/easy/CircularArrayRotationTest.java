package com.solutions.hackerrank.ps.basic.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * 1 2 3
 *  -> 1. 3 1 2
 *  -> 2. 2 3 1
 *  -> 3. 1 2 3
 *  -> 4. 3 1 2
 *  -> 5. 2 3 1
 *  -> 6. 1 2 3
 */

/**
 * 1 2 3 4
 *  -> 1. 4 1 2 3
 *  -> 2. 3 4 1 2
 *  -> 3. 2 3 4 1
 *  -> 4. 1 2 3 4
 *  -> 5. 4 1 2 3
 *  -> 6. 3 4 1 2
 */
public class CircularArrayRotationTest {

    @Test
    public void testEvenItNoMove() {
        Assertions.assertEquals(
                Arrays.asList(1, 2, 3, 4),
                CircularArrayRotation.circularArrayRotation(Arrays.asList(1, 2, 3, 4), 0, Arrays.asList(0, 1, 2, 3))
        );
    }
    @Test
    public void testEvenItMoveOne() {
        Assertions.assertEquals(
                Arrays.asList(4, 1, 2, 3),
                CircularArrayRotation.circularArrayRotation(Arrays.asList(1, 2, 3, 4), 1, Arrays.asList(0, 1, 2, 3))
        );
    }

    @Test
    public void testEvenItMoveTwo() {
        Assertions.assertEquals(
                Arrays.asList(3, 4, 1, 2),
                CircularArrayRotation.circularArrayRotation(Arrays.asList(1, 2, 3, 4), 2, Arrays.asList(0, 1, 2, 3))
        );
    }
    @Test
    public void testEvenItMoveAsSameNumberElements() {
        Assertions.assertEquals(
                Arrays.asList(1, 2, 3, 4),
                CircularArrayRotation.circularArrayRotation(Arrays.asList(1, 2, 3, 4), 4, Arrays.asList(0, 1, 2, 3))
        );
    }
    @Test
    public void testEvenItMoveMoreThanElements() {
        Assertions.assertEquals(
                Arrays.asList(4, 1, 2, 3),
                CircularArrayRotation.circularArrayRotation(Arrays.asList(1, 2, 3, 4), 5, Arrays.asList(0, 1, 2, 3))
        );
    }

    @Test
    public void testEvenItMoveMoreThanElements2() {
        Assertions.assertEquals(
                Arrays.asList(3, 4, 1, 2),
                CircularArrayRotation.circularArrayRotation(Arrays.asList(1, 2, 3, 4), 6, Arrays.asList(0, 1, 2, 3))
        );
    }
    @Test
    public void testItNoMove() {
        Assertions.assertEquals(
                Arrays.asList(1, 2, 3),
                CircularArrayRotation.circularArrayRotation(Arrays.asList(1, 2, 3), 0, Arrays.asList(0, 1, 2))
        );
    }
    @Test
    public void testItMoveOne() {
        Assertions.assertEquals(
                Arrays.asList(3, 1, 2),
                CircularArrayRotation.circularArrayRotation(Arrays.asList(1, 2, 3), 1, Arrays.asList(0, 1, 2))
        );
    }
    @Test
    public void testItMoveTwo() {
        Assertions.assertEquals(
                Arrays.asList(2, 3, 1),
                CircularArrayRotation.circularArrayRotation(Arrays.asList(1, 2, 3), 2, Arrays.asList(0, 1, 2))
        );
    }
    @Test
    public void testItMoveAsSameNumberElements() {
        Assertions.assertEquals(
                Arrays.asList(2, 3, 2),
                CircularArrayRotation.circularArrayRotation(Arrays.asList(1, 2, 3), 3, Arrays.asList(1, 2, 1))
        );
    }
    @Test
    public void testItMoveMoreThanElements() {
        Assertions.assertEquals(
                Arrays.asList(3, 1, 2),
                CircularArrayRotation.circularArrayRotation(Arrays.asList(1, 2, 3), 4, Arrays.asList(0, 1, 2))
        );
    }

    @Test
    public void testItMoveMoreThanElements2() {
        Assertions.assertEquals(
                Arrays.asList(2, 3, 1),
                CircularArrayRotation.circularArrayRotation(Arrays.asList(1, 2, 3), 5, Arrays.asList(0, 1, 2))
        );
    }
    @Test
    public void notOrderedNumbers() {
        Assertions.assertEquals(
                Arrays.asList(5, 3),
                CircularArrayRotation.circularArrayRotation(Arrays.asList(3, 4, 5), 2, Arrays.asList(1, 2))
        );
    }
}
