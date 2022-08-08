package Queus.QueuesUsingArray;

public class QueuesUsingArray {
    private int data[];
    private int front; // index at which front element is stored
    private int rear; // index at which rear element is stored
    private int size;

    public QueuesUsingArray() {
        data = new int[10];
        front = -1;
        rear = -1;
        size = 0;
    }

    public QueuesUsingArray(int capacity) {
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    int size(){
        return size;
    } //O(1)

    boolean isEmpty(){
        return size()==0;
    } //O(1)

    int getFront() throws QueueEmptyException {
        if(size()==0){
            throw new QueueEmptyException();
        }
        return data[front];
    } //O(1)

    int getRear() throws QueueEmptyException {
        if(size()==0){
            throw new QueueEmptyException();
        }
        return data[rear];
    } //O(1)

    public void enqueue(int ele) throws QueueFullException {
        if(size()== data.length){
//            throw new QueueFullException();
            doubleCapacity();
        }
        if(size()==0){
            front=0;
        }
        size++;
        rear = (rear + 1) % data.length;
//        rear++;
//        if(rear== data.length){
//            rear=0;
//        }
        data[rear]=ele;
    } //O(1)

    private void doubleCapacity() {
        int temp[] = data;
        data = new int[2 * temp.length];
        int index = 0;
        for(int i=front; i<temp.length; i++){
            data[index] = temp[i];
            index++;
        }
        for(int i=0; i<=front-1; i++){
            data[index] = temp[i];
            index++;
        }
        front = 0;
        rear = temp.length-1;
    }

    public int dequeue() throws QueueEmptyException {
        if(size()==0){
            throw new QueueEmptyException();
        }
        int temp = data[front];
//        front++;
//        if(front== data.length){
//            front=0;
//        }
        front = (front + 1) % data.length;
        size--;
        if(size()==0){
            front = -1;
            rear = -1;
        }
        return temp;
    } //O(1)


}
