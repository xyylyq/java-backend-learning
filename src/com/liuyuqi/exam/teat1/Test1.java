package com.liuyuqi.exam.teat1;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Random r = new Random();
        // 1.生成囚犯的编号,编号在1-200之间，人数为100
        List<Integer> people = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= 100; i++) {
            while (true) {
                int person = r.nextInt(1, 201);
                if (!set.contains(person)) {
                    set.add(person);
                    people.add(person);
                    break;
                }
            }
        }
        System.out.println("全部囚犯排好队后：" + people);
        List<Integer> record = new ArrayList<>();
        record.addAll(people);
        // 2.去除奇数位置的人（从1开始计数），并重复直到只剩下一个人
        while (people.size() != 1) {
            for (int i = 0; i < people.size(); i++) {
                people.remove(i);
            }
        }
        // 3.返回幸存者
        System.out.println("最后的幸存者是：" + people.get(0) + "，其第一次站的位置是：" + (record.indexOf(people.get(0)) + 1));
    }
}
