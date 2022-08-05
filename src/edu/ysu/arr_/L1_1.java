package edu.ysu.arr_;

import java.util.HashMap;

/**
 * @auther xiaochen
 * @create 2021-11-05 15:39
 */
public class L1_1 {
    public static void main(String[] args) {

    }

//    public int[] twoSum(int[] nums, int target) {
//        int n = nums.length;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return null;
//    }

    public int[] twoSum(int[] nums, int target) {

        //元素为键，元素下标为值
        HashMap<Integer, Integer> map = new HashMap<>();


        for (int i = 0;i < nums.length;i++){

            int m = target - nums[i];
            if (map.containsKey(m)){
                return new int[]{i,map.get(m)};
            }

            //元素存入哈希表
            map.put(nums[i],i);
        }

        return null;

    }
}
