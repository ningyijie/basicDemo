package com.example.java8.function;

import java.util.List;

/**
 * Created by cnbjpuhui-384 on 2017/1/22.
 * 计数聚合操作
 */
public class CountAggregator<T> implements Aggregator<T> {
    @Override
    public Object aggregate(Object key, List<T> values) {
        return values.size();
    }

    public static void main(String[] args) {
    }
}
