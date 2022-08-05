package edu.Lc350;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther xiaochen
 * @create 2022-03-27 8:21
 */
public class Lc35022 {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        int[] res = intersect(nums1, nums2);
        System.out.println(Arrays.toString(res));

    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int m = nums1.length;
        int n = nums2.length;


        int[] res = new int[Math.min(m, n)];
        int index = 0;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                res[index++] = nums1[i];
                i++;
                j++;
            }
        }
        return Arrays.copyOfRange(res, 0, index);


    }
}
