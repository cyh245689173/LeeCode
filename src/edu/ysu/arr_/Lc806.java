package edu.ysu.arr_;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @auther xiaochen
 * @create 2022-04-12 16:27
 */
public class Lc806 {
    public static void main(String[] args) {
        int[] widths = {4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        String s = "bbbcccdddaaa";

        int[] res = numberOfLines(widths, s);
        System.out.println(Arrays.toString(res));
        char c = 'a';
        System.out.println(c);
        c += 1;
        System.out.println(c);
    }

    public static int[] numberOfLines(int[] widths, String s) {
        //总行数
        int line = 1;
        //当前行的宽度
        int width = 0;


        for (int i = 0; i < s.length(); i++) {
            //当前字符
            char c = s.charAt(i);
            //当前字符所需要的单位
            int num = widths[c - 'a'];
            //更新当前行
            width += num;

            if (width > 100) {
                line++;
                //根据题意，当前行不足的直接写到下一行
                width = num;
            }


        }
        return new int[]{line, width};

    }
}
