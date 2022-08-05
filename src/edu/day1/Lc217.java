package edu.day1;

import java.lang.annotation.ElementType;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @auther xiaochen
 * @create 2022-03-25 14:55
 */
public class Lc217 {
    public static void main(String[] args) {

    }


    public boolean containsDuplicate(int[] nums) {
        //使用排序，排序完成后重复元素肯定是相邻的
        //使用两个连续的指针进行对比，若相同则直接返回true

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public int maxSubArray(int[] nums) {

        /*
         *
         * 使用f(i)来表示以当前元素为结尾元素的最大子序列和，
         * 因为一共有n个元素，所以f(i)也有n个，所以需要创建一个长度为n的f数组，时间复杂度为O(N)，
         * 但是考虑到f(i) 只和 f(i - 1)相关，所以只需要使用一个变量保存f(i)即可，时间复杂度为O(1)
         * 则f(i）的更新规则为：当前值 和 f(i - 1) 加上当前值 中的最大值
         * 即状态转移方程为
         *           f(i)  =  max{(f(i-1) + nums[i]),nums[i]}
         * 只需计算出每个元素的f(i)，最后返回最大值即可
         *
         *
         *
         * */



        //使用sum代表f(i)，初始化为0
        int sum = 0;
        //ans 代表结果
        int ans = nums[0];

        for (int n : nums) {
            sum = Math.max(sum + n, n);
            ans = Math.max(sum,ans);
        }

        return ans;
    }


}

