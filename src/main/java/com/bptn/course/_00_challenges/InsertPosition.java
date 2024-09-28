package com.bptn.course._00_challenges;

/*Given a sorted array of distinct integers and a target value,
return the index if the target is found. If not, return the
index where it would be if it were inserted in order.
*/

public class InsertPosition {
	public static int searchInsert(int[] arrayItem, int target) {
        int arrayLen = arrayItem.length;
        for (int i = 0; i < arrayLen; i++){
            if (arrayItem[i] >= target){
                return i;
            }
        }
        return arrayLen;
    }

	public static void main(String[] args) {
		int arrayOne[] = {1, 3, 5, 7, 9} , targetOne = 9;
        int arrayTwo[] = {1, 3, 5, 6} , targetTwo = 3;
        int arrayThree[] = {1, 3, 5, 6, 7} , targetThree = 7;

        System.out.println(searchInsert(arrayOne, targetOne));
        System.out.println(searchInsert(arrayTwo, targetTwo));
        System.out.println(searchInsert(arrayThree, targetThree));

	}

}
