package com.solutions.hackerrank.ps.basic.easy;

import javax.print.DocFlavor;
import java.util.Objects;

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


    /*
     * Complete the 'saveThePrisoner' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     *  3. INTEGER s
     */

    public static int saveThePrisoner(int n, int m, int s) {
        // Terminated due to timeout :(
       CircularLinkedList list = CircularLinkedList.generate(n);
        return list.getValueFromNthNode(s, m);
    }

    static class CircularLinkedList {
        private Node head = null;

        /**
         * Generates CircularLinkedList.
         * @param n number of nodes
         * @return generated list
         */
        public static CircularLinkedList generate(int n) {
            CircularLinkedList list = new CircularLinkedList();
            for(int i = 0; i < n; i++) {
                list.addNode(new Node(i+1));
            }
            return list;
        }

        public int getValueFromNthNode(int start, int move) {
            Node item = head;
            int index = 1;
            int moveCounter = start == 1 ? 1 : 0;
            while (moveCounter != move)  {
                item = item.getNext();
                index += 1;

                if(index >= start) {
                    moveCounter += 1;
                }
            };
            return item.getValue();
        }
        public void addNode(Node n) {
            Node inputNode = new Node(n.getValue());
            if (head == null) {
                head = inputNode;
                head.setNext(inputNode);
                return;
            }

            Node item = head;
            while (!item.getNext().equals(head)) {
                item = item.getNext();
            }
            item.setNext(inputNode);
            inputNode.setNext(head);
        }
    }
    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return this.next;
        }

        @Override
        public String toString() {
            return "" + value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return value == node.value;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }
    }
    public static void main(String[] args) {
        System.out.println(
                saveThePrisoner(3, 7, 3) == 3 ? "it is correct good job" : "it is not correct bad");
    }
}
