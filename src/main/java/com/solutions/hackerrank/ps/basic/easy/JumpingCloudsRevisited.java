package com.solutions.hackerrank.ps.basic.easy;

import javax.sound.sampled.Line;

/**
 *
 * A child is playing a cloud hopping game. In this game, there are sequentially numbered clouds that can be
 * thunderheads or cumulus clouds. The character must jump from cloud to cloud until it reaches the start again.
 *
 * There is an array of clouds c, and an energy level e = 100. The character starts from c[0] and uses 1 unit of energy
 * to make a jump of size k to cloud c[i + k % n]. If it lands on a thundercloud c[i] = 1 its energy (e) decreases by 2
 * additional units. The game ends when the character lands back on cloud 0.
 *
 *
 * Given the values of n, k and the configuration of the clouds as an array c, determine the final value of e
 * after the game ends.
 *
 * Example.
 * c = [0, 0, 1, 0]
 * k = 2
 * The indices of the path are 0 -> 2 -> 0. The energy level reduces by 1 for each jump to 98.
 * The character landed on one thunderhead at an additional cost of 2 energy units. The final energy level is 96.
 *
 * Function Description
 *
 * Complete the jumpingOnClouds function in the editor below.
 *
 * jumpingOnClouds has the following parameter(s):
 *
 *     int c[n]: the cloud types along the path
 *     int k: the length of one jump
 *
 * Returns
 *     int: the energy level remaining.
 *
 * Constraints
 *  2 <= 25
 *  i <= k <= n
 *  n % k = 0
 *  c[i] element {0, 1}
 *
 *  Sample input
 *  n = 8
 *  k = 2
 *  c = [0, 0, 1, 0, 0, 1, 1, 0]
 *
 *  Sample output
 *  92
 *
 *  Explanation
 *  Observe that our thunderheads are the clouds numbered 2, 5, and 6.
 *  The character makes the following sequence of moves:
 *
 *  1. Move: 0 -> 2
 *     e = 100 - 1- 2 = 97
 *  2. Move: 2 -> 4
 * ,   e = 97 - 1 = 96
 *  3. Move: 4 -> 6
 *     e = 96 - 1- 2 = 93
 *  4. Move: 6 -> 0
 *     e = 93 - 1 = 92
 *
 */
public class JumpingCloudsRevisited {
    public static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;
        int index = 0;
        do {
            index = (index + k) % c.length;
            if (c[index] == 1) {
                energy -= 3;
            } else {
                energy -= 1;
            }
        } while (index != 0);

        return energy;
    }
}
