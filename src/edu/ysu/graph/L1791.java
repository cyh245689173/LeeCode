package edu.ysu.graph;

import java.util.HashMap;

/**
 * @auther xiaochen
 * @create 2022-02-18 12:02
 */
public class L1791 {
    public static void main(String[] args) {

    }


    public int findCenter(int[][] edges) {

        //用于存储图的顶点和对应顶点的度
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int[] edge : edges) {
            //将每个结点以及其出现的次数，即该节点的值和该节点的度存入哈希表
            map.put(edge[0], map.getOrDefault(edge[0], 0) + 1);
            map.put(edge[1], map.getOrDefault(edge[1], 0) + 1);
        }
        int n = map.keySet().size();
        for (Integer key : map.keySet()) {
            //找到度为n-1的节点
            if (map.get(key) == n - 1) {
                return key;
            }
        }
        return -1;

    }
}
