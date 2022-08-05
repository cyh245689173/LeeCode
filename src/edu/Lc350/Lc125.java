package edu.Lc350;

/**
 * @auther xiaochen
 * @create 2022-04-30 9:34
 */
public class Lc125 {
    public boolean isPalindrome(String s) {
        //使用StringBuffer是为了方便调用API
        StringBuffer sgood = new StringBuffer();

        int length = s.length();
        //将有效字符取出来
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                sgood.append(Character.toLowerCase(c));
            }
        }
        //注：sgood 和 s长度不一样
        int len = sgood.length();

        int l = 0, r = len - 1;


        while (l < r) {
            if (sgood.charAt(l) != sgood.charAt(r)){
                return false;
            }
            l++;
            r--;
        }

        return true;

    }
}
