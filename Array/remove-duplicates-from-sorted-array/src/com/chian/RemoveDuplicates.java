package com.chian;

public class RemoveDuplicates {

	public static void main(String[] args) {
		RemoveDuplicates rd = new RemoveDuplicates();

		int[] sortedNums = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }; // 0, 1, 2, 3, 4
		int len = rd.removeDuplicatesWithSortedArray(sortedNums);
		rd.print(len, sortedNums);
		
		int[] unsortedNums = new int[] { 5, 9, 2, 3, 3, 9, 1, 4, 2 }; // 5, 9, 2, 3, 1, 4
		int len2 = rd.removeDuplicatesWithUnsortedArray(unsortedNums);
		rd.print(len2, unsortedNums);
	}

	public int removeDuplicatesWithSortedArray(int[] nums) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != nums[j]) {
				j++;
				nums[j] = nums[i];
			}

		}
		return ++j;
	}

	// FIXME: unable to get unique value of zero, as default value of creating an empty array will get value of zero
	public int removeDuplicatesWithUnsortedArray(int[] nums) {
		int currentPosition = 0;
		int[] outputArr = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {

			int count = 0;

			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == outputArr[j]) {
					count++;
					break;
				}
			}
			if (count == 0) {
				outputArr[currentPosition] = nums[i];
				currentPosition++;
			}
		}

		for (int i = 0; i < currentPosition; i++) {
			nums[i] = outputArr[i];
		}
		return currentPosition;
	}

	public void print(int len, int[] nums) {
		for (int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println("\n");
	}
}
