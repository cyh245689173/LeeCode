package edu.day;

import com.sun.org.apache.bcel.internal.generic.RET;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther xiaochen
 * @create 2022-03-28 8:40
 */
public class Lc118 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> generate(int numRows) {


        List<List<Integer>> res = new ArrayList<>();

        //用来存储每一行的数组
        List<Integer> list = null;


        for (int i = 0; i < numRows; i++) {

            list = new ArrayList<>();
            //注意这里的j的上限是i，而不是numRows
            for (int j = 0; j <= i; j++) {
                //边界条件，第一列和对角线上的元素都是1
                if (j == 0 || i == j) {
                    list.add(1);
                } else {
                    //递推公式
                    list.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                }
            }
            res.add(list);
        }
        return res;

    }
}
