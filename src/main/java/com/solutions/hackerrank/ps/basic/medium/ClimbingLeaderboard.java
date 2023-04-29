package com.solutions.hackerrank.ps.basic.medium;

import java.util.*;
import java.util.stream.Collectors;


/**
 An arcade game player wants to climb to the top of the leaderboard and track their ranking.
 The game uses Dense Ranking, so its leaderboard works like this:

 The player with the highest score is ranked number 1 on the leaderboard.
 Players who have equal scores receive the same ranking number, and the next player(s) receive the immediately
 following ranking number.

 Example
 ranked = [100, 90, 90, 80]
 player = [70, 80. 105]
 The ranked players will have ranks 1, 2, and 3, respectively. If the player's scores are 70, 80
 and 105, their rankings after each game are 4th, 3rd and 1th. Return [4,3,1].

 Function Description
 Complete the climbingLeaderboard function in the editor below.
 climbingLeaderboard has the following parameter(s):

 int ranked[n]: the leaderboard scores
 int player[m]: the player's scores

 Returns
 int[m]: the player's rank after each new score

 Input Format
 The first line contains an integer n, the number of players on the leaderboard.
 The next line contains space-separated integers ranked[i], the leaderboard scores in decreasing order.
 The next line contains an integer, m, the number games the player plays.
 The last line contains m space-separated integers player[j], the game scores.

 Constraints
 The existing leaderboard, ranked, is in descending order
 The player's scores, player, are in ascending order.

 Sample input 1
 ranked 100 100 50 40 40 20 10
 player 5 25 50 120

 Sample Output 1
 6 4 2 1

 Explanation
 Alice starts playing with 7 players already on the leaderboard.
 After Alice finishes game 0, her score is 5 and her ranking is 6
 After Alice finishes game 1, her score is and her ranking is 4
 and so on
 */
public class ClimbingLeaderboard {


    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        if (Objects.isNull(ranked) || Objects.isNull(player) || ranked.isEmpty() || player.isEmpty()) {
            return new ArrayList<>();
        }
        List<Integer> rankedNoDuplicates = ranked.stream()
                .distinct()
                .collect(Collectors.toList());
        int rankedIndex = 0;
        List<Integer> result = new ArrayList<>();
        for(int i = player.size() - 1; i >= 0; i--) {
            Integer playerValue = player.get(i);

            while(!isHere(rankedNoDuplicates, rankedIndex, playerValue)) {
                rankedIndex += 1;
            }
            result.add(rankedIndex+1);
        }

        return result.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    private static boolean isHere(List<Integer> data, int index, Integer value) {
        Integer left = Integer.MAX_VALUE;
        try {
            left = data.get(index-1);
        } catch (Exception ex) {}

        Integer right = Integer.MIN_VALUE;
        try {
            right = data.get(index);
        } catch (Exception ex) {}

        return left > value && value >= right;
    }


    /**
         correct but time-consuming
     public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
         SortedSet<Integer> all = new TreeSet<>();
         all.addAll(ranked);


         List<Integer> result = new ArrayList<>();
         for(Integer playerIndex : player) {
         all.add(playerIndex);
         List<Integer> data = new ArrayList<>(all);
         Integer integer = data.indexOf(playerIndex);
         result.add(data.size() - integer);
         all.remove(playerIndex);
         }

         return result;
     }


     */
}
