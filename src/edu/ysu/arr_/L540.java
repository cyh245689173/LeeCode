package edu.ysu.arr_;

/**
 * @auther xiaochen
 * @create 2022-02-14 12:09
 */
public class L540 {

    public static void main(String[] args) {

        int n1 = 100;
        int n2 = n1 >> 1;
        System.out.println(n2);


    }

    //方法2：二段法
    public static int singleNonDuplicate(int[] nums) {


        int n = nums.length;
        int l = 0, r = n - 1;

        while (l < r) {

            int mid = l + r >> 1;
            //mid为偶数
            if (mid % 2 == 0) {
                if (mid + 1 < n && nums[mid] == nums[mid + 1]) {
                    //左侧为没有插入单个元素的数组，更新左边界
                    l = mid + 1;
                } else {
                    //右侧为没有插入单个元素的数组，更新右边界
                    r = mid;
                }
            } else {
                //mid为奇数
                if (mid - 1 >= 0 && nums[mid] == nums[mid - 1]) {
                    //左侧为没有插入单个元素的数组，更新左边界
                    l = mid + 1;
                } else {
                    //右侧为没有插入单个元素的数组，更新右边界
                    r = mid;
                }


            }


        }


        return nums[r];


    }
}
