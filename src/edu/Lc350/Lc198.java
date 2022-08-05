package edu.Lc350;

/**
 * @auther xiaochen
 * @create 2022-05-02 9:59
 */
public class Lc198 {
    public int rob(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int length = nums.length;


        if (length == 1) {
            return nums[0];
        }

        //边界条件
        //记录前nums[i - 1]的最大金额
        int first = nums[0];
        //记录前nums[i-2]的最大金额
        int second = Math.max(nums[0], nums[1]);

        for (int i = 2; i < length; i++) {
            //防止数据丢失
            int temp = second;
            //状态转移方程
            second = Math.max(second, first + nums[i]);
            first = second;
        }
        return second;


    }
}
