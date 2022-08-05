package edu.ysu.arr_;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @auther xiaochen
 * @create 2022-02-19 19:20
 */
public class Niuke {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();


        }

    }

    public static boolean isKeyWord(String s, String t) {
        //将字符串1存入哈希表中
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }


        for (int j = 0;j < t.length();j++){
            char c = t.charAt(j);
            int count = map.get(c);

            if (map.keySet().contains(c)){
                map.put(c,--count);
            }
        }
        return true;

    }


}
