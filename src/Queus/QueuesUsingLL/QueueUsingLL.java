package Queus.QueuesUsingLL;

import Queus.QueuesUsingArray.QueueEmptyException;

public class QueueUsingLL<T> {
    private Node<T> front;
    private Node<T> rear;
    int size;

    public QueueUsingLL() {
        front=null;
        rear = null;
        size=0;
    }

    int size(){
        return size;
    } //O(1)

    boolean isEmpty(){
        return size()==0;
    } //O(1)

    T front() throws QueueEmptyException {
        if(size==0){
            throw new QueueEmptyException();
        }
        return front.data;
    } //O(1)

    void enqueue(T data){
        Node<T> newNode = new Node<>(data);
        if(size == 0){
            front = newNode;
            rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    } //O(1)

    T dequeue() throws QueueEmptyException {
        if(size == 0){
            throw new QueueEmptyException();
        }
        T temp = front.data;
        front = front.next;
        if(size == 1){
            rear = null;
        }
        size--;
        return temp;
    } //O(1)


}
