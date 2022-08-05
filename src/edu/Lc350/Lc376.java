package edu.Lc350;

/**
 * @auther xiaochen
 * @create 2022-05-10 10:41
 */
public class Lc376 {
    public int wiggleMaxLength(int[] nums) {

        if (nums.length <= 1) {
            return nums.length;
        }
        //当前一对元素的差值
        int curPair = 0;
        int prePair = 0;
        //最低有一个
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            curPair = nums[i + 1] - nums[i];
            //出现峰值，记录摆动序列个数并更新峰值
            if ((curPair > 0 && prePair <= 0) || (curPair < 0 && prePair >= 0)) {
                count++;
                prePair = curPair;
            }

        }
        return count;

    }
}
