package edu.ysu.arr_;

import java.util.Arrays;

/**
 * @auther xiaochen
 * @create 2022-02-17 15:31
 */
public class L283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }


    public static void moveZeroes(int[] nums) {

        int slow = 0,fast = 0;

        while (fast < nums.length){
            if (nums[fast] != 0){
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
//                swap(nums[slow],nums[fast]);
                slow++;
            }
            fast++;
        }
    }

    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
