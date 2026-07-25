package QUEUE;

public class Queue {

    private int front = 0;
    private int rear = -1;
    private int size = 0;
    private int[] arr = new int[5];

    public void enqueue(int data) {

        if(!isFull()) {
            rear = (rear + 1) % 5;
            arr[rear] = data;
            size++;
        }

        else System.out.println("Queue is FULL !");

    }

    public int dequeue(){

        if(isEmpty()) {
            throw new RuntimeException("Queue is Empty");
        }

        int data = arr[front];
        front = (front + 1) % 5;
        size--;

        return data;
    }

    public int peek(){

        if(isEmpty()) {
            throw new RuntimeException("Queue is Empty");
        }

        return arr[front];
    }

    public boolean isFull(){
        return size==5;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void show(){

        for(int i=front ; i<size ; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

}