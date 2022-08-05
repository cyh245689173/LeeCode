package edu.ysu.arr_;

import java.util.Arrays;

/**
 * @auther xiaochen
 * @create 2021-11-06 17:44
 */
public class L286 {
    public static void main(String[] args) {

    }


    public int missingNumber(int[] nums) {

        //暴力法：对数组进行排序，遍历数组，找到第一个丢失的数字即可
        Arrays.sort(nums);
        for (int i = 0;i < nums.length;i++){
            if (i != nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}
