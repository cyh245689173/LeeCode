package edu.ysu.linkedlist_;

import java.util.HashSet;

/**
 * @auther xiaochen
 * @create 2022-03-31 8:03
 */
public class Lc141 {
    public static void main(String[] args) {

    }

    //快慢指针
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null){
            return false;
        }

        ListNode dummy = new ListNode();
        dummy.next = head;

        //这里快慢指针所指向的节点不能相同，否则不会进入循环
        ListNode slow = dummy;
        ListNode fast = head;


        while (slow != fast) {
            //到达尾节点
            if (fast == null || fast.next == null) {
                return false;
            }

            //更新指针
            slow = slow.next;
            fast = fast.next.next;


        }

        return true;


    }
}
