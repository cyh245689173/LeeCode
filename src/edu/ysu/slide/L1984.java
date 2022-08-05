package edu.ysu.slide;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * @auther xiaochen
 * @create 2022-02-12 12:17
 */
public class L1984 {
    public static void main(String[] args) {
        int[] nums = {9,4,1,7};
        int ans = minimumDifference(nums,2);
        System.out.println(ans);

    }

    public static int minimumDifference(int[] nums, int k) {
        //对数组进行排序
        Arrays.sort(nums);

        int n = nums.length;
        int ans = 100000;
        for (int i = 0;i < n - k + 1;i++){
            ans = Math.min(ans,nums[i +k - 1] - nums[i]);
        }
        return ans;

    }
}
