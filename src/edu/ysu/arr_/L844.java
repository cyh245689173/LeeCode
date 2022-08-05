package edu.ysu.arr_;

/**
 * @auther xiaochen
 * @create 2022-02-18 15:20
 */
public class L844 {
    public static void main(String[] args) {

    }


    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;

        //用skipS和skipT来记录需要跳过字符的数量
        int skipS = 0, skipT = 0;
        //遍历完一个字符串时退出循环
        while (i >= 0 || j >= 0) {

            while (i >= 0) {
                //首先判断当前字符是否为退格字符
                //若为退格字符，指针前移
                if (s.charAt(i) == '#') {
                    skipS++;
                    i--;
                    //通过检查skipS的数量来判断当前字符是否会被删除
                } else if (skipS > 0) {
                    skipS--;
                    i--;
                } else {
                    break;
                }
            }

            while (j >= 0) {
                //首先判断当前字符是否为退格字符
                //若为退格字符，指针前移
                if (s.charAt(j) == '#') {
                    skipT++;
                    j--;
                    //通过检查skipS的数量来判断当前字符是否会被删除
                } else if (skipT > 0) {
                    skipT--;
                    j--;
                } else {
                    break;
                }

            }

            if (i >= 0 && j >= 0) {
                //有一个字符不一样直接返回false
                if (s.charAt(i) != t.charAt(j)) {
                    return false;
                }

            } else {
                //有一个字符串遍历结束了
                if (i >= 0 || j >= 0){
                    return false;
                }

            }

            i--;
            j--;


        }

        return true;


    }

    public String convert(String s){
        int i = s.length() -1;
        int skip = 0;
        return "";
    }
}
