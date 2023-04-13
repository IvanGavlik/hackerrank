package com.solutions.hackerrank.ps.basic.easy;

import java.util.ArrayList;
import java.util.List;

// TODO wrtite article on problems like save the prisoner, programmer day and magic square
// stao: https://www.hackerrank.com/challenges/circular-array-rotation/problem?isFullScreen=true

/**
 * John Watson knows of an operation called a right circular rotation on an array of integers. One rotation operation
 * moves the last array element to the first position and shifts all remaining elements right one. To test Sherlock's
 * abilities, Watson provides Sherlock with an array of integers. Sherlock is to perform the rotation operation a number
 * of times then determine the value of the element at a given position.
 *
 * For each array, perform a number of right circular rotations and return the values of the elements at the given
 * indices.
 *
 * Example
 * a = [3, 4, 5]
 * k = 2
 * queries = [1, 2]
 *
 * Here k is the number of rotations on a, and queries holds the list of indices to report.
 * First we perform the two rotations: [3,4,5] -> [5,3,4] -> [4,5,3]
 *
 * Now return the values from the zero-based indices 1 and 2 as indicated in the queries array.
 * a[1] = 5
 * a[2] = 3
 *
 * Function Description
 * Complete the circularArrayRotation function in the editor below.
 * circularArrayRotation has the following parameter(s):
 *
 *     int a[n]: the array to rotate
 *     int k: the rotation count
 *     int queries[1]: the indices to report
 *
 * Returns
 *
 *     int[q]: the values in the rotated a as requested in m
 *
 * Sample Input 0
 * 3 2 3
 * 1 2 3
 * 0
 * 1
 * 2
 *
 * Sample Output 0
 * 2
 * 3
 * 1
 *
 * Explanation 0
 * After the first rotation, the array is [3, 1, 2].
 * After the second (and final) rotation, the array is [2, 3, 1].
 * We will call this final state array b = [2, 3, 1].
 * For each query, we just have to get the value of b[queries[i]]
 *
 */
public class CircularArrayRotation {

    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        data.add(3);
        data.add(4);
        data.add(5);

        List<Integer> query = new ArrayList<>();
        query.add(1);
        query.add(2);

        System.out.println(circularArrayRotation(data, 2, query));
    }

    /*
     * Complete the 'circularArrayRotation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER k
     *  3. INTEGER_ARRAY queries
     */
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        if(k > a.size()) {
            k = k % a.size();
        }

        List<Integer> firstK = a.subList(0, a.size() - k);
        List<Integer> lastK = a.subList(a.size() - k, a.size());

        List<Integer> newList = new ArrayList<>(lastK);
        newList.addAll(firstK);

        List<Integer> result = new ArrayList<>();
        for (Integer q: queries) {
            result.add(newList.get(q));
        }

        return result;
    }
}
