package edu.ysu.str_;

/**
 * @auther xiaochen
 * @create 2022-04-07 10:26
 */
public class Lc796 {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}
