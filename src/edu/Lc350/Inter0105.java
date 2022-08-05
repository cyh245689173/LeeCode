package edu.Lc350;

/**
 * @auther xiaochen
 * @create 2022-05-13 8:35
 */
public class Inter0105 {
    public boolean oneEditAway(String first, String second) {
        /*
         * 分情况讨论：
         * first长度为m，second长度为n
         *           1.插入了一个字符，n - m = 1,使用双指针进行比较
         *           2.删除了一个字符，m - n = 1，使用双指针进行比较
         *           3.替换了一个字符，m = n，遍历两字符串，看逐个字符是否相同即可
         *           4.不符合一次编辑
         *
         *
         * */

        int m = first.length();
        int n = second.length();

        //情况一：插入字符
        if (n - m == 1) {
            return inOrDel(first, second);
        } else if (m - n == 1) {//情况二：删除字符
            return inOrDel(second, first);
        } else if (m == n) {//情况三：替换字符,存在两字符串长度为1的情况，所以需要来记录字符不同的个数来判断
            int count = 0;
            for (int i = 0; i < m; i++) {
                if (first.charAt(i) != second.charAt(i)) {
                    count++;
                }
            }
            if (count <= 1) {
                return true;
            } else {
                return false;
            }


        } else {//情况四：不符合一次编辑
            return false;
        }
    }

    public boolean inOrDel(String shorter, String longer) {
        int m = shorter.length();
        int n = longer.length();


        int index1 = 0, index2 = 0;
        while (index1 < m && index2 < n) {
            //如果当前字符不相同，则只移动长字符串的指针
            if (shorter.charAt(index1) == longer.charAt(index2)) {
                index1++;
            }
            index2++;
            //两字符串中有超过一个字符不相同了，不满足条件
            if (index2 - index1 > 1) {
                return false;
            }
        }
        return true;
    }
}
