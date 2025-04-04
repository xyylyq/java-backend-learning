package com.liuyuqi.exam.test6;

import java.util.Scanner;

public class MyLinkedList<T> {
    // 结点内部类
    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<T> head = null;
    private Node<T> tail;
    private int size = 0;

    // 添加元素到链表尾部
    public Node<T> add() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您要添加的结点数据（输入exit代表结束）:");
            String s = sc.next();
            if ("exit".equals(s)){
                break;
            }
            Node<T> node = new Node<>((T) s, null);
            if (head == null) {
                head = node;
            } else {
                tail.next = node;
            }
            tail = node;
            size++;
        }
        return head;
    }

    // 反转部分链表
    public Node<T> reverse(Node<T> head, int left, int right) {
        if (left < 1 || right < left || right > size) {
            throw new IllegalArgumentException("Invalid range");
        }
        // 虚拟头结点，简化边界处理
        Node<T> dummy = new Node<>(null, head);
        // 反转部分第一个结点的前一个位置
        Node<T> prev = dummy;
        // 反转部分最后一个结点的后一个位置
        Node<T> last = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
        for (int i = -1; i < right; i++) {
            last = last.next;
        }
        // 当前操作的结点
        Node<T> cur = prev.next;
        // 临时结点，记录反转后的最后一个结点，方便进行最后与后半部分链表的连接
        Node<T> temp = cur;
        // 记录当前操作结点的下一个结点
        Node<T> next;
        // 反转操作
        while (cur != last) {
            next = cur.next;
            cur.next = prev.next;
            prev.next = cur;
            cur = next;
        }
        tail.next = last;
        return dummy.next;
    }

    // 接收新链表并进行遍历输出
    public void forEach(Node<T> node) {
        Node<T> current = node;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
