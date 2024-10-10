package com.obsidi.course._01_variables;

public class VariableOperations {

	public static void main(String[] args) {
		int variableOne = 30;
		int variableTwo = 29;
		
		int varAdd = variableOne + variableTwo;
		int varSub = variableOne - variableTwo;
		int varMult = variableOne * variableTwo;
		double varDiv = (double) variableOne / variableTwo;  // Cast - At least one of the variables must be a double to get a proper decimal.
		
		System.out.println("first variable is: " + variableOne + ", second variable is:" + variableTwo);
		System.out.println("Addition of both variables will give: " + varAdd + ", while the difference will give: " + varSub);
		System.out.println("multiplying both variables would give: " + varMult + ", while the ratio of first variable to second will give: " + varDiv);
		
		//reassigning values
		variableOne = 60;
		variableTwo = 58;
		//Print values
		System.out.println("New values of variable one and two are: " + variableOne + " and " + variableTwo + " respectively.");
		
		char letterJ = 'J';
		String myName = "Jide";
		System.out.println("The shortform of my name is: " + myName + " and it starts with the letter " + letterJ + ".");
		

	}

}
