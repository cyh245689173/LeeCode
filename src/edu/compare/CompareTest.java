package edu.compare;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

/**
 * @auther xiaochen
 * @create 2022-05-03 15:03
 */
public class CompareTest {
    @Test
    public void test1() {
        String[] strings = {"AA", "CC", "ZZ", "KK", "LL", "YY"};

        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
    }

    @Test
    public void test2() {
        Goods[] arr = new Goods[5];
        arr[0] = new Goods("罗技",299);
        arr[1] = new Goods("雷蛇",399);
        arr[2] = new Goods("小米",99);
        arr[3] = new Goods("戴尔",169);
        arr[4] = new Goods("联想",99);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }




    @Test
    public void test3() {
        String[] strings = {"AA", "CC", "ZZ", "KK", "LL", "YY"};
        //按照字符串从大到小排列
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });

        System.out.println(Arrays.toString(strings));
    }

    @Test
    public void test4() {
        Goods[] arr = new Goods[6];
        arr[0] = new Goods("l罗技",299);
        arr[1] = new Goods("l雷蛇",399);
        arr[2] = new Goods("x小米",99);
        arr[3] = new Goods("d戴尔",169);
        arr[4] = new Goods("l联想",99);
        arr[5] = new Goods("l雷蛇",199);

        Arrays.sort(arr, new Comparator<Goods>() {
            //商品比较大小的方式：按照商品名称从低到高,再按照商品价格从高到低排序
            @Override
            public int compare(Goods o1, Goods o2) {
                //名字一样，比较价格
                if (o1.getName().equals(o2.getName())){
                    return -Double.compare(o1.getPrice(),o2.getPrice());
                }else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test5() {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1,2);
        map.put(3,3);
        map.put(4,4);
        map.put(5,5);

        System.out.println(map.getOrDefault(1,0));
        System.out.println(map.getOrDefault(6,0));
    }


}
