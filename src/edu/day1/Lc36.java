package edu.day1;

import java.awt.geom.Area;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @auther xiaochen
 * @create 2022-03-29 8:23
 */
public class Lc36 {
    public static void main(String[] args) {

    }

    public boolean isValidSudoku(char[][] board) {

        //分别建立关于行、列、九宫格方块的哈希表
        Map<Integer, Set<Integer>> row = new HashMap<>(), col = new HashMap<>(), box = new HashMap<>();


        //存值
        //键为第几行，第几列，第几个，值为当前自己所管理的九个数字
        for (int i = 0; i < 9; i++) {
            row.put(i, new HashSet<>());
            col.put(i, new HashSet<>());
            box.put(i, new HashSet<>());
        }


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];

                if (c == '.') {
                    continue;
                }


                //通过字符c - 字符0得到c的int值
                //如'8'的ASCII码为56,'0'的ASCII码为'48','8' - '0' = 8,8为数字8的ASCII码
                int intC = c - '0';


                //由画图可得
                int index = j / 3 + i / 3 * 3;

                //如果已经存在于行列或者九宫格中，则返回false
                if (row.get(i).contains(intC) || col.get(j).contains(intC) || box.get(index).contains(intC)) {
                    return false;
                }

                //如果都没有，则存入
                row.get(i).add(intC);
                col.get(j).add(intC);
                box.get(index).add(intC);

            }
        }


        return true;
    }


    //需要O(1)空间的解法
    public void setZeroes(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        boolean row0_flag = false;
        boolean col0_flag = false;


        //第一行是否有零
        for (int j = 0; j < col; j++) {
            if (matrix[0][j] == 0) {
                row0_flag = true;
                break;
            }
        }

        //第一列是否有零
        for (int i = 0;i < row;i++){
            if (matrix[i][0] == 0){
                col0_flag = true;
                break;
            }
        }


        //把第一行第一列设为标志位
        for (int i = 1;i < row;i++){
            for (int j = 1;j < col;j++){
                if (matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        //置零操作
        for (int i = 1;i < row;i++){
            for (int j = 1;j < col;j++){
                if (matrix[i][0] == 0 || matrix[0][j] ==0){
                    matrix[i][j] = 0;
                }
            }
        }


        //如果第一行中有0，则额外对该行置零
        if (row0_flag){
            for (int j = 0;j < col;j++){
                matrix[0][j] = 0;
            }
        }

        //如果第一列中有0，则额外对该列置零
        if (col0_flag){
            for (int i = 0;i < row;i++){
                matrix[i][0] = 0;
            }
        }

    }
}
