package edu.ysu.tree_;

import edu.ysu.arr_.Niuke;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @auther xiaochen
 * @create 2022-04-04 8:08
 */
public class Lc101 {
    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
        //双端队列
        Deque<TreeNode> deque = new LinkedList<>();
        //存入左右节点
        deque.offerFirst(root.left);
        deque.offerFirst(root.right);

        while (!deque.isEmpty()){
            TreeNode leftNode = deque.pollFirst();
            TreeNode rightNode = deque.pollLast();
            //左右节点都为空时
            if (leftNode == null && rightNode == null){
                continue;
            }
            //左右节点一颗为空一颗不为空时
            if (leftNode == null || rightNode == null){
                return false;
            }

            //左右节点都不为空但是值不相同时
            if (leftNode.val != rightNode.val){
                return false;
            }

            //存入外侧节点
            deque.offerFirst(leftNode.left);
            deque.offerLast(rightNode.right);
            //存入内侧节点
            deque.offerFirst(leftNode.right);
            deque.offerLast(rightNode.left);

        }
        return true;

    }
}
