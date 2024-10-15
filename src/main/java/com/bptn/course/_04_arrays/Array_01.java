package com.bptn.course._04_arrays;

import java.util.Arrays;

public class Array_01 {
	public static void main(String[] args) {
		
		int[] numbers = {22, 7, 10, 12, 3};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("The size of the Array is: " + numbers.length);

        float[] newArray = {-0.965F, 3.124F, 79.578F, -30.90F, 56.76F};
        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));
        System.out.println("length of array: " + newArray.length);

        boolean[] conditions = {true, false, false, true, true};
        System.out.println(Arrays.toString(conditions));
        System.out.println("length of array: " + conditions.length);

        float resultOne = (float) numbers[2] * newArray[3];
        System.out.println(resultOne);

        int[][] multiArrayOne = new int[2][3]; //2 rows and 3 columns
        multiArrayOne[0][0] = 1;
        multiArrayOne[0][1] = 2;
        multiArrayOne[0][2] = 3;
        multiArrayOne[1][0] = 4;
        multiArrayOne[1][1] = 5;
        multiArrayOne[1][2] = 6;

        System.out.println(Arrays.deepToString(multiArrayOne));

        //Multidimensional Arrays
        //method One

        //MethodTwo
        int[][] multiArrayTwo ={{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(multiArrayTwo));
	}

}
