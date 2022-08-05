package edu.Lc350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther xiaochen
 * @create 2022-05-09 15:39
 */
public class Lc46 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

    }

    List<List<Integer>> res = new ArrayList<List<Integer>>();

    public List<List<Integer>> permute(int[] nums) {
        dfs(nums, new ArrayList<>());
        return res;

    }

    private void dfs(int[] nums, List<Integer> list) {
        System.out.println(Arrays.toString(nums) + "," + list);
        //一个全排列遍历完成
        if (list.size() == nums.length) {
            //将此全排列保存到结果集合中
            res.add(new ArrayList<>(list));
        } else {
            for (int num : nums) {
                //当前数字不在集合中，将其加入集合
                if (!list.contains(num)) {
                    list.add(num);
                    dfs(nums, list);
                    //回溯,将最后一个元素剔除，返回上一层
                    list.remove(list.size() - 1);
                }
            }
        }
    }
}
