package edu.Lc350;

import java.util.Arrays;

/**
 * @auther xiaochen
 * @create 2022-05-01 9:04
 */
public class Lc978 {
    public int maxTurbulenceSize(int[] arr) {
        int length = arr.length;

        //用于记录最长湍流子数组长度
        int[] up = new int[length];
        int[] down = new int[length];

        //填充值
        Arrays.fill(up, 1);
        Arrays.fill(down, 1);

        //结果值，因为每个数字都可以看做为一个最小的湍流子数组，所以初始值为1
        int ans = 1;

        for (int i = 1; i < length; i++) {
            //上升
            if (arr[i] > arr[i - 1]) {
                //更新上升数组并比较子数组最长长度
                up[i] = down[i - 1] + 1;
                ans = Math.max(ans, up[i]);
                //下降
            } else if (arr[i] < arr[i - 1]) {
                //更新下降数组并比较子数组最长长度
                down[i] = up[i - 1] + 1;
                ans = Math.max(ans, down[i]);
            }
        }

        return ans;

    }
}
