package com.liuyuqi.exam.test3.Timer;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimerTask;

public class TimeTask extends TimerTask {
    // 高考开始时间
    private LocalDateTime startTime;

    // 构造器，对高考开始时间进行初始化
    public TimeTask() {
        String s = "2025-06-07 09:00:00";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        startTime = LocalDateTime.parse(s, dateTimeFormatter);
    }

    // 每秒执行一次该方法
    @Override
    public void run() {
        LocalDateTime currentTime = LocalDateTime.now();
        Duration duration = Duration.between(currentTime, startTime);
        System.out.println(duration.toDays() + "天" + duration.toHoursPart() + "时" + duration.toMinutesPart() + "分" + duration.toSecondsPart() + "秒");
    }
}
