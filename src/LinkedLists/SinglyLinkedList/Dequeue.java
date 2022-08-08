package LinkedLists.SinglyLinkedList;

import java.util.Scanner;

public class Dequeue {
    int  arr[];
    int  front;
    int  rear;
    int  size;

    public Dequeue(int size){
        arr = new int[size];
        front = -1;
        rear = -1;
        this.size = size;
    }
//    boolean isFull(){
//        return ((front == 0 && rear == size-1)||
//                front == rear+1);
//    }
//    boolean isEmpty (){
//        return (front == -1);
//    }
    void insertFront(int key){
        if(front==-1 && rear==-1){
            front=0;
            rear=0;
            arr[front]=key;
            return;
        }
        //cout<<"front="<<front<<" rear="<<rear<<endl;
        if((front+1)%size==rear){
            System.out.println(-1);
            return;
        }
        front=(front+1)%size;
        arr[front]=key;
    }
    void insertRear(int key){
        if(front==-1 && rear==-1)
        {
            front=0;
            rear=0;
            arr[rear]=key;
            return;
        }
        if(front==rear-1 || rear==0 && front==size-1){
            System.out.println(-1);
            return;
        }
        if(rear==0)
            rear=size-1;
        else
            rear--;
        arr[rear]=key;
    }
    void deleteFront(){
        if(front==-1 && rear==-1){
            System.out.println(-1);
            return;
        }
        if(rear==front){
            rear=-1;
            front=-1;
            return;
        }
        if(front==0)
            front=size-1;
        else
            front--;
    }
    void deleteRear(){
        if(front==-1 && rear==-1){
            System.out.println(-1);
            return;
        }
        if(rear==front){
            rear=-1;
            front=-1;
            return;
        }
        rear=(rear+1)%size;
    }
    int getFront(){
        if(front==-1 && rear==-1){
            return -1;
        }
        return arr[front];
    }
    int getRear(){
        if(front==-1 && rear==-1){
            return -1;
        }
        return arr[rear];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Dequeue dq = new Dequeue(10);

        while(true){
            int choice = s.nextInt(),input;
            switch (choice) {
                case 1:
                    input = s.nextInt();
                    dq.insertFront(input);
                    break;
                case 2:
                    input = s.nextInt();
                    dq.insertRear(input);
                    break;
                case 3:
                    dq.deleteFront();
                    break;
                case 4:
                    dq.deleteRear();
                    break;
                case 5:
                    System.out.println(dq.getFront());
                    break;
                case 6:
                    System.out.println(dq.getRear());
                    break;
                default:
                    return ;
            }
        }
    }
}
