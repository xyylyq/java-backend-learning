package com.liuyuqi.exam.test3.Timer;

import java.util.Timer;

public class Start {
    public static void main(String[] args) {
        Timer timer = new Timer();
        System.out.println("距离2025-06-07还剩：");
        // 每隔一秒执行一次run()方法
        timer.schedule(new TimeTask(), 0 , 1000);
    }
}
