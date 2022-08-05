package edu.ysu.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @auther xiaochen
 * @create 2022-08-03 8:43
 */
public class Lc216 {

    //单条路径
    LinkedList<Integer> path = new LinkedList();
    //结果集
    List<List<Integer>> res = new ArrayList();


    public List<List<Integer>> combinationSum3(int k, int n) {
        backtracking(k, 0, n, 1);
        return res;
    }

    /**
     *
     * @param k k个数的集合，也是递归深度
     * @param sum 已经遍历得到的元素的加和
     * @param target 目标值，也就是n
     * @param startIndex for循环开始的起始位置
     */
    public void backtracking(int k, int sum, int target, int startIndex) {

        //终止条件
        if (path.size() == k) {
            //找到符合条件的路径
            if (sum == target) {
                res.add(new ArrayList<>(path));
            }
            return;
        }


        //单层逻辑
        for (int i = startIndex; i <= 9; i++) {
            sum += i;
            path.add(i);
            backtracking(k, sum, target, i + 1);
            //回溯
            sum -= i;
            path.removeLast();
        }
    }
}
