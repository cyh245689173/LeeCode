package edu.ysu.arr_;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @auther xiaochen
 * @create 2022-04-08 8:12
 */
public class Lc169 {
    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {

        /*
         *
         * 例子：
         *
         * 原始数组：1 2 1 1 3
         * 排序数组：1 1 1 2 3
         *
         * 原始数组：2 2 1 2 3
         * 排序数组：1 2 2 2 3
         *
         *
         * 原始数组：3 2 1 3 3
         * 排序数组：1 2 3 3 3
         * */
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n / 2];
    }
}
