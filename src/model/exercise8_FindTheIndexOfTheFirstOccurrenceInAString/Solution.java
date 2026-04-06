package model.exercise8_FindTheIndexOfTheFirstOccurrenceInAString;

public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) return -1;

        int hLen = haystack.length();
        int nLen = needle.length();

        for (int i = 0; i <= hLen - nLen; i++) {
            if (haystack.substring(i, i + nLen).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.strStr("sadbutsad", "sad"));
        System.out.println(solution.strStr("hello", "ll"));
        System.out.println(solution.strStr("leetcode", "leeto"));
    }
}