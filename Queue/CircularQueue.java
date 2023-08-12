package Queue;

public class CircularQueue {
    int[] arr;
    int front;
    int rear;
    int size;
    int count;

    public CircularQueue(int size){
        this.size = size;
        this.arr = new int[size];
        this.front = 0;
        this.rear = -1;
        this.count=0;
    }

    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is Full can not perform enqueue");
        }
        rear = (rear+1)%size;
        arr[rear]=value; 
        count++;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        int val = arr[front];
        front = (front+1)%size;
        count --;
        return val;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        return arr[front];
    }
    public boolean isEmpty(){
        return count == 0;
    }
    public boolean isFull(){
        return count == size;
    }
    public static void main(String[] args){
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);   
        System.out.println("Our front element is "+queue.peek());  
        queue.dequeue();
        queue.dequeue();
        System.out.println("Our front after dequeue is "+queue.peek());
        queue.enqueue(5);
        queue.enqueue(6);
    }
}
