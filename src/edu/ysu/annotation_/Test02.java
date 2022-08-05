package edu.ysu.annotation_;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @auther xiaochen
 * @create 2021-11-23 16:20
 */
@MyAnnotation
public class Test02 {

}


//定义一个注解
//Target 表示注解可以用在那些地方
@Target(value = {ElementType.METHOD,ElementType.TYPE})
//Retention 表示注解在哪里有效
@Retention(value = RetentionPolicy.RUNTIME)
//
@interface MyAnnotation{

}