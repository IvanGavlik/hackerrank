package com.solutions.hackerrank.ps.basic.medium;

import java.util.Arrays;

/**
 * In this challenge, the task is to debug the existing code to successfully execute all provided test files.
 *
 * Given an array of n distinct integers, transform the array into a zig zag sequence by permuting the array elements.
 * A sequence will be called a zig zag sequence if the first k elements in the sequence are in increasing order
 * and the last k elements are in decreasing order, where k = (n +1 )/ 2.
 * You need to find the lexicographically smallest zig zag sequence of the given array.
 *
 * Example
 * a = [2, 3, 5, 1, 4]
 * Now if we permute the array as [1, 4, 5, 3, 2], the result is a zig zag sequence.
 *
 * Debug the given function findZigZagSequence to return the appropriate zig zag sequence for the given input array.
 * Note: You can modify at most three lines in the given code. You cannot add or remove lines of code.
 *
 * Input Format
 * The first line contains t the number of test cases. The first line of each test case contains an integer n,
 * denoting the number of array elements.
 * The next line of the test case contains n elements of array
 *
 * Constraints
 * 1 <= t <= 20
 * t <= n <= 10000 (n is always odd)
 * 1 <= ai <= 10⁹
 *
 * Output Format
 * For each test cases, print the elements of the transformed zig zag sequence in a single line.
 *
 * Sample Input 0
 * 1
 * 7
 * 1 2 3 4 5 6 7
 * Sample Output 0
 * 1 2 3 7 6 5 4
 *
 * Original code https://www.hackerrank.com/challenges/zig-zag-sequence/problem?isFullScreen=true
 */
public class ZigZagSequence {
    public static void main (String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        findZigZagSequence(a, 7);
    }

    // Note: You can modify at most three lines in the given code. You cannot add or remove lines of code.
    public static void findZigZagSequence(int [] a, int n){
        Arrays.sort(a);
        int mid = n/2; // old (n+1)/2
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = mid + 1;
        int ed = n - 2; // old n - 1
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1; // old ed + 1
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }

}
