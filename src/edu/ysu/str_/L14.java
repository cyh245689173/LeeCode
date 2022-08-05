package edu.ysu.str_;

/**
 * @auther xiaochen
 * @create 2021-11-08 10:13
 */
public class L14 {
    public static void main(String[] args) {
        String[] strings = {"flower","flow","flight"};

    }


    public String longestCommonPrefix(String[] strs) {
        //思想：纵向遍历


        //判断字符串是否为空
        if (strs == null || strs.length == 0){
            return null;
        }

        //以第一个字符串为基准
        int length = strs[0].length();
        //数组中的字符串个数
        int count = strs.length;

        //从第一个字符开始遍历
        for (int i = 0;i < length;i++){
            char c = strs[0].charAt(i);

            //纵向遍历,拿出剩余每个字符串的第i个字符进行比较，若与str[0]的第i个字符不相同或者到达字符串长度
            for (int j = 1;j < count;j ++){
                if (i == strs[j].length() || strs[j].charAt(i) != c){
                    return strs[0].substring(0,i);
                }
            }
        }
        //遍历结束还没有返回，则证明第一个字符串的全部字符为最长前缀
        return strs[0];
    }
}
