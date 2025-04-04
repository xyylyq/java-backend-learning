package com.liuyuqi.moviedemo;

public class MovieOperator {
    private Movie[] movies;
    public MovieOperator(Movie[] movies){
        this.movies = movies;
    }

    // 1.展示系统全部电影信息
    public void printAllMovies(){
        System.out.println("-----------系统全部电影展示-----------");
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println("编号：" + m.getId());
            System.out.println("名称：" + m.getName());
            System.out.println("价格：" + m.getPrice());
            System.out.println("-------------------------------");
        }
    }


    // 2.用户根据电影编号（id）查询出某个电影的详细信息
    public void searchMovieById(int id){
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if (m.getId() == id){
                System.out.println("您查询到的电影信息如下：");
                System.out.println("编号：" + m.getId());
                System.out.println("名称：" + m.getName());
                System.out.println("价格：" + m.getPrice());
                System.out.println("评分：" + m.getScore());
                System.out.println("导演：" + m.getDirector());
                System.out.println("信息：" + m.getInfo());
                System.out.println("---------------------------");
                return;
            }
        }
        System.out.println("未找到对应的电影信息，请检查您的输入");
    }
}
