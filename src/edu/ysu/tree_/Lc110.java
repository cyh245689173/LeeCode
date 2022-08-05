package edu.ysu.tree_;

/**
 * @auther xiaochen
 * @create 2022-04-12 20:06
 */
public class Lc110 {
    public static void main(String[] args) {

    }

    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }

    //-1表示已经不是平衡二叉树了，否则返回值是以该节点为根节点的树的高度
    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        //左
        int leftHeight = getHeight(root.left);
        if (leftHeight == -1) {
            return -1;
        }

        //右
        int rightHeight = getHeight(root.right);
        if (rightHeight == -1) {
            return -1;
        }

        //中
        int result;
        //左右子树高度差大于1，则不是平衡二叉树
        if (Math.abs(leftHeight - rightHeight) > 1) {
            result = -1;
        } else {
            result = Math.max(leftHeight, rightHeight) + 1;
        }

        return result;

    }

}
