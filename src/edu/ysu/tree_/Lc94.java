package edu.ysu.tree_;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @auther xiaochen
 * @create 2022-04-03 9:19
 */
public class Lc94 {
    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        //辅助指针
        TreeNode cur = root;

        while (cur != null || !stack.isEmpty()) {
            //找到最左侧节点，有可能是含有右子树的左节点
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                //将当前值存入结果数组，左
                result.add(cur.val);
                //当前节点的右节点入栈，
                cur = cur.right;
            }
        }
        return result;
    }

}
