package edu.ysu.tree_;

/**
 * @auther xiaochen
 * @create 2022-04-06 9:59
 */
public class Lc701 {


    public TreeNode insertIntoBST(TreeNode root, int val) {
        //递归出口
        //如果当前节点为空，则证明val找到了合适的位置，直接创建节点并返回
        if (root == null) {
            return new TreeNode(val);
        }
        //结点应插入到左子树中，对左子树进行递归操作
        if (root.val > val) {
            root.left = insertIntoBST(root.left, val);
        } else if (root.val < val) {
            //结点应插入到右子树中，对右子树进行递归操作
            root.right = insertIntoBST(root.right, val);
        }

        return root;
    }
}
