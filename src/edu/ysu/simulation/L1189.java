package edu.ysu.simulation;

/**
 * @auther xiaochen
 * @create 2022-02-13 14:40
 */
public class L1189 {
    public static void main(String[] args) {
        String text = "loonbalxballpoon";
        int i = maxNumberOfBalloons(text);
        System.out.println(i);


    }

    //思路：
    //“balloon”中一共含有5个字母，'b','a','l','o','n',使用一个五位的数组进行存储他们在单词中对应的出现的次数，
    //但是由于字母l和字母o都需要出现两次，则对他们出现的次数进行除2向下取整（向下取整是因为比如出现3次也是只能算两个l）
    //最后找出这五位的数组中最小的数字则是balloon出现的次数
    public static int maxNumberOfBalloons(String text) {
        int[] cnt = new int[5];

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == 'b') {
                cnt[0]++;
            } else if (c == 'a') {
                cnt[1]++;
            } else if (c == 'l') {
                cnt[2]++;
            } else if (c == 'o') {
                cnt[3]++;
            } else if (c == 'n') {
                cnt[4]++;
            }
        }
        cnt[2] /= 2;
        cnt[3] /= 2;


        int ans = cnt[0];

        for (int i = 0;i < cnt.length;i++){
            ans = Math.min(ans,cnt[i]);
        }

        return ans;

    }
}
