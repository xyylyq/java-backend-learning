package com.liuyuqi.exam.test4;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<T> {
    private Object[] list;
    private int size = 0;
    private static final int INITIAL_CAPACITY = 10;

    public void add(T t) {
        if (size == 0) {
            list = new Object[INITIAL_CAPACITY];
        }
        if (size >= list.length) {
            list = Arrays.copyOf(list, list.length + list.length >> 1);
        }
        list[size++] = t;
    }

    public T get(int index) {
        if (checkIndex(index)) {
            System.out.println("输入索引越界");
        }
        return (T) list[index];
    }

    public T remove(int index) {
        if (checkIndex(index)) {
            System.out.println("输入索引越界");
        }
        T result = (T) list[index];
        int i = index + 1;
        while (i < list.length) {
            list[i - 1] = list[i];
            i++;
        }
        size--;
        return result;
    }

    private boolean checkIndex(int index) {
        return index < 0 || index > size;
    }


    public int size() {
        return size;
    }

    public void forEach(MyConsumer<T> action) {
        Objects.requireNonNull(action);
        for (int i = 0; i < size; i++) {
            action.accept(get(i));
        }
    }
}
