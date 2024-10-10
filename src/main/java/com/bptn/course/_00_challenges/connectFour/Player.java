package com.bptn.course._00_challenges.connectFour;

import java.util.Scanner;

public class Player {
	private String name;
	private int playerNumber;
	private static Scanner scanner = new Scanner(System.in); // Static scanner to avoid creating multiple instances

	// Constructor that takes a name and player number
	public Player(String name, int playerNumber) {
		this.name = name;
		this.playerNumber = playerNumber;
	}

	// Getter method for name
	public String getName() {
		return name;
	}

	// Getter method for player number
	public int getPlayerNumber() {
		return playerNumber;
	}

	// Method to prompt player for a move (column number)
	public int makeMove() {
		System.out.println(name + ", make your move. What column do you want to put a token in?");
		int column = scanner.nextInt(); // Receive user input
		return column;
	}

	// Overriding toString method to return player info
	@Override
	public String toString() {
		return "Player " + playerNumber + " is " + name;
	}
}
