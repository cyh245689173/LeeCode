package edu.ysu.str_;

/**
 * @auther xiaochen
 * @create 2021-11-10 10:02
 */
public class L495 {
    public static void main(String[] args) {

        int[] timeSeries = {1,3,5,7,9,11};

        int ans = findPoisonedDuration(timeSeries,3);

        System.out.println("每次攻击中毒时间为3秒,伤害为50"+"六次攻击造成的伤害是:"+ans * 50);



    }


//    public static int findPoisonedDuration(int[] timeSeries, int duration) {
//        int ans = 0;
//        //记录当前攻击中毒终止时间
//        int end = 0;
//
//        for (int i = 0; i < timeSeries.length; i++) {
//            //下次攻击时间大于上次攻击结束时间
//            if (timeSeries[i] >= end){
//                //直接加上duration
//                ans += duration;
//                //更新当前攻击结束时间
//                end = timeSeries[i] + duration;
//            }else {
//                //加上duration减去上次攻击和这次攻击重合的时间
//                ans += duration - (end - timeSeries[i]);
//                //更新当前攻击结束时间
//                end = timeSeries[i] + duration;
//            }
//        }
//        return ans;
//
//    }

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int ans = 0;
        //记录上次攻击中毒终止时间,第0次要比0小
        int last_end = -1;
        //数组中每个数都代表当前攻击开始时间
        for (int start : timeSeries) {
            //当前攻击结束时间
            int end = start + duration - 1;

            ans += start > last_end?duration:end - last_end;
            last_end = end;
        }

        return ans;


    }
}
