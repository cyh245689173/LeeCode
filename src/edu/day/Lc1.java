package edu.day;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther xiaochen
 * @create 2022-03-26 8:32
 */
public class Lc1 {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));


    }

    public int[] twoSum(int[] nums, int target) {
        //使用哈希表进行存储，元素值为键，索引作为值
        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            //判断当前哈希表中是否存在满足条件的两个值，若存在，则返回
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            //不存在，将当前元素存入，进行下次判断
            map.put(nums[i], i);
        }
        //没找到复合条件的值
        return new int[]{-1, -1};

    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        //逆向双指针，比较两个数组最后的元素，选择较大的一个塞到数组尾部


        //i指向nums1最后一个被插入元素的后一位置，nums1.length和 m + n + 1等同
        int i = nums1.length;

        while (n > 0){
            //如果num1中还有元素，就进行比较选取较大值
            if (m > 0 && nums1[m - 1] > nums2[n -1]){
                nums1[--i] = nums1[--m];
                //nums1中元素小或者nums1已为空，就把nums2存入
            }else{
                nums1[--i] = nums2[--n];
            }
        }
    }


}
