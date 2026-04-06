package model.exercise2_RomanToInteger;

import java.util.HashMap;
import java.util.Map;

class SolutionRomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int total = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int currentVal = values.get(s.charAt(i));

            if (i < n - 1 && currentVal < values.get(s.charAt(i + 1))) {
                total -= currentVal;
            } else {
                total += currentVal;
            }
        }
        return total;
    }
}

class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = value(s.charAt(i));
            if (i < s.length() - 1 && curr < value(s.charAt(i + 1))) {
                sum -= curr;
            } else {
                sum += curr;
            }
        }
        return sum;
    }

    public int value(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;

        return 0;
    }
}