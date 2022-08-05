package edu.ysu.str_;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * @auther xiaochen
 * @create 2021-11-13 12:05
 */
public class L520 {
    public static void main(String[] args) {

    }


    public boolean detectCapitalUse(String word) {
        //三种情况：
        //1.全为大写  2.全为小写  3.第一个字符是大写，剩余字符全是小写

        //1.全为大写
        if (word.toUpperCase().equals(word)){
            return true;
        }
        //2.全为小写
        if (word.toLowerCase().equals(word)){
            return true;
        }
        int index = 1;
        int n = word.length();
        //3.首字母大写，其余为小写
        if (Character.isUpperCase(word.charAt(0))){
            while (index < n && Character.isLowerCase(word.charAt(index))){
                index++;
            }
        }
        return index == word.length();

    }
}
