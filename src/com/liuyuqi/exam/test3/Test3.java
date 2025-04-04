package com.liuyuqi.exam.test3;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        // 1.输入年份和月份，返回该月的休息日（从起始休息日开始，每隔两天休息一天）
        // 记录起始休息日
        LocalDate startDate = LocalDate.of(2022, 2, 3);
        // 取得用户输入的年份和月份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询的年份和月份（必须在2022-2之后）：");
        String s = sc.next() + "-01";
        LocalDate currentDate = LocalDate.parse(s);
        // 取得这个月的最后一天
        LocalDate endDate = currentDate.plusMonths(1).minusDays(1);
        // 遍历这个月的每一天，并存入日期对象中
        List<Day> days = new ArrayList<>();
        for (int i = 0; i < endDate.getDayOfMonth(); i++) {
            long dayDuration = ChronoUnit.DAYS.between(startDate, currentDate.plusDays(i));
            boolean flag = dayDuration % 3 == 0;
            Day day = new Day(currentDate.plusDays(i), flag);
            days.add(day);
        }
        System.out.println("该月份的日期以及是否为休息日的对应关系如下：");
        System.out.println(days.toString());
        // 2.显示该月份哪些休息日是周六或周日
        System.out.println("该月份中休息日为周六或周日的日期如下：");
        days.stream().filter(day -> day.isFree() && (day.getDate().getDayOfWeek().getValue() == 6 || day.getDate().getDayOfWeek().getValue() == 7))
                .forEach(day -> {
                    System.out.print(day.getDate() + (day.getDate().getDayOfWeek().getValue() == 6 ? "周六" : "周日") + " ");
                });
    }
}
