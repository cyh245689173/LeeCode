package edu.ysu.tree_;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @auther xiaochen
 * @create 2022-04-03 9:57
 */
public class Lc145 {
    public static void main(String[] args) {

    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        //根节点入栈
        stack.push(root);
        //入栈顺序：根--左--右
        //出栈顺序：根--右--左
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();

            result.add(node.val);

            if (node.left != null) {
                stack.push(node.left);
            }

            if (node.right != null) {
                stack.push(node.right);
            }
        }

        //所需结果序列：左--右--根
        Collections.reverse(result);
        return result;

    }

}
