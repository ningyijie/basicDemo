package com.example.java8.function;

import java.util.List;

/**
 * Created by cnbjpuhui-384 on 2017/1/22.
 */
public interface Aggregator<T> {
    /**
     * 每一组的聚合操作
     *
     * @param key 组别标识key
     * @param values 属于该组的元素集合
     * @return
     */
    Object aggregate(Object key , List<T> values);

}
