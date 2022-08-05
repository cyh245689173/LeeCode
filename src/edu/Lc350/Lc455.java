package edu.Lc350;

import java.util.Arrays;

/**
 * @auther xiaochen
 * @create 2022-05-10 10:13
 */
public class Lc455 {

    public static void main(String[] args) {
        int[] g = {1, 2};
        int[] s = {1, 2, 3};
        int contentChildren = findContentChildren(g, s);
        System.out.println(contentChildren);
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int count = 0;
        //小饼干先喂饱小胃口
        int start = 0;
        for (int i = 0; i < s.length; i++) {
            if (start < g.length && s[i] >= g[start]) {
                count++;
                start++;
            }

        }

        return count;

    }
}
