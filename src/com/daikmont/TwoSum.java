package com.daikmont;

//задача на перебор пар чисел из массива, чтобы их сумма давала = k

public class TwoSum {

    static int[] array = {2, 5, 6, 1, 6, 7, 2, 7, 8, 3, 5, 4, 7};
    static int k = 10;

    public static void main(String[] args) {
        showArray(twoSum(array, k));
    }
    static int[] twoSum(int[] nums, int k){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == k) {
                    return new int[]{nums[i], nums[j]};
                }
            }
        }
        return new int[0];
    }

    static void showArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
    }
}
