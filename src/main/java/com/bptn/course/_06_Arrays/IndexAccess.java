package com.bptn.course._06_Arrays;

public class IndexAccess {

	public static void main(String[] args) {
		// Here's an array of high scores:
		int[] highScores = { 10, 9, 8, 15};

		// Starting simple, we can access a variable within this array as shown above:
		System.out.println(highScores[1]); // This line will print out 9 because 9 is in the 1st index. Remember that in Java, indexes start from 0, so the value at the zeroth index would be 10.

		// We can go further, though. Let's make a variable, then use it to access our array:
		int here = 3; // The variable "here" now contains the value 3.

		// Now that we have an array called highScores and another variable called here, we can use them together:
		System.out.println(highScores[here]);

		// The line above is effectively the same as this:
		System.out.println(highScores[3]);

		// Both lines 11 and 14 above will print out 15 because that is the element in the third index of our highScores array.

		// In this line, we use can use the "here" variable to reassign the array value at index 3. Again, this happens because "here" is equal to 3, but this time we're using the = operator to set that index value to 11:
		highScores[here] = 11; // This rewrites the value at index 3 (the 15) with an 11.

		// What do you think the following line will print out now?
		System.out.println(highScores[here]);

		// Even with arithmetic operations, our "here" variable will still work:
		System.out.println(highScores[here - 3]); // This would print out the zeroth index because 3-3 = 0. The console will show a 10 when this line runs, as that's what's in the zeroth index.

	}

}
