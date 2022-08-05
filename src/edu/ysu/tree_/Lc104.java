package edu.ysu.tree_;

/**
 * @auther xiaochen
 * @create 2022-04-04 7:20
 */
public class Lc104 {
    public static void main(String[] args) {

    }


    public int maxDepth(TreeNode root) {
        //终止条件
        if (root == null) {
            return 0;
        }
        //树的最大深度等于左子树或者右子树深度的最大值加一，即加上当前根节点
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

}
