package edu.ysu.linkedlist_;

/**
 * @auther xiaochen
 * @create 2022-03-31 8:57
 */
public class Lc21 {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        //哑结点，标识链表头部
        ListNode dummy = new ListNode();
        //pre指针用来指示当前插入位置
        ListNode pre = dummy;

        //两链表都非空时进行插入合并操作，有一个为空直接对另一个进行连接操作即可
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                pre.next = list1;
                list1 = list1.next;
            } else {
                pre.next = list2;
                list2 = list2.next;
            }

            pre = pre.next;

        }
        //合并之后还有部分链表没有合并，则直接将其连到链表尾端即可
        pre.next = list1 == null ? list2:list1;


        return dummy.next;
    }
}
