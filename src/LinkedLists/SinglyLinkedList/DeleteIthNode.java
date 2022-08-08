package LinkedLists.SinglyLinkedList;

import java.util.Scanner;

public class DeleteIthNode {
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

    public static Nodes<Integer> deleteNode(Nodes<Integer> head, int pos){
        if(head==null){
            return head;
        }
        if(pos==0){
            head=head.next;
            return head;
        }
        int count=0;
        Nodes<Integer> temp = head;
        while(count < pos-1 && temp.next!=null){
            temp=temp.next;
            count++;
        }
        if(temp.next==null){
            return head;
        }
        temp.next=temp.next.next;
        return head;
    }

    public static void main(String[] args) {
        Nodes<Integer> head = takeInput1();
        Scanner s = new Scanner(System.in);
        int pos = s.nextInt();
        head = deleteNode(head,pos);
        printList(head);
    }
}
