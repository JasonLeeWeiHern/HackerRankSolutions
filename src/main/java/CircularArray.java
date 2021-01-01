public class CircularArray {
    private int deque[];          // array to store queue elements
    private int front;          // front points to front element in the queue
    private int rear;           // rear points to last element in the queue
    private int capacity;       // maximum capacity of the queue
    private int count;          // current size of the queue

    CircularArray (int size) {
        front = -1;
        rear = -1;
    }

    void frontEnqueue (int x) {
        if(front == -1 && rear == -1) {
            //queue is empty
            front = 0;
            rear = 0;
            deque[front] = x;
        } else if(front == 0 && !((rear + 1) % capacity == front)) {
            //if front is at index 0 and queue is not empty
            front = capacity - 1;
            deque[front] = x;
        } else if((rear + 1) % capacity == front) {
            //queue is full
        } else {
            //insert at front when queue is not empty and not full and not at index 0
            front--;
            deque[front] = x;
        }
    }

    void backEnqueue (int x) {
        if(front == -1 && rear == -1) {
            //queue is empty
            front = 0;
            rear = 0;
            deque[rear] = x;
        } else if((rear + 1) % capacity == front) {
            //deque is full
        } else {
            //queue is not full and not empty
            rear = (rear + 1) % capacity;
            deque[rear] = x;
        }
    }

    void display() {
        int i = front;
        if(front == -1 && rear == -1) {
            //queue is empty
            System.out.println("EMPTY!");
        } else {
            while(i != rear) {
                System.out.println(deque[i]);
                i = (i+1) % capacity;
            }
            System.out.println(deque[rear]);
        }
    }

    void peekFront() {
        System.out.println(deque[front]);
    }

    void peekRear() {
        System.out.println(deque[rear]);
    }

    void frontDequeue () {
        if(front == - 1 && rear == -1) {
            //deque is empty
            System.out.println("EMPTY");
        } else if (front == rear) {
            //left with 1 element
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
    }

    void backDeque() {
        if(front == - 1 && rear == -1) {
            //deque is empty
            System.out.println("EMPTY");
        } else if (front == rear) {
            //left with 1 element
            front = rear = -1;
        } else if(rear == 0) {
            rear = capacity - 1;
        } else {
            rear--;
        }
    }

}
