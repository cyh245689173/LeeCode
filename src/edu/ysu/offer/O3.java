package edu.ysu.offer;

/**
 * @auther xiaochen
 * @create 2021-11-23 19:41
 */
public class O3 {
    public static void main(String[] args) {


    }

    public static int findRepeatNumber(int[] nums) {
        /*
         * 因为数组中所有的数组都在0~n-1范围内
         * 说明数组索引和数组元素的值是一对多的关系
         * 所以可以通过遍历数组使得数组索引和数组元素一一对应。
         *
         * 遍历中，第一次遇到数字x时，把它移动到数组下标为x的地方，
         * 当第二次遇到x时，一定有nums[x] == x；
         * 此时可以得到一组重复数字
         *
         *
         * 算法流程：
         *       1.遍历数组，判断当前值和当前索引是否相等，若不相等则把该数字x移动到x处，若相等无需交换直接跳过
         *       2.判断nums[nums[i]] = nums[i],则证明索引num[i]和num[nums[i]]处的值相同，找到一组重复值
         *
         *
         *
         * */

        for (int i = 0; i < nums.length; i++) {
            if (i == nums[i]) {
                i++;
                continue;

            }

            if (nums[nums[i]] == nums[i]) {
                return nums[i];
            }

            int temp = nums[i];
            nums[i] = nums[temp];
            nums[temp] = temp;

        }


        return -1;
    }
}
