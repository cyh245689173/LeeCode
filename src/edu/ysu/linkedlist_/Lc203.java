package edu.ysu.linkedlist_;

/**
 * @auther xiaochen
 * @create 2022-03-31 9:24
 */
public class Lc203 {
    public static void main(String[] args) {

    }

    public ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode();
        dummy.next = head;
        //pre代表当前节点的前一节点，cur代表当前节点
        ListNode pre = dummy;
        ListNode cur = head;

        //是否到达链表尾部
        while (cur != null) {
            //找到目标值，进行删除操作
            if (cur.val == val) {
                pre.next = cur.next;
                cur = cur.next;
                continue;
            }
            //更新指针
            cur = cur.next;
            pre = pre.next;
        }

        return dummy.next;
    }
}
