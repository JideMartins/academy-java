package com.bptn.course._14_sorting;

import java.util.Arrays;

public class SortTest {
	public static void insertionSort(int[] elements) {
		
		//
		for (int j = 1; j < elements.length; j++) {
			int temp = elements[j];
			int possibleIndex = j;
			
			
			while (possibleIndex > 0 && temp < elements[possibleIndex - 1]) {
				elements[possibleIndex] = elements[possibleIndex - 1];
				possibleIndex--;
			}

			elements[possibleIndex] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 3, 6, 1, 8, 7, 11, 18, 14, 13 };

		System.out.println("Before: " + Arrays.toString(arr1));

		insertionSort(arr1);

		System.out.println("After: " + Arrays.toString(arr1));

	}

}
