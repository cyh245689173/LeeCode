package edu.ysu.doublepoint_;

import java.util.HashMap;

/**
 * @auther xiaochen
 * @create 2021-11-04 19:10
 */
public class L3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(f(s));

    }

    public static int f(String s) {

        /*
         * 双指针加哈希表法：
         * 哈希表用来记录字符以及字符出现的次数
         * 双指针用于记录最大不重复子串的长度
         * */

        int ans = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        //定义两个指针start，end表示当前处理到的子串是[start,end]
        int start = 0, end = 0;
        //从前往后遍历字符串
        for (; end < s.length(); end++) {
            char right = s.charAt(end);
            //把字符存入哈希表
            map.put(right,map.getOrDefault(right,0) + 1);
            //表示有重复字符了，移动左指针，剔除左侧重复的元素
            while (map.get(right) > 1){
                char left = s.charAt(start);
                map.put(left,map.get(left) -1);
                start++;
            }

            ans = Math.max(ans,end - start +1);
        }
        return ans;

    }
}
