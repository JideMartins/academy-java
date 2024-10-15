package com.bptn.course.bigCodeFriday.week03._04_sumCalculator;

//SumCalculator class that extends Thread
class SumCalculator extends Thread {

	// The start point of the range
	private int start;

	// The end point of the range
	private int end;

	// The sum of the numbers in the range
	private int sum;

	// Constructor to set the start and end points of the range
	public SumCalculator(int start, int end) {
		this.start = start;
		this.end = end;
		this.sum = 0; // Initialize the sum to 0
	}

	// Override the run method to calculate the sum of the numbers in the range
	@Override
	public void run() {
		// Iterate through the numbers in the range and add them to the sum
		for (int i = start; i <= end; i++) {
			sum += i;
		}
	}

	// Method to get the sum of the numbers in the range
	public int getSum() {
		return sum;
	}
}
