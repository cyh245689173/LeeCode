package edu.Lc350;

import java.util.ArrayDeque;

/**
 * @auther xiaochen
 * @create 2022-04-25 21:31
 */
public class Lc150 {
    public static void main(String[] args) {

    }

    public int evalRPN(String[] tokens) {

        //如果是数字就进栈，如果不是数字就作为运算符
        //出栈两个元素，第一个出栈的右操作数，第二个出栈的为左操作数
        //两者做完运算，继续放入栈中
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < tokens.length; i++) {
            if ("+".equals(tokens[i])) {
                stack.push(stack.pop() + stack.pop());
            } else if ("-".equals(tokens[i])) {
                stack.push(-stack.pop() + stack.pop());
            } else if ("*".equals(tokens[i])) {
                stack.push(stack.pop() * stack.pop());
            } else if ("/".equals(tokens[i])) {
                int temp1 = stack.pop();
                int temp2 = stack.pop();


                stack.push(temp2 / temp1);

            } else {
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return stack.pop();


    }

}
