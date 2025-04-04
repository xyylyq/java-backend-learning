package com.liuyuqi.moviedemo;

import java.util.Scanner;

public class MovieTest {
    public static void main(String[] args) {
        Movie[] movies = new Movie[4];
        movies[0] = new Movie(1,"水门桥",38.9,9.8,"徐克","12万人想看");
        movies[1] = new Movie(2,"出拳吧",39,7.8,"唐晓白","3.5万人想看");
        movies[2] = new Movie(3,"月球陨落",42,7.9,"罗兰","17万人想看");
        movies[3] = new Movie(4,"一点就到家",35,8.7,"许宏宇","10.8万人想看");

        MovieOperator operator = new MovieOperator(movies);

        while (true) {
            System.out.println("====电影信息系统====");
            System.out.println("1.查询全部电影信息");
            System.out.println("2.输入编号查询电影信息");
            System.out.println("3.退出系统");
            System.out.println("请输入您想进行的操作对应编码：");
            Scanner sc = new Scanner(System.in);
            int code = sc.nextInt();

            switch (code){
                case 1:
                    operator.printAllMovies();
                    break;
                case 2:
                    System.out.println("请输入您想查询的电影编号：");
                    int id = sc.nextInt();
                    operator.searchMovieById(id);
                    break;
                case 3:
                    System.out.println("感谢您的使用，欢迎下次访问");
                    return;
                default:
                    System.out.println("没有对应的操作，请检查您输入的操作编号");
            }
        }
    }
}
