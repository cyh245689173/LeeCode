package edu.ysu.tree_;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @auther xiaochen
 * @create 2022-05-11 9:48
 */
public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        postorder(root, list);
        String s = list.toString();
        return s;

    }

    private void postorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        postorder(root.left, list);
        postorder(root.right, list);
        list.add(root.val);

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.isEmpty()) {
            return null;
        }
        //将字符串转换为数组，
        String[] arr = data.split(",");
        Deque<Integer> stack = new ArrayDeque<>();
        int length = arr.length;

        return null;

    }


}
