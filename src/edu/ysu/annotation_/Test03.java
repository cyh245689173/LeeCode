package edu.ysu.annotation_;

/**
 * @auther xiaochen
 * @create 2021-11-23 17:58
 */
//什么叫反射
public class Test03 {
    public static void main(String[] args) throws ClassNotFoundException {
        //通过反射获取类的Class对象
        Class c1 = Class.forName("edu.ysu.annotation_.User");
        System.out.println(c1);
        Class c2 = Class.forName("edu.ysu.annotation_.User");
        Class c3 = Class.forName("edu.ysu.annotation_.User");
        Class c4 = Class.forName("edu.ysu.annotation_.User");

        //一个类在内存中只有一个Class对象
        //一个类在被加载之后，类的整个结构都会被封装在Class对象中
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());

    }
}

//实体类
class User{
    private String name;
    private int id;
    private int age;

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}



