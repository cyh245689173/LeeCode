package edu.ysu.arr_;

import java.util.Arrays;

/**
 * @auther xiaochen
 * @create 2022-02-15 17:40
 */
public class L34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;


        int[] ints = searchRange(nums, target);
        System.out.println(Arrays.toString(ints));
    }


    public static int[] searchRange(int[] nums, int target) {

        if (nums.length == 0 ||target < nums[0] || target > nums[nums.length - 1]) {
            return new int[] {-1,-1};
        }

        int leftBorder = getLeftBorder(nums, target);
        int rightBorder = getRightBorder(nums, target);


        return new int[]{leftBorder, rightBorder};


    }

    public static int getRightBorder(int[] nums, int target) {

        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            //目标值在中心点右侧
            if (nums[mid] < target) {
                //下次查找范围为[mid + 1,right]
                left = mid + 1;
                //目标值在中心点左侧
            } else if (nums[mid] > target) {
                //下次查找范围为[left,mid - 1]
                right = mid - 1;
                //目标值等于中心点，但不确定是否为右边界，继续向右查找
            } else {
                //下次查找范围为[mid + 1,right]
                left = mid + 1;

            }
        }

        if (nums[right] == target){
            return right;
        }else {
            return - 1;
        }

    }

    public static int getLeftBorder(int[] nums, int target) {

        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            //目标值在中心点右侧
            if (nums[mid] < target) {
                //下次查找范围为[mid + 1,right]
                left = mid + 1;
                //目标值在中心点左侧
            } else if (nums[mid] > target) {
                //下次查找范围为[left,mid - 1]
                right = mid - 1;
                //目标值等于中心点，但不确定是否为左边界
            } else {
                //下次查找范围为[left,mid - 1]
                right = mid - 1;
            }
        }

        if (nums[left] == target){
            return left;
        }else {
            return - 1;
        }

    }
}
