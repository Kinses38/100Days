package com.kinses38.OHDOC.day18HackerRank;

import java.util.Comparator;

public class Checker implements Comparator<Player> {

	@Override
	public int compare(Player a, Player b) {
		if (a.score > b.score)
			return -1;
		else if (a.score < b.score)
			return 1;
		else
			return (a.name.compareTo(b.name));
	}
}

class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}