package edu.ysu.linkedlist_;

import java.util.List;
import java.util.zip.Inflater;

/**
 * @auther xiaochen
 * @create 2021-11-12 16:05
 */
public class MyLinkedList {
    //链表长度
    int size;
    //虚拟头结点
    ListNode dummy;

    //初始化链表
    public MyLinkedList() {
        size = 0;
        dummy = new ListNode(0);

    }

    public int get(int index) {
        //index非法，返回-1
        if (index < 0 || index >=size){
            return -1;
        }

        ListNode cur = dummy;
        for(int i = 0;i <= index;i++){
            cur = cur.next;
        }
        return cur.val;


    }
    //在链表最前面插入一个节点
    public void addAtHead(int val) {

        addAtIndex(0,val);
    }

    public void addAtTail(int val) {
        addAtIndex(size,val);

    }
    // 在第 index 个节点之前插入一个新节点，例如index为0，那么新插入的节点为链表的新头节点。
    // 如果 index 等于链表的长度，则说明是新插入的节点为链表的尾结点
    // 如果 index 大于链表的长度，则返回空
    public void addAtIndex(int index, int val) {
        if (index > size){
            return;
        }

        if (index < 0){
            index = 0;
        }

        size++;

        //找到要插入节点的前驱结点
        ListNode pre = dummy;
        for (int i = 0;i < index;i++){
            pre = pre.next;
        }
        ListNode node = new ListNode(val);
        node.next = pre.next;
        pre.next = node;





    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size){
            return;
        }
        size--;
        ListNode pre = dummy;
        for (int i = 0;i < index;i++){
            pre = pre.next;
        }
        pre.next = pre.next.next;
    }
}
