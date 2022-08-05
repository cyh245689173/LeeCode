package edu.Lc350;

/**
 * @auther xiaochen
 * @create 2022-05-17 9:09
 */
public class Lc357 {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        //辅助dp数组
        int[] dp = new int[n + 1];
        //边界条件
        dp[0] = 1;
        dp[1] = 10;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + (dp[i - 1] - dp[i - 2]) * (10 - (i - 1));
        }
        return dp[n];
    }
}
