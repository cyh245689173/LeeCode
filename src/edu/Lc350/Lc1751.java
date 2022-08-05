package edu.Lc350;

import java.util.Arrays;

/**
 * @auther xiaochen
 * @create 2022-05-09 10:29
 */
public class Lc1751 {

    public int maxValue(int[][] es, int k) {
        int n = es.length;

        Arrays.sort(es, (a, b) -> a[1] - b[1]);

        //辅助dp数组，dp[i][j]
        //i表示考虑了前i个事件
        //j表示还剩下多少选择
        //dp[i][j]表示考虑了前i个事件还剩j个选择的最大价值
        int[][] dp = new int[n + 1][k + 1];

        for (int i = 1; i <= n; i++) {
            int[] ev = es[i - 1];
            int s = ev[0], e = ev[1], v = ev[2];

            // 找到第 i 件事件之前，与第 i 件事件不冲突的事件
            // 对于当前事件而言，冲突与否，与 j 无关
            int last = 0;
            for (int p = i - 1; p >= 1; p--) {
                int[] prev = es[p - 1];
                if (prev[1] < s) {
                    last = p;
                    break;
                }
            }

            for (int j = 1; j <= k; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[last][j - 1] + v);
            }
        }
        return dp[n][k];


    }


}
