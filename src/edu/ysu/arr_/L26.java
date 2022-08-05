package edu.ysu.arr_;

/**
 * @auther xiaochen
 * @create 2022-02-17 13:38
 */
public class L26 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int i = removeDuplicates(nums);
        System.out.println(i);

    }

    public static int removeDuplicates(int[] nums) {
        int slow = 0,fast = 1;
        if (nums.length == 0 && nums == null){
            return -1;
        }

        for (;fast < nums.length;fast++){
            if (nums[fast] != nums[slow]){
                nums[++slow] = nums[fast++];
            }

        }
        return slow + 1;
    }
}
