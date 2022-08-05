package edu.Lc350;

/**
 * @auther xiaochen
 * @create 2022-05-12 14:44
 */
public class Lc944 {
    public int minDeletionSize(String[] strs) {
        //行的长度
        int row = strs.length;
        //列的长度
        int col = strs[0].length();

        int res = 0;

        for (int i = 0; i < col; i++) {
            for (int j = 1; j < row; j++) {
                //判断当前列元素之间的大小关系
                if (strs[j].charAt(i) < strs[j - 1].charAt(i)) {
                    //更新删除的列数
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}
