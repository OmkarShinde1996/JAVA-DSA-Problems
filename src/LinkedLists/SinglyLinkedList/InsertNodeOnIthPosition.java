package LinkedLists.SinglyLinkedList;

import java.util.Scanner;

public class InsertNodeOnIthPosition {
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

    public static void printList(Nodes<Integer> head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    public static Nodes<Integer> insertNodeOnIthPos(Nodes<Integer> head,int pos, int data){
        int count=0;
        Nodes<Integer> newNode = new Nodes<>(data);
        Nodes<Integer> temp = head;
        if(pos==0){
            newNode.next= head;
            return newNode;
        }
        while(count < pos-1){
            temp=temp.next;
            count++;
        }
        newNode.next= temp.next;
        temp.next=newNode;
        return head;
    }

    public static void main(String[] args) {
        Nodes<Integer> head = takeInput1();
        Scanner s = new Scanner(System.in);
        int pos = s.nextInt();
        int data = s.nextInt();
        head = insertNodeOnIthPos(head,pos,data);
        printList(head);
    }
}
