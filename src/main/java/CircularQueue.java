import java.util.ArrayList;

public class CircularQueue {
    private int arr[];          // array to store queue elements
    private int front;          // front points to front element in the queue
    private int rear;           // rear points to last element in the queue
    private int capacity;       // maximum capacity of the queue
    private int count;          // current size of the queue
    CircularQueue (int size) {
        arr = new int[size];
        capacity = size;
        front = -1;
        rear = -1;
        count = 0;
    }

    void enqueue (int x) {
        if(front == -1 && rear == -1) {
            //queue is empty
            front = 0;
            rear = 0;
            arr[rear] = x;
        } else if((rear + 1) % capacity == front) {
            //deque is full
        } else {
            //queue is not full and not empty
            rear = (rear + 1) % capacity;
            arr[rear] = x;
        }
    }
    //dequeue from the front of the arr.
    void dequeue(int x) {

        if(front == -1 && rear == -1) {
            //queue is empty
            System.out.println("QUEUE IS EMPTY CANNOT REMOVE ANY ELEMENT");
        } else if(front == rear) {
            //left with 1 element in the arr
            front = -1;
            rear = -1;
        } else {
            //queue is not empty and having more than 1 element.
            front = (front + 1) % capacity;
        }
    }

    void printCirularQueue() {
        if(front == -1 && rear == -1) {
            System.out.println("empty");
        } else {
            int i = front;
            while(i != rear) {
                System.out.println(arr[i]);
                i = (i+1) % capacity;
            }
            System.out.println(arr[rear]);
        }
    }

    void peek() {
        System.out.println(arr[front]);
    }
}
