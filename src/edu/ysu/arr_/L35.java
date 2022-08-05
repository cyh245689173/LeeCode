package edu.ysu.arr_;

/**
 * @auther xiaochen
 * @create 2022-02-15 17:17
 */
public class L35 {
    public static void main(String[] args) {

    }

    public static int searchInsert(int[] nums, int target) {

        /*
         * 算法思想：
         *           因为数组有序，且时间复杂度规定为O(logN)，采用二分法
         *           若存在，找到目标值，
         *           若不存在，找到目标值应该插入的位置
         * */
        //左闭右闭写法
        int left = 0, right = nums.length - 1;


        while (left <= right) {
            //防止溢出
            int mid = left + ((right - left) >> 1);
            if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        //据模拟，插入位置为left
        return left;

    }
}
