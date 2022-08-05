package edu.ysu.tree_;

import java.util.*;

/**
 * @auther xiaochen
 * @create 2022-04-07 8:05
 */
public class Lc653 {
    public static void main(String[] args) {

    }


    public boolean findTarget(TreeNode root, int k) {

        List<Integer> list = new ArrayList<>();

        inorderTraversal(root, list);


        int left = 0, right = list.size() - 1;
        while (left < right) {
            //两数之和大于目标值，右指针左移
            if (list.get(left) + list.get(right) > k) {
                right--;
            //两数之和小于目标值，左指针右移
            } else if (list.get(left) + list.get(right) < k) {
                left++;
            } else {
                return true;
            }
        }
        return false;

    }

    void inorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);
    }

}
