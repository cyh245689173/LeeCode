package edu.ysu.tree_;

import java.util.Arrays;

/**
 * @auther xiaochen
 * @create 2022-05-11 9:20
 */
public class Lc105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //preorder和inorder一定是同时为空的，选取哪个判断都可以
        if (preorder.length == 0) {
            return null;
        }

        //前序遍历第一个节点一定是根节点
        TreeNode root = new TreeNode(preorder[0]);

        for (int i = 0; i < preorder.length; i++) {
            //用根节点preorder[0]将中序数组分为左右子树两部分
            if (preorder[0] == inorder[i]){
                //将前序数组分为左右两半，再将中序数组分为左右两半
                //然后递归处理前序数组的左半部分和中序数组的左半部分
                //然后递归处理前序数组的右半部分和中序数组的右半部分

                //从1开始是因为第0个元素是根节点
                int[] pre_left = Arrays.copyOfRange(preorder,1,i+1);
                int[] pre_right = Arrays.copyOfRange(preorder,i+1,preorder.length);

                int[] in_left = Arrays.copyOfRange(inorder,0,i);
                int[] in_right = Arrays.copyOfRange(inorder,i+1,inorder.length);

                root.left = buildTree(pre_left,in_left);
                root.right = buildTree(pre_right,in_right);
                break;
            }


        }
        return root;
    }
}
