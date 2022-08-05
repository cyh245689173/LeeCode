package edu.algorithm;

/**
 * @auther xiaochen
 * @create 2022-03-27 20:14
 */
public class Code_RootWalk {
    public static void main(String[] args) {
        System.out.println(way1(4, 2, 4, 4));

    }

    public static int way1(int N, int start, int aim, int K) {
        return process1(start, K, aim, N);
    }


    //机器人当前的来到的位置是cur
    //机器人还有rest步需要去走
    //最终的目标是aim
    //有哪些位置? 1 - N
    //返回： 机器人从cur出发，走过rest步之后，最终停在aim的方法数有多少种。
    public static int process1(int cur, int rest, int aim, int N) {
        if (rest == 0) { //步数为0了，不需要走了！
            // 直接判断当前点是否为目标点并返回结果
            return cur == aim ? 1 : 0;
        }
        //rest> 0
        //还有步数要走！

        //机器人当前在左边界，下一步只能向右走,即1 -> 2
        if (cur == 1) {
            //在1位置有rest步和在2位置有rest - 1步，没有区别，因为1 -> 2这一步是固定的
            return process1(2, rest - 1, aim, N);
        }
        //机器人当前在右边界，下一步只能向左走，即N - 1 <- N
        if (cur == N) {
            return process1(N - 1, rest - 1, aim, N);
        }

        //机器人在中间，可以任意向两边走,则结果为向左走的结果和向右走的结果加和
        return process1(cur - 1, rest - 1, aim, N) + process1(cur + 1, rest - 1, aim, N);

    }
}
