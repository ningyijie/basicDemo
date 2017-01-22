package com.example.java8.function;

import java.util.List;

/**
 * Created by cnbjpuhui-384 on 2017/1/22.
 */
public class FirstAggregator<T> implements Aggregator<T> {
    @Override
    public Object aggregate(Object key, List<T> values) {
        if ( values.size() >= 1) {
            return values.get( 0 );
        }else {
            return null;
        }
    }
}
