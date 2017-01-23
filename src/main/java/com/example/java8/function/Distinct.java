package com.example.java8.function;

import com.example.java8.entry.Person;
import org.junit.Test;

import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by cnbjpuhui-384 on 2017/1/23.
 */
public class Distinct {

    @Test
    public void testDistinct(){
        List<Person> personList=new ArrayList<>();
        Person person1=new Person("aa",1,0.1d);
        Person person2=new Person("bb",2,0.2d);
        Person person3=new Person("cc",3,0.3d);
        Person person4=new Person();
        Person person5=new Person();
        person5.setAge(5);
        person4.setAge(6);

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);

        List list=personList.stream().distinct().collect(Collectors.toList());
        System.out.println(list.size());
    }
}
