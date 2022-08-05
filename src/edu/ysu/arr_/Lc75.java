package edu.ysu.arr_;

import java.util.Arrays;

/**
 * @auther xiaochen
 * @create 2022-04-12 20:59
 */
public class Lc75 {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void sortColors(int[] nums) {


        int len = nums.length;
        if (nums == null || len < 2) {
            return;
        }

        /*
         * 使用两个指针p_zero和p_two来划分0，1，2的范围
         *  即将数组分为[0,p_zero）,[p_zero,i）,[p_two,len-1]
         *
         *
         * */

        //为了保证初始化的时候 [0, p_zero)为空，设置p_zero = 0
        int p_zero = 0;
        //为了保证初始化的时候 [p_two,len-1] 为空，设置 p_two = len
        int p_two = len;


        int i = 0;
        //当i==p_two时，子区间正好覆盖全部数组
        while (i < p_two) {
            if (nums[i] == 0) {
                swap(nums, p_zero, i);
                p_zero++;
                i++;
            } else if (nums[i] == 2) {
                p_two--;
                swap(nums, p_two, i);

            } else {
                i++;
            }
        }


    }

    private static void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}
