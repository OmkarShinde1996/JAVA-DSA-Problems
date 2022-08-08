package LinkedLists.SinglyLinkedList;

import java.util.Scanner;

public class InsertNodeRecursivelyInLL {
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
    public static void printListRecursively(Nodes<Integer> head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        printListRecursively(head.next);
    }
    public static Nodes<Integer> insertNodeOnIthPosRecursively(Nodes<Integer> head,int pos, int data){
        if(pos==0){
            Nodes<Integer> newNode = new Nodes<>(data);
            newNode.next= head;
            return newNode;
        }
        if(head==null){
            return head;
        }
        head.next = insertNodeOnIthPosRecursively(head.next,pos-1,data);
        return head;
    }

    public static void main(String[] args) {
        Nodes<Integer> head = takeInput1();
        Scanner s = new Scanner(System.in);
        int pos = s.nextInt();
        int data = s.nextInt();
        head = insertNodeOnIthPosRecursively(head,pos,data);
        printListRecursively(head);
    }
}
