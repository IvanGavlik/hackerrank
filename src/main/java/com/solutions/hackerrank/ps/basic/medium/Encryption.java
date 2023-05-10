package com.solutions.hackerrank.ps.basic.medium;

/**
 * An English text needs to be encrypted using the following encryption scheme.
 * First, the spaces are removed from the text. Let L be the length of this text.
 *
 * Example
 * s = if man was meant to stay on the ground god would have given us roots
 * After removing spaces, the string is 54 characters long. sqer(54) is between 7 and 8, so it is written in the
 * form of a grid with 7 rows and 8 columns.
 *
 * ifmanwas
 * meanttos
 * tayonthe
 * groundgo
 * dwouldha
 * vegivenu
 * sroots
 *
 * The encoded message is obtained by displaying the characters of each column, with a space between column texts.
 * The encoded message for the grid above is:
 *   imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau
 *
 * Create a function to encode a message.
 *
 * Function Description
 * Complete the encryption function in the editor below.
 * encryption has the following parameter(s):
 *  string s: a string to encrypt
 * Returns
 *  string: the encrypted string
 * Input Format
 *  One line of text, the string
 * Constraints
 * s <= 81
 * s contains characters in the range ascii[a-z] and space, ascii(32).
 *
 * Sample input 0
 * hvaeaniceday
 * Sample output 0
 * hae and via ecy
 *
 * Sample input 1
 * feedthedog
 * Sample output 1
 * fto ehg ee dd
 */
public class Encryption {
    public static String encryption(String s) {
        final String trim = s.replaceAll("\\s", "");
        final int length = trim.length();
        int rows = (int) Math.floor(Math.sqrt(length));
        int cols = (int) Math.ceil(Math.sqrt(length));

        if (rows * cols < length) {
            rows += 1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < cols; i++) {
            for(int j = 0; j < rows; j++) {
                int index = i + j * cols;
                if (index < length) {
                    sb.append(trim.charAt(index));
                }
            }
            sb.append(" ");
        }

        return sb.toString().trim();
    }

}
