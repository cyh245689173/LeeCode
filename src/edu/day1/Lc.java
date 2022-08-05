package edu.day1;

import java.util.*;

/**
 * @auther xiaochen
 * @create 2022-03-30 8:12
 */
public class Lc {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));

        System.out.println(5/10);

    }

    public static int firstUniqChar(String s) {
        //将字符作为键，将字符出现次数作为值
        Map<Character, Integer> map = new HashMap<>();
        //第一次遍历将字符串存入
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);

        }
        //第二次遍历，找到第一个值为1的字符，返回其索引即可
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.get(c) == 1) {
                return i;
            }
        }
        return -1;

    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        //如果ransomNote的长度大于magazine则肯定没法构成，直接返回false
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        //将magazine中的字符作为键，出现次数作为值，存入哈希表
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }


        //将map中存储的字符进行取出，用来构建ransomNote看是否能成功
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            //若ransomNote中存在magazine没有的字符，直接返回false
            if (map.keySet().contains(c)) {
                int count = map.get(c);
                //若存在，更新字符个数
                if (count > 0) {
                    map.put(c, --count);
                    //字符个数不够，返回false
                } else {
                    return false;
                }
            } else {
                return false;
            }

        }
        return true;

    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chart);

        return Arrays.equals(chars, chart);

    }


    public List<Integer> selfDividingNumbers(int left, int right) {
        //结果集合
        List<Integer> list = new ArrayList<>();
        //从给定的区间开始逐个值判断是否为自除数
        for (int num = left; num <= right; num++) {
            if (isSelfNumber(num)) {
                list.add(num);
            }
        }
        return list;
    }

    //判断是否为自除数
    public boolean isSelfNumber(int num) {
        //用于拆分的副本num
        int temp = num;
        //逐次取余得到每个位置上的值
        while (temp > 0) {

            int digit = temp % 10;
            //不满足条件，直接返回false
            if (digit == 0 || num % digit != 0) {
                return false;
            }
            //更新为下一个值
            temp /= 10;
        }
        return true;
    }

}
