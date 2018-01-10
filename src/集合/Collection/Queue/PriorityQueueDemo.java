package 集合.Collection.Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> queue1 = new PriorityQueue<>();
        queue1.offer("a");
        queue1.offer("b");
        queue1.offer("c");
        queue1.offer("d");

        while (queue1.size() > 0) {
            System.out.println(queue1.remove());
        }

        PriorityQueue<String> queue2 = new PriorityQueue<>(4, Collections.reverseOrder());
        queue2.offer("a");
        queue2.offer("b");
        queue2.offer("c");
        queue2.offer("d");

        while (queue2.size() > 0) {
            System.out.println(queue2.remove());
        }
    }
}
