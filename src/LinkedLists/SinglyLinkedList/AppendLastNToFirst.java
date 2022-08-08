package LinkedLists.SinglyLinkedList;

import java.util.Scanner;

public class AppendLastNToFirst {
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
    public static int length(Nodes<Integer> head){
        if(head==null){
            return 0;
        }
        int count=1;
        Nodes<Integer> temp = head;
        while(temp.next!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    public static Nodes<Integer> appendLastNToFirst(Nodes<Integer> head, int n){
        if(head==null || n<=0){
            return head;
        }
        int length = length(head);
        if(n>=length){
            return head;
        }
        int count =0;
        int i=length-n;
        Nodes<Integer> tail = head;
        Nodes<Integer> newHead = head;
        Nodes<Integer> temp = head;
        while(count<length && temp.next!=null){
            if(count==i-1){
                tail=temp;
            }
            if(count==i){
                newHead=temp;
            }
            temp = temp.next;
            count++;
        }
        temp.next=head;
        tail.next=null;
        return newHead;
    }
    public static void printList(Nodes<Integer> head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static void main(String[] args) {
        Nodes<Integer> head = takeInput1();
        head = appendLastNToFirst(head,3);
        printList(head);
    }
}
