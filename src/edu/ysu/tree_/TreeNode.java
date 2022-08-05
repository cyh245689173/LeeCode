package edu.ysu.tree_;

import sun.reflect.generics.tree.Tree;

/**
 * @auther xiaochen
 * @create 2021-11-13 12:31
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
