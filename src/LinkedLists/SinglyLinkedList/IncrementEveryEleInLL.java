package LinkedLists.SinglyLinkedList;

import java.util.Scanner;

public class IncrementEveryEleInLL {
    public static Nodes<Integer> takeInput1(){
        Nodes<Integer> head=null, tail=null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        while(data != -1){
            Nodes<Integer> newNode = new Nodes<>(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }else{
                tail.next=newNode;
                tail=tail.next;
            }
            data = s.nextInt();
        }
        return head;
    }
    public static void increment(Nodes<Integer> head){
        while(head!=null){
            head.data++;
            head=head.next;
        }
    }
    public static void printList(Nodes<Integer> head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static void main(String[] args) {
        Nodes<Integer> head = takeInput1();
        increment(head);
        printList(head);
        //printIthNode(head,3);
    }
}
