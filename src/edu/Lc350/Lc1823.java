package edu.Lc350;

import java.util.ArrayDeque;

/**
 * @auther xiaochen
 * @create 2022-05-04 8:47
 */
public class Lc1823 {
    public int findTheWinner(int n, int k) {
        /*
         * 使用队列
         * 将元素存入队列中，
         * 将队首元素出队并继续加入对尾，
         * 直到第k个元素，出队后不在加入队尾，直接出队
         * 第k+1个元素作为队首元素继续执行上述操作
         *
         * */

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        //将元素存入队列
        for (int i = 1; i <= n; i++) {
            deque.offer(i);
        }

        while (deque.size() != 1) {
            //前k-1个元素加入队尾
            for (int i = 0; i < k - 1; i++) {
                deque.addLast(deque.poll());
            }
            //第k个元素弹出
            deque.poll();
        }

        return deque.peek();

    }
}
