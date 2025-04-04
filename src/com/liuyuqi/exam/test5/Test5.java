package com.liuyuqi.exam.test5;

public class Test5 {
    public static void main(String[] args) {
        // 实现二分查找
        int[] nums = {10, 30, 50, 50, 90, 100, 100};
        int[] result = binarySearch(nums, 100);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }

    public static int[] binarySearch(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                int i = mid;
                int j = i;
                while (i > 0 && nums[i] == nums[i - 1]) {
                    i--;
                }
                while (j < nums.length-1 && nums[j] == nums[j + 1]) {
                    j++;
                }
                return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }
}
