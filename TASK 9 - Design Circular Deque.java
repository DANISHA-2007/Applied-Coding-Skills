class MyCircularDeque {
    int[] deque;
    int front;
    int rear;
    int size;
    int capacity;

    public MyCircularDeque(int k) {
        deque = new int[k];
        capacity = k;
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }

        front = (front - 1 + capacity) % capacity;
        deque[front] = value;

        if (size == 0) {
            rear = front;
        }

        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }

        rear = (rear + 1) % capacity;
        deque[rear] = value;

        if (size == 0) {
            front = rear;
        }

        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }

        front = (front + 1) % capacity;
        size--;

        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }

        rear = (rear - 1 + capacity) % capacity;
        size--;

        return true;
    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        }

        return deque[front];
    }

    public int getRear() {
        if (isEmpty()) {
            return -1;
        }

        return deque[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}

OUTPUT:
Accepted

Runtime: 0 ms

Case 1

Input:
["MyCircularDeque","insertLast","insertLast","insertFront","insertFront","getRear","isFull","deleteLast","insertFront","getFront"]

[[3],[1],[2],[3],[4],[],[],[],[4],[]]

Output:
[null,true,true,true,false,2,true,true,true,4]

Expected:
[null,true,true,true,false,2,true,true,true,4]
