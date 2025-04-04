package com.liuyuqi.cardgame;

import java.util.*;

public class Room {
    private List<Card> allCards = new ArrayList<>();

    public Room() {
        // 1.在房间中做出54张牌
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] colors = {"♠", "♥", "♣", "♦"};
        int size = 1;
        for (String number : numbers) {
            for (String color : colors) {
                Card card = new Card(number, color, size);
                allCards.add(card);
            }
            size++;
        }
        Card king1 = new Card("🃏", "", size);
        Card king2 = new Card("🤡", "", size + 1);
        Collections.addAll(allCards, king1, king2);
        System.out.println("一副牌：" + allCards);
    }

    public void start() {
        // 1.洗牌
        Collections.shuffle(allCards);
        System.out.println("洗好的一副牌：" + allCards);
        // 2.发牌
        List<Card> player1 = new ArrayList<>();
        List<Card> player2 = new ArrayList<>();
        List<Card> player3 = new ArrayList<>();
        for (int i = 0; i < allCards.size() - 3; i++) {
            if (i % 3 == 0) {
                player1.add(allCards.get(i));
            } else if (i % 3 == 1) {
                player2.add(allCards.get(i));
            } else {
                player3.add(allCards.get(i));
            }
        }
        List<Card> lastThreeCards = allCards.subList(allCards.size() - 3, allCards.size());
        System.out.println("三张底牌：" + lastThreeCards);
        // 3.将三张底牌分给地主
        Random r = new Random();
        int code = r.nextInt(1, 4);
        switch (code) {
            case 1:
                player1.addAll(lastThreeCards);
                break;
            case 2:
                player2.addAll(lastThreeCards);
                break;
            case 3:
                player3.addAll(lastThreeCards);
                break;
            default:
                break;
        }
        // 4.将牌按权值调整为有序
        sortCards(player1);
        sortCards(player2);
        sortCards(player3);
        System.out.println("玩家1的牌：" + player1);
        System.out.println("玩家2的牌：" + player2);
        System.out.println("玩家3的牌：" + player3);
    }

    // Lambda表达式写法
    private void sortCards(List<Card> player) {
        Collections.sort(player, (o1, o2) -> {
            return o1.getSize() - o2.getSize();
        });
    }

//    private void sortCards(List<Card> player) {
//        Collections.sort(player, new Comparator<Card>() {
//            @Override
//            public int compare(Card o1, Card o2) {
//                return o1.getSize() - o2.getSize();
//            }
//        });
//    }
}
