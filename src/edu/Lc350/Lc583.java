package edu.Lc350;

/**
 * @auther xiaochen
 * @create 2022-05-16 8:59
 */
public class Lc583 {

    public int minDistance(String word1, String word2) {
        /*
         * 动态规划
         * 类似于找出两个字符串的最长公共子序列
         * 找出后，用两个字符串的长度之和减去两倍的公共子序列的长度即为所需删除的最小步数
         * */

        int m = word1.length();
        int n = word2.length();
        //辅助dp数组
        //dp[i][j] 表示 word1 的前 i 个字符与 word2 的前 j 个字符的最长公共子序列。
        int[][] dp = new int[m + 1][n + 1];

        //边界条件
        dp[0][0] = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return m + n - 2 * dp[m][n];


    }
}
