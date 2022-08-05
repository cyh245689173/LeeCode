package edu.ysu.tree_;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @auther xiaochen
 * @create 2022-04-06 20:16
 */
public class Lc111 {
    public static void main(String[] args) {

    }

    public int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();

        queue.offer(root);
        //记录深度，初始为0
        int depth = 0;

        while (!queue.isEmpty()) {
            depth++;
            int length = queue.size();

            for (int i = 0; i < length; i++) {

                TreeNode node = queue.poll();
                //找到了第一个叶子结点，即最小深度，直接返回depth
                if (node.left == null && node.right == null) {
                    return depth;
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return depth;

    }

}
