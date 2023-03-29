package com.solutions.hackerrank.ps.basic.medium;

// https://www.hackerrank.com/challenges/magic-square-forming/problem?isFullScreen=false
// THIS IS combinatorics problems

import java.security.InvalidParameterException;
import java.util.*;

/**
 * We define a magic square to be an n x n matrix of distinct positive integers from 1 to n² where the sum of any row,
 * column, or diagonal of length is always equal to the same number: the magic constant.
 *
 * You will be given a 3 x 3 matrix s of integers in the inclusive range [1,9]. We can convert any digit a to
 * any other digit b in the range [1, 9] at cost of |a-b| . Given s, convert it into a magic square at minimal
 * cost. Print this cost on a new line.
 *
 * Note: The resulting magic square must contain distinct integers in the inclusive range [1,9]
 *
 *
 * Example
 * $s = [[5, 3, 4], [1, 5, 8], [6, 4, 2]]
 *
 * The matrix looks like this:
 * 5 3 4
 * 1 5 8
 * 6 4 2
 *
 * We can convert it to the following magic square:
 * 8 3 4
 * 1 5 9
 * 6 7 2
 *
 * This took three replacements at a cost of |5-8| + |8- 9| + |4-7| = 7
 *
 * Function Description
 *
 * Complete the formingMagicSquare function in the editor below.
 * formingMagicSquare has the following parameter(s):
 *
 *     int s[3][3]: a 3 x 3 array of integers
 *
 * Returns
 *     int: the minimal total cost of converting the input square to a magic square
 *
 * Input Format
 *    Each of the lines contains three space-separated integers of row s[i]
 *
 *
 * Constraints
 *  s[i][j] element [1,9]
 *
 * Sample Input 0
 * 4 9 2
 * 3 5 7
 * 8 1 5
 * Sample Output 0
 * 1
 * Explanation 0
 * If we change the bottom right value s[2][2], from 5 to 6 at a cost of |6-5| =1, s becomes
 * a magic square at the minimum possible cost.
 */
public class MagicSquare {

    private List<MS> msList = new ArrayList<>();;

    public MagicSquare() {
        msList.add(MS.ofList(Arrays.asList(4, 9, 2, 3, 5, 7, 8, 1, 6)));
        msList.add(MS.ofList(Arrays.asList(2, 7, 6, 9, 5, 1, 4, 3, 8)));
        msList.add(MS.ofList(Arrays.asList(6, 1, 8, 7, 5, 3, 2, 9, 4)));
        msList.add(MS.ofList(Arrays.asList(8, 3, 4, 1, 5, 9, 6, 7, 2)));

        msList.add(MS.ofList(Arrays.asList(2, 9, 4, 7, 5, 3, 6, 1, 8)));
        msList.add(MS.ofList(Arrays.asList(6, 7, 2, 1, 5, 9, 8, 3, 4)));
        msList.add(MS.ofList(Arrays.asList(8, 1, 6, 3, 5, 7, 4, 9, 2)));
        msList.add(MS.ofList(Arrays.asList(4, 3, 8, 9, 5, 1, 2, 7, 6)));
    }

    /**
     * APPROACH
     * 1. https://www.math.wichita.edu/~richardson/mathematics/magic%20squares/order3magicsquare.html
     */
    public int formingMagicSquare(List<List<Integer>> s) {
        final MS input = MS.ofSquare(s);
        Integer cost = Integer.MAX_VALUE;
        for (MS square : msList) {
            Integer tempCost = cacluateSmallestCost(input, square);
            if (cost > tempCost) {
                cost = tempCost;
            }
        }
        return cost;
    }

    static Integer cacluateSmallestCost(MS ms, MS ms2) {
        List<Integer> costs = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                Integer n1 = ms.get(i, j);
                Integer n2 = ms2.get(i, j);
                Integer cost = Math.abs(n1 - n2);
                costs.add(cost);
            }
        }
        return costs.stream().reduce(0, (n1, n2) -> n1 + n2);
    }
}

class MS {
    private List<List<Integer>> item;

    private MS(List<List<Integer>> square) {
        item = square;
    }
    public static MS ofList(List<Integer> numbers) {
        if (numbers == null || numbers.size() != 9) {
            throw new InvalidParameterException();
        }
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(numbers.get(0));
        firstRow.add(numbers.get(1));
        firstRow.add(numbers.get(2));

        List<Integer> secondRow = new ArrayList<>();
        secondRow.add(numbers.get(3));
        secondRow.add(numbers.get(4));
        secondRow.add(numbers.get(5));

        List<Integer> thirdRow = new ArrayList<>();
        thirdRow.add(numbers.get(6));
        thirdRow.add(numbers.get(7));
        thirdRow.add(numbers.get(8));

        List<List<Integer>> item = new ArrayList<>();
        item.add(firstRow);
        item.add(secondRow);
        item.add(thirdRow);
        return new MS(item);
    }

    public static MS ofSquare(List<List<Integer>> square) {
        return new MS(square);
    }

    public Integer get(int i, int j) {
        return item.get(i).get(j);
    }
}


