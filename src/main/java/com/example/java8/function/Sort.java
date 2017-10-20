package com.example.java8.function;

import com.example.java8.entry.Human;
import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Desc:java 8 排序
 * Created by ningyijie on 2017/7/25.
 */
public class Sort {

    @Test
    public void whenSortingentitiesByName() {
        List<Human> humans = Lists.newArrayList(new Human("Sarah", 10), new Human("Jack", 12));
        humans.sort(( h1,  h2) -> h1.getName().compareTo(h2.getName()));
        Assert.assertThat(humans.get(0).getAge(), equalTo(12));
    }


    /**
     *
     */
    @Test
    public void givenMethodDefinition_whenSortingEntitiesByNameThenAge_thenCorrectlySorted() {
        List<Human> humans = Lists.newArrayList(new Human("Sarah", 10), new Human("Jack", 12));
        humans.sort(Human::compareByNameThenAge);
        Assert.assertThat(humans.get(0).getAge(), equalTo(12));
    }

    /**
     *
     */
    @Test
    public void givenInstanceMethod_whenSortingEntitiesByNameThenAge_thenCorrectlySorted() {
        List<Human> humans = Lists.newArrayList(new Human("Sarah", 10), new Human("Jack", 12));
        Collections.sort(humans, Comparator.comparing(Human::getName));
        Assert.assertThat(humans.get(0).getAge(), equalTo(12));
    }



}
