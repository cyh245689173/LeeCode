package edu.Lc350;

/**
 * @auther xiaochen
 * @create 2022-05-03 9:59
 */
public class Lc1143 {
    public int longestCommonSubsequence(String text1, String text2) {

        int m = text1.length();
        int n = text2.length();

        //辅助dp数组
        int[][] dp = new int[m + 1][n + 1];

        //dp[i][j]表示字符串text1的[1,i]区间 和text2的[1,j]区间的最长公共子序列长度。

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];


    }
}
