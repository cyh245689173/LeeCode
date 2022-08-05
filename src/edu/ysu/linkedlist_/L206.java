package edu.ysu.linkedlist_;

/**
 * @auther xiaochen
 * @create 2021-12-12 11:07
 */
public class L206 {
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        ListNode temp = null;
        ListNode pre = null;
        ListNode cur = head;

        while (cur != null){
            //记录下一个节点
            temp = cur.next;
            //反转操作
            cur.next = pre;

            //后羿操作
            pre = cur;
            cur = temp;


        }
        return cur;

    }


}
