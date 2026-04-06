package model.exercise7_RemoveElement;

public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) return 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}

class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("-------------- Example 1 --------------");
        int[] nums1 = {3, 2, 2, 3};
        int k1 = s.removeElement(nums1, 3);
        printResult(nums1, k1);

        System.out.println("-------------- Example 2 --------------");
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int k2 = s.removeElement(nums2, 2);
        printResult(nums2, k2);
    }

    private static void printResult(int[] nums, int k) {
        System.out.println("Elementos únicos (k): " + k);
        System.out.print("Arreglo modificado: [");
        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                System.out.print(nums[i]);
            } else {
                System.out.print("_");
            }
            if (i < nums.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}