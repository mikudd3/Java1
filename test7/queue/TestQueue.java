package com.lanqiao.javalearn.java1.test7.queue;

import com.lanqiao.javalearn.java1.test7.queue.Queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();

        for (int i = 0; i <= 20; i++) {
            queue.enqueue(i);
        }

        while (!queue.empty()) {
            System.out.println(queue.dequeue());
        }
    }
}
