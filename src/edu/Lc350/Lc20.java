package edu.Lc350;

import java.util.HashMap;
import java.util.Stack;

/**
 * @auther xiaochen
 * @create 2022-04-02 8:40
 */
public class Lc20 {
    public static void main(String[] args) {

    }

    public boolean isValid(String s) {
        //如果字符串的长度为奇数，则可以直接返回false
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        //使用哈希表存储括号之间的对应关系
        HashMap<Character, Character> map = new HashMap<>();

        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            //是左括号，进栈
            if (map.containsValue(c)) {
                stack.push(c);
            } else {
                //是右括号，判断栈是否为空，若不为空弹出栈顶元素，比较看是否为对应的左括号
                /*
                 * Stack.peek()和Stack.pop(）的相同点是 获取栈顶的值，
                 * 不同点 则是 Stack.peek()只是获取栈顶的值，而Stack.pop()是获取栈顶的值然后删除。*/
                if (stack.isEmpty() || stack.peek() != map.get(c)) {
                    return false;
                }

                //满足条件，弹出元素
                stack.pop();

            }

        }
        //存在全是左括号的情况，最终栈为空则返回true，栈中还有元素返回false
        return stack.isEmpty();
    }
}
