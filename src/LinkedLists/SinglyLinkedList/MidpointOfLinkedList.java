package LinkedLists.SinglyLinkedList;

import java.util.Scanner;

public class MidpointOfLinkedList {
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
    public static Nodes<Integer> midPoint(Nodes<Integer> head) {
        Nodes<Integer> slow = head, fast = head;
        if(head==null){
            slow=null;
            return slow;
        }
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    //1 2 3 4 5 = 3
    //1 2 3 4 = 2
    //null = null
    public static void main(String[] args) {
        Nodes<Integer> head = takeInput1();
        Nodes<Integer> mid = midPoint(head);
        if(mid!=null){
            System.out.print(mid.data);
        }
    }
}
