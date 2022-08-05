package edu.ysu.arr_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @auther xiaochen
 * @create 2022-04-08 8:44
 */
public class Lc15 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> threeSum(int[] nums) {
        /*
         * 排序 + 双指针
         *
         * 如果数组为空或者数组长度小于3，直接不满足条件，返回null
         *
         * 如果排序完之后数组的第一个元素（即最小元素）大于0，则数组中不可能出现三数之和等于0的情况，返回null
         *
         * 固定一个元素nums[i]，其余两个元素使用两个指针进行标记
         * 分别为nums[i + 1] 和 nums[n - 1]
         *
         *
         *
         *
         * 如果三数之和等于0，将他们存入三元组，并进行去重操作
         * 如果三数之和小于0，则将右指针左移，继续判断
         * 如果三数之和大于0，则将左指针右移，继续判断
         * */
        //结果数组
        List<List<Integer>> result = new ArrayList<>();
        //数组长度
        int n = nums.length;

        //如果数组为空或者数组长度小于3，直接不满足条件，返回null
        if (nums == null || n < 3) {
            return result;
        }
        //排序
        Arrays.sort(nums);

        //遍历数组
        for (int i = 0; i < n; i++) {


            //如果排序完之后数组的第一个元素（即最小元素）大于0，则数组中不可能出现三数之和等于0的情况，返回null
            if (nums[i] > 0) {
                return result;
            }

            int left = i + 1;
            int right = n - 1;


            //去重，当起始值等于前一个元素
            if (i > 0 && nums[i] == nums[i -1]){
                continue;
            }


            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    result.add(list);

                    //去重操作
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;

    }

}
