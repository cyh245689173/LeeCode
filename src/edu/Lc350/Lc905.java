package edu.Lc350;

/**
 * @auther xiaochen
 * @create 2022-04-29 9:16
 */
public class Lc905 {

    public static void main(String[] args) {

    }

    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1;
        while (l < r) {
            if (nums[l] % 2 == 1 && nums[r] % 2 == 0) {
                this.swap(nums, l, r);
            } else if (nums[l] % 2 == 0 && nums[r] % 2 == 0) {
                l++;
            } else if (nums[l] % 2 == 1 && nums[r] % 2 == 1) {
                r--;
            } else {
                l++;
                r--;
            }

        }
        return nums;
    }


    public void swap(int[] nums, int i, int j) {
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }
}
