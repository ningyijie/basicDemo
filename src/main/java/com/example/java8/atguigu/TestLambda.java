package com.example.java8.atguigu;

import org.junit.Test;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Desc:lambda体验
 * Created by ningyijie on 2017/7/12.
 */
public class TestLambda {

    //匿名内部类
    @Test
    public void test1(){
        Comparator<Integer> com=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };

        TreeSet<Integer> ts=new TreeSet<>(com);
    }


    //lambda 表达式
    @Test
    public void test2(){
        Comparator<Integer> com =(x,y)->Integer.compare(x,y);
        TreeSet<Integer> ts=new TreeSet<>(com);
    }


}
