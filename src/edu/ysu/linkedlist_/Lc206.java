package edu.ysu.linkedlist_;

/**
 * @auther xiaochen
 * @create 2022-04-01 8:07
 */
public class Lc206 {
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode cur = head;
        //用于保存反转的下一节点
        ListNode temp = null;

        while (cur != null) {
            //保存下一节点
            temp = cur.next;
            //反转操作
            cur.next = pre;
            //更新指针
            pre = cur;
            cur = temp;
        }
        //最终cur指向null，pre指向链表头部
        return pre;
    }

}
