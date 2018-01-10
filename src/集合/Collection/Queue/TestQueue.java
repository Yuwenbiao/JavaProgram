package 集合.Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");

        while (queue.size() > 0) {
            System.out.println(queue.remove());
        }
    }
}
