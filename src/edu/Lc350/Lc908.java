package edu.Lc350;

/**
 * @auther xiaochen
 * @create 2022-04-30 9:05
 */
public class Lc908 {
    public int smallestRangeI(int[] nums, int k) {
        int minNum = 10001, maxNum = 0;

        for (int num : nums) {
            minNum = Math.min(minNum, num);
            maxNum = Math.max(maxNum, num);
        }

        return Math.max(maxNum - minNum - 2 * k, 0);
    }
}
