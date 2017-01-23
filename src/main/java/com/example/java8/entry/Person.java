package com.example.java8.entry;

import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by cnbjpuhui-384 on 2017/1/22.
 */
public class Person {
    private String name;

    private int age;

    private double salary;

    public Person(){

    }
    public Person(String name, int age, double salary) {
        super();
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", salary=" + salary
                + "]";
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj== null) {
            return false;
        } else {
            if (this.getClass() == obj.getClass()) {
                Person person = (Person) obj;
                if(person.name == null){
                    return false;
                }
            }
            return false;
        }
    }


    /**
     * 重写equals,配套重新hashCode
     * @return
     */
    @Override
    public int hashCode(){
        return new HashCodeBuilder(17, 37).append(name).toHashCode();
    }
}
