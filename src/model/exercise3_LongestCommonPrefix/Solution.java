package model.exercise3_LongestCommonPrefix;

import java.util.Arrays;

public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // 1. Sort the array alphabetically
        Arrays.sort(strs);

        // 2. Take the first and the last strings (the most different after sorting)
        String first = strs[0];
        String last = strs[strs.length - 1];
        int i = 0;

        // 3. Compare only these two strings
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        // 4. The common prefix between the first and last is the prefix for the entire group
        return first.substring(0, i);
    }
}

class Solution2 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i <= strs.length - 1; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.length() == 0) return "";
            }
        }
        return prefix;
    }
}

class Main {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String result = Solution.longestCommonPrefix(strs);
        System.out.println(result);
    }
}