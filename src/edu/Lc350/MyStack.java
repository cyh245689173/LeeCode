package edu.Lc350;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * @auther xiaochen
 * @create 2022-04-03 8:18
 */
public class MyStack {
    //使用一个队列实现栈
    Deque<Integer> queue;

    public MyStack() {
        queue = new ArrayDeque<>();
    }

    //在入栈时做文章，在每次入队后，都将之前的元素出队重新入队，即可达到先进后出的效果
    public void push(int x) {
        queue.push(x);
        //一共需要出队的元素有队列长度减一个
        for (int i = 0;i < queue.size() -1;i++){
            queue.push(queue.pop());
        }
    }

    public int pop() {
        return queue.pop();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
