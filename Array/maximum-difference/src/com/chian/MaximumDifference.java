package com.chian;

public class MaximumDifference {

	public static void main(String[] args) {
		int[] nums = new int[] { 5, 9, 2, 3, 3, 9, 1, 4, 2 }; // 8

		System.out.println(maxDifference(nums));
	}

	public static int maxDifference(int[] nums) {
		int min = nums[0];
        int max = nums[0];

        for (int value : nums) {
            if (min > value) {
                min = value;
            }
            if (max < value) {
                max = value;
            }
        }
        return max - min;
	}
}
