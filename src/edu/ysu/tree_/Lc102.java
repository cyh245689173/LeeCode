package edu.ysu.tree_;

import javafx.beans.binding.When;

import java.util.*;

/**
 * @auther xiaochen
 * @create 2022-04-03 15:34
 */
public class Lc102 {
    public static void main(String[] args) {

    }


    public List<List<Integer>> levelOrder(TreeNode root) {

        //结果数组
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        //使用队列来辅助遍历
        Queue<TreeNode> que = new ArrayDeque<>();

        //根节点不为空，入队
        if (root != null) {
            que.offer(root);
        }

        //队列不为空时开始循环
        while (!que.isEmpty()) {
            //level用于存储每层节点的值
            ArrayList<Integer> level = new ArrayList<>();
            int len = que.size();


            while (len > 0) {
                //当前层的元素全部出队并存入当前层的集合中
                TreeNode node = que.poll();
                level.add(node.val);
                //当前节点的左孩子入队
                if (node.left != null) {
                    que.offer(node.left);
                }
                //当前节点的右孩子入队
                if (node.right != null) {
                    que.offer(node.right);
                }
                len--;
            }
            //遍历完一层就存入一层
            result.add(level);

        }
        //返回结果数组
        return result;
    }


}
