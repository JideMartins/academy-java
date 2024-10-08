package com.bptn.course._00_challenges.connectFour;

import java.util.Scanner;

public class Player {
	private String name;
	private int playerNumber;
	private Scanner playObj = new Scanner(System.in);
	
	public Player(String name, int playerNumber) {
		this.name = name;
		this.playerNumber = playerNumber;
	}

	public String getName() {
		return name;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}
	
	// Method to prompt player for a move (column number)
	public int makeMove() {
		System.out.println(name + ", make your move. What column do you want to put a token in?");
		int column = playObj.nextInt(); //receive user input
		return column;
	}
	
	@Override
	public String toString() {
		return "Player" + playerNumber + "is" + name;
	}
	
	
}
