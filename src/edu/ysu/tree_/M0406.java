package edu.ysu.tree_;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @auther xiaochen
 * @create 2022-05-16 8:34
 */
public class M0406 {
//    //二分法
//    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
//        TreeNode res = null;
//
//        while (root != null) {
//            //如果目标值小于根节点值，则证明目标节点就是根节点或者在左子树中
//            if (root.val > p.val) {
//                res = root;
//                root = root.left;
//            } else {
//                //否则，则证明目标节点在右子树中
//                root = root.right;
//            }
//        }
//        return res;
//
//
//    }

    //普通中序遍历
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        Stack<TreeNode> stack = new Stack<>();

        //记录前一节点和当前节点
        TreeNode pre = null;
        TreeNode cur = root;

        while (!stack.isEmpty() && cur != null){
            while (cur !=null){
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            if (pre == p){
                return cur;
            }
            pre = cur;
            cur = cur.right;


        }

        return null;


    }
}
