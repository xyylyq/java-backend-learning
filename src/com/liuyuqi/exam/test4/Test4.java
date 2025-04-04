package com.liuyuqi.exam.test4;

public class Test4 {
    public static void main(String[] args) {
        MyArrayList<String> mal = new MyArrayList<>();
        mal.add("lyq");
        mal.add("123");
        mal.add("!@#");
        mal.forEach(System.out::print);
        System.out.println(mal.get(2));
        System.out.println(mal.remove(1));
        System.out.println(mal.size());
        mal.forEach(System.out::print);
    }
}
