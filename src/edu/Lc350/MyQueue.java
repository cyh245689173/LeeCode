package edu.Lc350;

import java.util.Stack;

/**
 * @auther xiaochen
 * @create 2022-04-02 9:31
 */
public class MyQueue {
    //使用两个栈来实现队列，一个作为队列的头部作为入口栈，一个作为队列的尾部作为出口栈

    Stack<Integer> stackIn;
    Stack<Integer> stackOut;

    public MyQueue() {
        //入口栈负责入队
        stackIn = new Stack<>();
        //出口栈负责出栈
        stackOut = new Stack<>();

    }

    public void push(int x) {
        stackIn.push(x);

    }

    public int pop() {
        dumppstackIn();
        return stackOut.pop();
    }

    public int peek() {
        dumppstackIn();
        return stackOut.peek();
    }

    //两个栈均为空时，队列为空
    public boolean empty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }

    //如果StackOut为空，则将StackIn中的元素全部放到StackOut中
    private void dumppstackIn() {
        if (!stackOut.isEmpty()) {
            return;
        }
        while (!stackIn.isEmpty()) {
            stackOut.push(stackIn.pop());
        }
    }

}
