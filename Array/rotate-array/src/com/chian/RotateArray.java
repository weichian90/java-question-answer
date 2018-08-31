package com.chian;

public class RotateArray {
	//Question: Given an array, rotate the array to the right by k steps, where k is non-negative.
	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4,5,6,7};
		rotate(nums, 3);
		print(nums);
	}
	
	/**
	 * 
	 * @param nums
	 * @param k - number of steps
	 */
	public static void rotate(int[] nums, int k) {
		k %= nums.length; //when k is bigger than nums.length, it's actually cycling through the array
	    reverse(nums, 0, nums.length - 1); // reverse the whole array
	    reverse(nums, 0, k - 1); // reverse the section before k
	    reverse(nums, k, nums.length - 1); // reverse the section after k
	}
	
	public static void reverse(int[] nums, int start, int end) {
	    while (start < end) {
	        int temp = nums[start];
	        nums[start] = nums[end];
	        nums[end] = temp;
	        start++;
	        end--;
	    }
	    
	}
	
	public static void print(int[] nums) {
		for(int i: nums) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
