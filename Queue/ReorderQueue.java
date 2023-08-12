package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReorderQueue {
    public static void reorder(Queue<Integer> queue){

    }
    public static void main(String[] arga){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        reorder(queue);
        for(int i : queue){
            System.out.print(i+" ");
        }
    }
}
