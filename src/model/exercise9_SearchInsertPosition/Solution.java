package model.exercise9_SearchInsertPosition;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 5, 7, 9, 11, 13, 23, 43, 51};
        int target = 6;
        System.out.println(solution.searchInsert(nums, target));
    }
}
