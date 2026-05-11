package model.exercise13_ClimbingStairs;

public class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int first = 1;
        int second = 2;

        for (int i = 3; i <= n; i++) {
            int current = first + second;
            first = second;
            second = current;
        }

        return second;
    }
}

class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 5;
        System.out.println(s.climbStairs(n));
    }
}
