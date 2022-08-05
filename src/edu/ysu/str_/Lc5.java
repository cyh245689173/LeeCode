package edu.ysu.str_;

/**
 * @auther xiaochen
 * @create 2022-08-04 17:01
 */
public class Lc5 {


    //结果最长回文子串
    String res = "";

    public String longestPalindrome(String s) {

        //中心扩散法
        int length = s.length();

        //字符串长度小于2，直接返回
        if (length < 2) {
            return s;
        }

        for (int i = 0; i < length - 1; i++) {
            //针对于aba这种形式的回文串，以一个元素为中心
            expandAroundCenter(s, i, i);
            //针对aabb这种形式的回文串，以两个元素为中心
            expandAroundCenter(s, i, i + 1);

        }

        return res;

    }

    public void expandAroundCenter(String s, int left, int right) {
        //如果当前两端点满足回文串的条件，就向两端进行扩散
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        //最终最长回文子串的长度
        int len = right - left - 1;

        //更新最终扩展的最长的回文串
        if (len > res.length()) {
            //这里的substring是左闭右开，此时的left和right指向的是最长子串的左一个位置和右一个位置
            res = s.substring(left + 1, right);
        }

    }
}
