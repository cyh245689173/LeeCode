package edu.ysu.tree_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @auther xiaochen
 * @create 2022-05-01 8:21
 */
public class Lc1305 {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        //结果数组
        ArrayList<Integer> res = new ArrayList<>();
        //中序遍历两棵树
        inorderTraversal(root1,res);
        inorderTraversal(root2,res);
        //排序
        Collections.sort(res);
        return res;

    }

    public void inorderTraversal(TreeNode root,List res){
        if (root == null){
            return;
        }

        inorderTraversal(root.left,res);
        res.add(root.val);
        inorderTraversal(root.right,res);
    }
}
