package com.liuyuqi.exam.test2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        String userStrs = "10001:张三:男:1990-01-01#10002:李四:女:1989-01-09#10003:王五:男:1999-09-09#10004:刘备:男:1899-01-01#10005:孙悟空:男:1900-01-01#10006:张三:女:1999-01-01#10007:刘备:女:1999-01-01#10008:张三:女:2003-07-01#10009:猪八戒:男:1900-01-01";
        // 1.解析字符串
        List<User> list = new ArrayList<>();
        String[] users = userStrs.split("#");
        for (String user : users) {
            String[] info = user.split(":");
            User u = new User();
            for (int i = 0; i < info.length; i++) {
                switch (i) {
                    case 0:
                        u.setId(Long.parseLong(info[i]));
                        break;
                    case 1:
                        u.setName(info[i]);
                        break;
                    case 2:
                        u.setGender(info[i]);
                        break;
                    case 3:
                        u.setBirthday(LocalDate.parse(info[i]));
                        break;
                    default:
                        break;
                }
            }
            list.add(u);
        }
        System.out.println(list);
        // 2.统计每个名字出现的次数，封装到Map集合中
        Map<String, Integer> map = new HashMap<>();
        for (User l : list) {
            String name = l.getName();
            if (!map.containsKey(name)) {
                map.put(name, 1);
            } else {
                int count = map.get(name);
                map.put(name, ++count);
            }
        }
        map.forEach((k,v) -> System.out.println(k + ":" + v + "次"));
    }
}
