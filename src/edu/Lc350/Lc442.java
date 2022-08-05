package edu.Lc350;

import javax.print.attribute.standard.PrinterURI;
import java.util.ArrayList;
import java.util.List;

/**
 * @auther xiaochen
 * @create 2022-05-08 9:14
 */
public class Lc442 {
    public static void main(String[] args) {

    }

    public List<Integer> findDuplicates(int[] nums) {
        /*
         * 因为数组元素的范围是1 ~ n
         * 数组下标索引的范围是0  ~  n-1
         * 使用数组本身作为哈希表，
         * 将元素值为i的元素放在索引下标为i-1的地方，
         * 全部放完之后，剩下的就是重复的元素
         * */
        ArrayList<Integer> res = new ArrayList<>();

        int n = nums.length;

        if (n == 0 || nums == null) {
            return res;
        }
        for (int i = 0; i < n; i++) {
            //nums[nums[i] - 1]表示哈希映射在该位置上的值
            //nums[i]表示现在存放在该位置上的值
            while (nums[nums[i] - 1] != nums[i]) {
                swap(nums, nums[i] - 1, i);
            }
        }
        //找出所有不在其该有位置上的元素
        for (int i = 0; i < n; i++) {
            if (nums[i] - 1 != i) {
                res.add(nums[i]);
            }
        }

        return res;


    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
