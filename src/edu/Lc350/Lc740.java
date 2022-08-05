package edu.Lc350;

/**
 * @auther xiaochen
 * @create 2022-05-02 10:41
 */
public class Lc740 {
    public int deleteAndEarn(int[] nums) {
        /*
         * 每个位置上的数字都是在前两种结果的基础上进行选择的：
         *       1.如果不删除当前i位置元素，则得到的是前一个位置上元素的最优解。
         *       2.如果删除当前i位置元素，则会得到i -2 位置上的最优结果加上当前值乘以当前值的个数。
         *
         * 注：偷了第i位置上的元素之后，再偷这个元素就不会有问题。
         * 每次取以上两个结果中最大的值进行记录
         *
         *
         * 打家劫舍升级版
         * */
        int length = nums.length;

        if (nums == null || length == 0) {
            return 0;
        }

        if (length == 1) {
            return nums[0];
        }


        int max = nums[0];

        for (int i = 0; i < length; i++) {
            max = Math.max(max, nums[i]);
        }

        //构造一个记录数组元素出现次数的辅助数组
        //  nums:  2 , 4, 3, 2, 3, 3
        //  all:   0,  0, 2, 3, 1

        int[] all = new int[max + 1];
        for (int item : nums) {
            all[item]++;
        }

        //辅助dp数组
        int[] dp = new int[max + 1];
        //边界条件
        dp[1] = all[1] * 1;
        dp[2] = Math.max(dp[1], all[2] * 2);

        for (int i = 2; i <= max; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + all[i] * i);
        }
        return dp[max];
    }
}
