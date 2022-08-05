package edu.Lc350;

/**
 * @auther xiaochen
 * @create 2022-03-27 19:23
 */
public class Lc121 {
    public static void main(String[] args) {

    }


    public int maxProfit(int[] prices) {

        //买入的最低价格
        int minprice = Integer.MAX_VALUE;
        //当前最大利润
        int maxprofit = 0;
        //循环遍历数组
        /*
        * 寻找最大利润的条件：
        *       1.如果当前值小于最低价格，就将当前值设置为最低价格，即从此刻买入
        *       2.若当前值不小于最低价格，则与最大利润进行对比，判断今天是否为最佳卖出时间
        * */
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else {
                maxprofit = Math.max(maxprofit,prices[i] - minprice);
            }
        }
        return maxprofit;
    }
}
