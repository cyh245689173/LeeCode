package edu.Lc350;

import java.util.Arrays;

/**
 * @auther xiaochen
 * @create 2022-05-09 9:47
 */
public class Lc942 {
    public int[] diStringMatch(String s) {

        int len = s.length();
        int low = 0;
        int high = len;
        //根据题意，数组长度比字符串长度多1
        int[] perm = new int[len + 1];

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            //如果是I，选取最小值加入数组
            if (c == 'I') {
                perm[i] = low++;
                //如果是D，选取最大值加入数组
            } else if (c == 'D') {
                perm[i] = high--;
            }
        }
        //最终两指针重合，将最后一个值填入数组
        perm[len] = high;

        return perm;


    }
}
