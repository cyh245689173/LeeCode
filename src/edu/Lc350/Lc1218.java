package edu.Lc350;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther xiaochen
 * @create 2022-05-05 10:06
 */
public class Lc1218 {
    public int longestSubsequence(int[] arr, int difference) {
        //初始化结果为1，因为每个数字都可以单独作为一个等差子序列
        int ans = 1;
        //辅助dp哈希表,键为当前元素，值为最长子序列长度
        Map<Integer, Integer> dp = new HashMap<Integer, Integer>();

        //从头遍历数组,遇到一个数 num，判断num - difference在不在数组里面
        // 也就是看看能不能形成以num为结尾的等差数组
        for (int num : arr) {
            //如果dp数组中存在num - difference，就加一存入以当前元素为键的值中,即dp[i] = dp[i - difference ] + 1
            //如果dp数组中不存在num - difference，就初始值为一存入以当前元素为键的值中,即当前元素为一个单独的定差子序列
            int val = dp.getOrDefault(num - difference, 0) + 1;
            //当前位置的最长子序列长度
            dp.put(num, val);
            //记录下来以num结尾的等差数组的长度
            ans = Math.max(ans, val);
        }
        return ans;

    }
}
