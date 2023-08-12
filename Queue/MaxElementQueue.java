package Queue;

import java.util.*;
public class MaxElementQueue {
    private Queue<Integer> queue;
    private Deque<Integer> maxdeque;

    public MaxElementQueue(int value){
        queue.offer(value);
        while(!maxdeque.isEmpty() && maxdeque.peekLast()<value){
            maxdeque.removeLast();
        }
        maxdeque.addLast(value);
    }
    public int dequeue(){
        if(queue.isEmpty()){
            throw new IllegalStateException("Queue is Empty. cannot perform dequeue");
        }
        int dequedValue = queue.poll();
        if(dequedValue == maxdeque.peekFirst()){
            maxdeque.removeFirst();
        }
        return dequedValue;
    }
    public int getMax(){
        if(maxdeque.isEmpty()){
            throw new IllegalStateException("Queue is Empty");
        }
        return maxdeque.peekFirst();
    }
    public static void main(String[] args){
       // MaxElementQueue maxQueue = new MaxElementQueue(10);
       // maxQueue.enqueue(10);
       // System.out.println("Maximum Element in the QUeue is "+maxQueue.getmax());
    }
}
