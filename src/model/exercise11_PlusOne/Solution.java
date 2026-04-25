package model.exercise11_PlusOne;

import java.util.Arrays;

public class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}

class Main {
    public static void main(String[] args) {
        int[] digits = {2, 3, 1, 9, 9};
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.plusOne(digits)));
    }
}
