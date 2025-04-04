package com.liuyuqi.exam.test6;

public class Test6 {
    public static void main(String[] args) {
        MyLinkedList<Integer> mll = new MyLinkedList<>();
        // 创建链表同时反转范围内的结点
        mll.forEach(mll.reverse(mll.add(),1,6));
    }
}
