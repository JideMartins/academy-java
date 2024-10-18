package com.bptn.course._14_sorting;

import java.util.Arrays;

public class InsertionSort {
	private static void insertionSort(int[] elements) {
		
		for (int i=1; i<elements.length; i++) {
			
			int temp = elements[i];
			int possibleIndex = i;
			
			/**
			 * We move the element one position to the right if its smaller than the current element
			 */
			while (possibleIndex > 0 && temp<elements[possibleIndex-1]) {
				elements[possibleIndex] = elements[possibleIndex -1];
				possibleIndex--;
			}
			/**
			 * Once we found the insertion point, we insert the current element
			 */
			
			elements[possibleIndex] = temp;
		}

	}

	public static void main(String[] args) {
		int[] arr1 = {3,6,9,1,0,4,6,7,9,23,445,50,2,2};
		
		System.out.println("Before: " + Arrays.toString(arr1));
		
		insertionSort(arr1);
		
		System.out.println("After: " + Arrays.toString(arr1));

	}

}
