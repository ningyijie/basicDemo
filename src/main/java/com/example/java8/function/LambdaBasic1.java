package com.example.java8.function;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * Desc:    Lambda 表达式的基础语法：JAVA8中引入了一个新的操作符"->" 该操作符陈伟操作符或 Lambda 操作符
 *                  箭头操作符将Lambda 表达式拆分成两部分：
*            左侧: Lambda 表达式参数列表
 *           右侧：Lambda 表达式中所需要执行的功能，即 Lambda 体
 *
 *  语法格式一： 无参数，无返回值
 *            ()->System.out.println("")
 *
 *  语法格式二：有一个参数，无返回值
 *              （x）->System.out.println(x)、
 *  语法格式三：若只有一个参数，小括号可以省略不写
 *              x->System.out.println(x)、
 * 语法格式四：若只有一个参数，小括号可以省略不写
 *               Comparator<Integer> com=(x,y)->{
                        System.out.println("函数式接口");
                        return Integer.compare(x,y);
                     };
 *
 *
 *
 *
 * 
 * Created by ningyijie on 2017/7/12.
 */
public class LambdaBasic1 {

    @Test
    public void test1(){
        int num=0;//jdk 1.7 之前必须是final

        Runnable r=new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world!"+ num);
            }
        };

        r.run();

        Runnable r1=()-> System.out.println("Hello Lambda!"+num);
        r1.run();
    }


    @Test
    public void test2(){
        Consumer<String> con=(x)-> System.out.println(x);
        con.accept("厉害了我JAVA");
    }

    @Test
    public void test4(){
        Comparator<Integer> com=(x,y)->{
            System.out.println("函数式接口");
            return Integer.compare(x,y);
        };
    }
}
