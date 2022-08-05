package edu.ysu.slide;

/**
 * @auther xiaochen
 * @create 2022-05-05 9:34
 */
public class Lc713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int length = nums.length;
        int left = 0, right = 0;

        //记录当前窗口的乘积
        int prod = 1;

        //结果个数
        int ans = 0;

        while (right < length) {
            prod *= nums[right];
            //乘积大于k，左指针右移
            while (left <= right && prod >= k) {
                prod /= nums[left];
                left++;
            }
            //记录以当前right为右边界的有效子数组的个数
            ans += (right - left + 1);
            //更新右指针
            right++;
        }
        return ans;

    }
}
