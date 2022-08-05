package edu.Lc350;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther xiaochen
 * @create 2022-05-09 16:25
 */
public class Lc46_2 {


    public List<List<Integer>> permute(int[] nums) {
        //结果数组
        List<List<Integer>> res = new ArrayList<>();
        //辅助数组，用于记录当前元素是否被访问过，初始化为0
        int[] visited = new int[nums.length];

        dfs(res, nums, new ArrayList<Integer>(), visited);
        return res;
    }

    private void dfs(List<List<Integer>> res, int[] nums, ArrayList<Integer> path, int[] visited) {

        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }


        for (int i = 0; i < nums.length; i++) {
            //如果当前元素已被访问过，跳过这次循环
            if (visited[i] == 1) {
                continue;
            }
            //标记当前元素已被访问过
            visited[i] = 1;

            path.add(nums[i]);
            dfs(res, nums, path, visited);

            //回溯,返回上一状态
            visited[i] = 0;
            path.remove(path.size() - 1);

        }
    }


}
