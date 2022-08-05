package edu.ysu.tree_;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther xiaochen
 * @create 2022-04-06 9:05
 */
public class L98 {
    public static void main(String[] args) {

    }

    //存储中序遍历中前一个结点的值
    //因为题目中Integer.MIN_VALUE在结点取值范围内，所以需要用Long
    long pre = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        //空树也是二叉搜索树
        if (root == null){
            return true;
        }
        //中序遍历

        //左
        if (!isValidBST(root.left)){
            //如果左子树不是二叉搜索树，直接返回false
            return false;
        }


        //中
        //判断当前节点值是否大于前一节点值
        //二叉搜索树中不能有值相同的节点，所以直接用<=进行判断不满足条件的情况
        if (root.val <= pre){
            return false;
        }
        //更新前一节点值
        pre = root.val;

        //右
        return isValidBST(root.right);

    }
}
