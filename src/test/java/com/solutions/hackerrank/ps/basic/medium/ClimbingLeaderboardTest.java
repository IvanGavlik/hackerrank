package com.solutions.hackerrank.ps.basic.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClimbingLeaderboardTest {

    @Test
    public void ranked1Player1() {
        List<Integer> result = ClimbingLeaderboard.climbingLeaderboard(
                Arrays.asList(100),
                Arrays.asList(70)
        );
        Assertions.assertEquals(Arrays.asList(2), result);

        result = ClimbingLeaderboard.climbingLeaderboard(
                Arrays.asList(100),
                Arrays.asList(100)
        );
        Assertions.assertEquals(Arrays.asList(1), result);

        result = ClimbingLeaderboard.climbingLeaderboard(
                Arrays.asList(100),
                Arrays.asList(105)
        );
        Assertions.assertEquals(Arrays.asList(1), result);
    }

    @Test
    public void ranked1PlayerMany() {
        List<Integer> result = ClimbingLeaderboard.climbingLeaderboard(
                Arrays.asList(100),
                Arrays.asList(70, 80)
        );
        Assertions.assertEquals(Arrays.asList(2, 2), result);

        result = ClimbingLeaderboard.climbingLeaderboard(
                Arrays.asList(100),
                Arrays.asList(70, 105)
        );
        Assertions.assertEquals(Arrays.asList(2, 1), result);

        result = ClimbingLeaderboard.climbingLeaderboard(
                Arrays.asList(100),
                Arrays.asList(70, 100, 105)
        );
        Assertions.assertEquals(Arrays.asList(2, 1, 1), result);
    }

    @Test
    public void rankedManyPlayer1() {
        List<Integer> result = ClimbingLeaderboard.climbingLeaderboard(
                Arrays.asList(100, 120),
                Arrays.asList(70)
        );
        Assertions.assertEquals(Arrays.asList(3), result);

        result = ClimbingLeaderboard.climbingLeaderboard(
                Arrays.asList(100, 129),
                Arrays.asList(130)
        );
        Assertions.assertEquals(Arrays.asList(1), result);

        result = ClimbingLeaderboard.climbingLeaderboard(
                Arrays.asList(123, 100),
                Arrays.asList(110)
        );
        Assertions.assertEquals(Arrays.asList(2), result);
    }

    @Test
    public void rankedManyPlayerMany() {

        List<Integer> result = ClimbingLeaderboard.climbingLeaderboard(
                Arrays.asList(100, 90, 90, 80),
                Arrays.asList(70, 80, 105)
        );
        Assertions.assertEquals(Arrays.asList(4, 3, 1), result);

        result = ClimbingLeaderboard.climbingLeaderboard(
                Arrays.asList(100, 100, 50, 40, 40, 20, 10),
                Arrays.asList(5, 25, 50, 120)
        );
        Assertions.assertEquals(Arrays.asList(6, 4, 2, 1), result);
    }

    @Test
    public void handleNull() {
        List<Integer> result = ClimbingLeaderboard.climbingLeaderboard(
                Arrays.asList(100, 90, 90, 80),
                null
        );
        Assertions.assertEquals(new ArrayList<>(), result);

        result = ClimbingLeaderboard.climbingLeaderboard(
                null,
                Arrays.asList(5, 25, 50, 120)
        );
        Assertions.assertEquals(new ArrayList<>(), result);

        result = ClimbingLeaderboard.climbingLeaderboard(
                null,
                null
        );
        Assertions.assertEquals(new ArrayList<>(), result);
    }

    @Test
    public void handleEmpty() {
        List<Integer> result = ClimbingLeaderboard.climbingLeaderboard(
                Arrays.asList(100, 90, 90, 80),
                new ArrayList<>()
        );
        Assertions.assertEquals(new ArrayList<>(), result);

        result = ClimbingLeaderboard.climbingLeaderboard(
                new ArrayList<>(),
                Arrays.asList(5, 25, 50, 120)
        );
        Assertions.assertEquals(new ArrayList<>(), result);

        result = ClimbingLeaderboard.climbingLeaderboard(
                new ArrayList<>(),
                new ArrayList<>()
        );
        Assertions.assertEquals(new ArrayList<>(), result);
    }
}
