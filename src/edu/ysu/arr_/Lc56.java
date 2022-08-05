package edu.ysu.arr_;

import java.util.Arrays;

/**
 * @auther xiaochen
 * @create 2022-04-13 11:08
 */
public class Lc56 {
    public static void main(String[] args) {

    }

    public int[][] merge(int[][] intervals) {
        /*
         *1.首先对数组进行牌组，先比较区间开始，如果相同在比较区间结束
         * 2.使用双指针，左指针指向当前区间的开始
         * 3.使用一个变量end记录连续的范围
         * 4.右指针向后寻找，如果后续的区间开始值比end小，则说明两区间有重复元素，可以归并到一起
         * 5.更新end
         * 6.直到区间断开，把end作为区间结束存储到答案数组中
         * 7.移动左指针，指向新的未归并的数组
         *两两合并
         *
         * */
        // 先按照区间起始位置排序
        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);
        // 遍历区间
        int[][] res = new int[intervals.length][2];
        int idx = -1;
        for (int[] interval : intervals) {
            // 如果结果数组是空的，或者当前区间的起始位置 > 结果数组中最后区间的终止位置，
            // 则不合并，直接将当前区间加入结果数组。
            if (idx == -1 || interval[0] > res[idx][1]) {
                res[++idx] = interval;
            } else {
                // 反之将当前区间合并至结果数组的最后区间
                res[idx][1] = Math.max(res[idx][1], interval[1]);
            }
        }
        return Arrays.copyOf(res, idx + 1);
    }

}
