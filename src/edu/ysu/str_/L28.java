package edu.ysu.str_;

/**
 * @auther xiaochen
 * @create 2021-11-09 18:48
 */
public class L28 {
    public static void main(String[] args) {

        String haystack = "hello";
        String needle = "ll";

        System.out.println(strStr(haystack, needle));

    }

    public static int strStr(String haystack, String needle) {
        /*
         * 让字符串needle和字符串haystack中所有长度为n的字符串进行匹配
         * 如果有一个字符不同，则直接开始下一个字符串的判断
         * */
        int m = haystack.length();
        int n = needle.length();


        for (int i = 0; i + n <= m; i++) {
            //用于标记子串是否相同
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }
}
