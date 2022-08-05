package edu.day1;

/**
 * @auther xiaochen
 * @create 2022-04-03 15:16
 */
public class Lc744 {
    public static void main(String[] args) {

    }

    public char nextGreatestLetter(char[] letters, char target) {
        //线性查找
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) {
                return letters[i];
            }
        }
        //因为字母是循环出现的，所以如果一次遍历没有查找到就直接返回第一个字符
        return letters[0];
    }

}
