package com.bptn.course._04_arrays;

public class Exercise02 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		int key = 8;
		
		int index = -1;
		
		for(int i = 0; i<nums.length; i++) {
			if (nums[i]==key) {
				index = i;
			}
		}
	}
}
