package edu.ysu.linkedlist_;

import javafx.beans.binding.When;

/**
 * @auther xiaochen
 * @create 2022-04-01 8:51
 */
public class Lc83 {
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        /*
        * 双指针法：
        *       因为是排序链表，所以重复元素肯定相邻
        *       使用两个并列的指针对链表进行遍历，
        *       逐一比较
        *
        * */

        if (head == null || head.next == null){
            return head;
        }


        ListNode pre = head;
        ListNode cur = head.next;


        while (cur != null){
            if (pre.val == cur.val){
                pre.next = cur.next;
                cur = cur.next;
            }else {
                pre = cur;
                cur = cur.next;
            }
        }

        return head;

    }
}
