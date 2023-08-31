package de.telran.khakov.rustam.classworks.cw11;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Test");
        queue.offer("Test2");
        queue.offer("Test3");
        queue.offer("Test4");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println("Next is stack:");
        Deque<String> deque = new LinkedList<>();
        deque.push("Test");
        deque.push("Test2");
        deque.push("Test3");
        while (!deque.isEmpty()) {
            System.out.println(deque.pop());
        }

        Queue<String> strs = new PriorityQueue<>();
    }
}
