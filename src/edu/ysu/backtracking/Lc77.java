package edu.ysu.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @auther xiaochen
 * @create 2022-08-02 10:10
 */
public class Lc77 {
    public static void main(String[] args) {


    }

    //单条路径
    public LinkedList<Integer> path = new LinkedList<>();
    //路径结果集
    public List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        backtracking(n, k, 1);
        return res;
    }

    public void backtracking(int n, int k, int startIndex) {
        //******************************************************//
        //回溯终止条件，单条路径大小达到k，说明找到了一个子集大小为k的组合
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }

        //******************************************************//

        //单层搜索过程,从startIndex开始遍历
        for (int i = startIndex; i <= n - (k - path.size()) + 1; i++) {
            path.add(i);
            backtracking(n, k, i + 1);
            //回溯，撤销当前处理的节点
            path.removeLast();
        }
    }
}
