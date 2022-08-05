package edu.day;

import java.util.Arrays;

/**
 * @auther xiaochen
 * @create 2022-03-28 8:15
 */
public class Lc556 {
    public static void main(String[] args) {

        int[][] mat ={{1,2},{3,4}};
        int[][] ans = matrixReshape(mat, 1, 4);


        for (int i = 0 ;i < 1;i++) {
            for (int j = 0;j < 4;j++){
                System.out.println(ans[i][j]);
            }
        }

    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;

        //不合理的参数，直接返回原矩阵
        if (r * c != m * n){
            return mat;
        }
        //结果矩阵
        int[][] ans = new int[r][c];
        //先将数组转存到一维数组中
        int[] arr = new int[m*n];

        int k = 0;
        for (int i = 0 ;i < m;i++) {
            for (int j = 0;j < n;j++){
                arr[k] = mat[i][j];
                k++;
            }
        }
        //将一维数组的值转存到新的多维数组
        k = 0;
        for (int i = 0 ;i < r;i++) {
            for (int j = 0;j < c;j++){
                ans[i][j] = arr[k];
                k++;
            }
        }

        return ans;

    }
}
