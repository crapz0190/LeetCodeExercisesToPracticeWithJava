package model.exercise6_RemoveDuplicatesFromSortedArray;

import java.util.Arrays;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int size = nums.length;
        if (nums == null || size == 0) return 0;

        int i = 1;
        for (int j = 1; j < size; j++) {
            if (nums[j] != nums[j - 1]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Caso de prueba 1
        int[] nums1 = {1, 2, 3, 5, 5, 6, 6, 6, 7};
        System.out.println("Caso 1 - Original: " + Arrays.toString(nums1));
        int k1 = solution.removeDuplicates(nums1);
        printResult(nums1, k1);

        // Caso de prueba 2
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("\nCaso 2 - Original: " + Arrays.toString(nums2));
        int k2 = solution.removeDuplicates(nums2);
        printResult(nums2, k2);
    }

    private static void printResult(int[] nums, int k) {
        System.out.println("Elementos únicos (k): " + k);
        System.out.print("Arreglo modificado: [");
        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                System.out.print(nums[i]);
            } else {
                System.out.print("_"); // representa los valores que se ignoran
            }
            if (i < nums.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}