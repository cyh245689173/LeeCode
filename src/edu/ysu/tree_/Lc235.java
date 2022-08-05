package edu.ysu.tree_;

/**
 * @auther xiaochen
 * @create 2022-04-07 9:26
 */
public class Lc235 {
    public static void main(String[] args) {

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        //cur指向当前节点
        TreeNode cur = root;

        while (true) {
            //两节点值都小于根节点，则从根节点的左子树中继续查找两节点
            if (cur.val > p.val && cur.val > q.val) {
                cur = cur.left;
                //两节点值都大于根节点，则从根节点的右子树中继续查找两节点
            } else if (cur.val < p.val && cur.val < q.val) {
                cur = cur.right;
            } else {
                break;
            }
        }
        return cur;

    }


}
