package edu.ysu.annotation_;

/**
 * @auther xiaochen
 * @create 2021-11-23 18:11
 */
//Class类的创建方式
public class Test04 {
    public static void main(String[] args) throws ClassNotFoundException {

        Person student = new Student();
        //1.通过对象获得
        Class c1 = student.getClass();
        System.out.println(c1.hashCode());
        //2.forname获得
        Class c2 = Class.forName("edu.ysu.annotation_.Student");
        System.out.println(c2.hashCode());
        //3.通过类名.class获得
        Class c3 = Student.class;
        System.out.println(c3.hashCode());


        Class c4 = c3.getSuperclass();
        System.out.println(c4);

    }
}
class Person{
     String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {

    }
}

class Student extends Person{
    public Student() {
        this.name = "学生";
    }
}

class Teacher extends Person{
    public Teacher() {
        this.name = "老师";
    }
}