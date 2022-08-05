package edu.ysu.arr_;

/**
 * @auther xiaochen
 * @create 2022-02-16 17:15
 */
public class L27 {
    public static void main(String[] args) {

        int[] nums = {1,2,2,3,4,5,6,7,2};
        int i = removeElement(nums, 2);
        System.out.println(i);

    }

    public static int removeElement(int[] nums, int val) {


        /*
        * 双指针法，快慢指针
        * 快指针查找第一个不为目标元素的位置，
        * 慢指针查找第一个为目标元素的位置，
        * 快指针的值覆盖慢指针的值，
        * 然后两指针继续向后查找
        *
        *
        * */

        int slow = 0,fast = 0;

        while (fast < nums.length){
          if (nums[fast] != val){
              nums[slow] = nums[fast];
              slow++;
          }
          fast++;
        }

        return slow;



    }
}