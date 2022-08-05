package edu.ysu.tree_;

import sun.reflect.generics.tree.VoidDescriptor;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @auther xiaochen
 * @create 2022-04-03 8:41
 */
public class Lc144 {
    public static void main(String[] args) {

    }
//    public List<Integer> preorderTraversal(TreeNode root) {
//        //list用于保存前序遍历的节点序列
//        List<Integer> list = new ArrayList<>();
//        preOrder(list,root);
//        return list;
//    }
//    //确定递归的传入参数为：存储节点数据的集合，和当前根节点,返回值为空
//    public void preOrder(List<Integer> list,TreeNode root){
//        if (root == null){
//            return;
//        }
//        //根
//        list.add(root.val);
//        //左
//        preOrder(list,root.left);
//        //右
//        preOrder(list,root.right);
//
//    }

    public List<Integer> preorderTraversal(TreeNode root) {
        //结果数组
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Stack<TreeNode> stack = new Stack<>();

        //根节点入栈
        stack.push(root);

        while (!stack.isEmpty()) {
            //弹出栈顶元素并存入结果数组
            TreeNode node = stack.pop();
            res.add(node.val);
            //右节点不为空，入栈
            if (node.right != null) {
                stack.push(node.right);
            }
            //左节点不为空，入栈
            if (node.left != null) {
                stack.push(node.left);
            }

        }
        return res;

    }


}
