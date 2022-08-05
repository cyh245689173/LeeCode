package edu.ysu.arr_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther xiaochen
 * @create 2022-02-15 11:37
 */
public class L1380 {
    public static void main(String[] args) {
        int[][] matrix = {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};

        List<Integer> list = luckyNumbers(matrix);
        System.out.println(list.toString());


    }

    public static List<Integer> luckyNumbers(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        //行最小值数组
        int[] minRow = new int[m];
        //先将行最小数组中用最大数填充，以备更新
        Arrays.fill(minRow, Integer.MAX_VALUE);
        //列最大值数组
        int[] maxCol = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //把行最小值存入行最小数组中
                minRow[i] = Math.min(minRow[i], matrix[i][j]);
                //把列最大值存入列最大数组中
                maxCol[j] = Math.max(maxCol[j], matrix[i][j]);

            }
        }
        //返回结果集合
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == minRow[i] && matrix[i][j] == maxCol[j]){
                    res.add(matrix[i][j]);
                }
            }
        }
        return res;
    }
}
