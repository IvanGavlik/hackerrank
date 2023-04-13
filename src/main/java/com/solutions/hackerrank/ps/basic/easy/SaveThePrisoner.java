package com.solutions.hackerrank.ps.basic.easy;

/**
 * A jail has a number of prisoners and a number of treats to pass out to them. Their jailer decides the fairest way to
 * divide the treats is to seat the prisoners around a circular table in sequentially numbered chairs. A chair number
 * will be drawn from a hat. Beginning with the prisoner in that chair, one candy will be handed to each prisoner
 * sequentially around the table until all have been distributed.
 *
 * The jailer is playing a little joke, though. The last piece of candy looks like all the others, but it tastes awful.
 * Determine the chair number occupied by the prisoner who will receive that candy.
 *
 * Example
 * n = 4
 * m = 6
 * s = 2
 *
 * There are 4 prisoners, 6 pieces of candy and distribution starts at chair 2. The prisoners arrange themselves in
 * seats numbered 1 to 4. Prisoners receive candy at positions 2,3,4,1,2,3.
 * The prisoner to be warned sits in chair number 3.
 *
 * Function Description
 *
 * Complete the saveThePrisoner function in the editor below. It should return an integer representing the chair number
 * of the prisoner to warn.
 *
 * saveThePrisoner has the following parameter(s):
 *
 *     int n: the number of prisoners
 *     int m: the number of sweets
 *     int s: the chair number to begin passing out sweets from
 *
 * Returns
 *
 *     int: the chair number of the prisoner to warn
 *
 * Input Format
 *
 * The first line contains an integer t, the number of test cases.
 * The next lines each contain 3 space-separated integers:
 *
 * n : the number of prisoners
 * m : the number of sweets
 * s : the chair number to start passing out treats at
 *
 * Constraints
 *  1 <= t <= 100
 *  1 <= n <= 10⁹
 *  1 <= m <= 10⁹
 *  1 <= s <= n
 *
 * Sample Input 0
 * 2
 * 5 2 1
 * 5 2 2
 *
 * Sample Output 0
 * 2
 * 3
 *
 * Explanation 0
 * In the first query, there are n = 5 prisoners and sweets m = 2. Distribution starts at seat number s = 1.
 * Prisoners in seats numbered 1 and get 2 sweets. Warn prisoner 2.
 * In the second query, distribution starts at seat 2 so prisoners in seats 2 and 3 get sweets. Warn prisoner 3.
 */
public class SaveThePrisoner {

    /**
     *
     * @param n - number of prisoners
     * @param m - number of candy
     * @param s - start at
     * @return
     */
    public static int saveThePrisoner(int n,  int m,  int s) {
        int r = -1;
        if (hasCircle(n, m, s)) {
            r = ((s + m) - 1) % n;
        } else {
            r = s + m - 1;
        }

        if (r == 0) {
            return n; // zadnji
        }
        return r;
    }

    private static boolean hasCircle(int n, int m, int s) {
        return ((s + m) - 1) > n;
    }
    public static void main(String[] args) {
        System.out.println(
                saveThePrisoner(208526924 , 756265725, 150817879) == 72975907 ? "it is correct good job" : "it is not correct bad");
    }
}
