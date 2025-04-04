package com.liuyuqi.exam.test4;

@FunctionalInterface
public interface MyConsumer<T> {
    void accept(T t);
}
