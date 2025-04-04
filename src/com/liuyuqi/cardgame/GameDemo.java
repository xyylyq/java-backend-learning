package com.liuyuqi.cardgame;

/**
 * @author liuyuqi
 * 目标：斗地主游戏案例开发
 * 业务需求分析：
 *     业务：总共54张牌
 *     点数："3","4","5","6","7","8","9","10","J","Q","K","A","2"
 *     花色："♠","♥","♣","♦"
 *     大小王："🃏","🤡"
 *     点数分别组合四种花色，大小王各一张
 *     斗地主：发出51张牌，剩下3张作为底牌
 */
public class GameDemo {
    public static void main(String[] args) {
        // 创建新的斗地主房间
        Room room = new Room();
        // 游戏启动
        room.start();
    }
}
