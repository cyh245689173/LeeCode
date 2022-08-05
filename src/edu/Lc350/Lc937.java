package edu.Lc350;

import java.util.Arrays;

/**
 * @auther xiaochen
 * @create 2022-05-03 9:05
 */
public class Lc937 {
    public String[] reorderLogFiles(String[] logs) {

        int length = logs.length;
        Pair[] pairs = new Pair[length];

        for (int i = 0; i < length; i++) {
            //赋值
            pairs[i] = new Pair(logs[i], i);
        }

        //排序操作
        Arrays.sort(pairs, (a, b) -> logCompare(a, b));
        //排序好的数组
        String[] reorderd = new String[length];
        for (int i = 0; i < length; i++) {
            reorderd[i] = pairs[i].log;
        }

        return reorderd;


    }

    //日志比较方法，两个日志进行比较，第一个日志大于返回1，等于返回0，小于返回-1
    int logCompare(Pair pair1, Pair pair2) {
        String log1 = pair1.log;
        String log2 = pair2.log;

        int index1 = pair1.index;
        int index2 = pair2.index;
        //split()方法的第一个参数regex为以什么字符分隔，limit是指将字符串分隔为几个字符串的数量，
        // 2即分隔为两个，即只分割一次

        String[] split1 = log1.split(" ", 2);
        String[] split2 = log2.split(" ", 2);

        //判断为字符日志还是数字日志
        boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
        boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
        //都是数字日志，按照顺序返回
        if (isDigit1 && isDigit2) {
            return index1 - index2;
        }
        //都不是数字日志，比较字符大小
        if (!isDigit1 && !isDigit2) {
            //比较标识符后面的字符串是否相同
            int sc = split1[1].compareTo(split2[1]);
            //不相同直接按顺序返回
            if (sc != 0) {
                return sc;
            }
            //相同则比较前面的标识符
            return split1[0].compareTo(split2[0]);

        }

        //若有一个为字符日志，一个为数字日志
        //则只需要判断isDigit1是否为真，若为真，则
        return isDigit1 ? 1 : -1;


    }


}

//日志类
class Pair {
    String log;
    int index;

    public Pair(String log, int index) {
        this.log = log;
        this.index = index;
    }
}