package edu.ysu.tree_;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @auther xiaochen
 * @create 2022-04-10 10:14
 */
public class Lc222 {
    public static void main(String[] args) {


        System.out.println(1 << 3);
    }

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);

        //左子树深度等于右子树深度，证明左子树是完全二叉树
        if (leftDepth == rightDepth) {
            //将左子树的节点数算出来，然后通过递归去算出右子树的节点数
            return (1 << leftDepth) - 1 + countNodes(root.right) + 1;

        }else {
            //左子树深度不等于右子树深度，则证明右子树为完全二叉树
            return (1 << rightDepth) - 1 + countNodes(root.left) + 1;
        }
        //左子树深度不等于右子树深度，证明不是完全二叉树
        // 递归其左右孩子,加上根节点



    }

    int getDepth(TreeNode root) {
        int depth = 0;
        //计算树的深度
        while (root != null) {
            root = root.left;
            depth++;
        }
        return depth;
    }
}
