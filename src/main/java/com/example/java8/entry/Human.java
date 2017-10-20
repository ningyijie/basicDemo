package com.example.java8.entry;

/**
 * Desc:排序用到的实体
 * Created by ningyijie on 2017/7/25.
 */
public class Human {

    public String name;
    public int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static int compareByNameThenAge(Human lhs, Human rhs) {
        if (lhs.name.equals(rhs.name)) {
            return lhs.age - rhs.age;
        } else {
            return lhs.name.compareTo(rhs.name);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
