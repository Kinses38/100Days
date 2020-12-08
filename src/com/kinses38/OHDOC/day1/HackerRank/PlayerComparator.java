package com.kinses38.OHDOC.day1.HackerRank;

import java.util.Arrays;
import java.util.Comparator;

//https://www.hackerrank.com/challenges/ctci-comparator-sorting/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting
class Player {
    public String name;
    public int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        if (a.score < b.score)
            return 1;
        else if (a.score > b.score)
            return -1;
        else return a.name.compareTo(b.name);
    }
}

class PlayerComparator {

    public static void main(String[] args) {
        Checker checker = new Checker();
        Player player1 = new Player("amy", 100);
        Player player2 = new Player("david", 100);
        Player player3 = new Player("heraldo", 50);
        Player player4 = new Player("aakansha", 75);
        Player player5 = new Player("aleksa", 150);
        Player[] players = {player1, player2, player3, player4, player5};

        Arrays.sort(players, checker);
        for (int i = 0; i < players.length; i++) {
            System.out.printf("%s %s\n", players[i].name, players[i].score);
        }
    }
}
