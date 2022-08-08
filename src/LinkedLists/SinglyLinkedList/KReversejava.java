package LinkedLists.SinglyLinkedList;

import java.util.Scanner;

//Given a singly linked list of integers, reverse the nodes of the linked list 'k' at a time and
// return its modified list.
// 'k' is a positive integer and is less than or equal to the length of the linked list.
// If the number of nodes is not a multiple of 'k,' then left-out nodes, in the end, should be reversed as well.
public class KReversejava {
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
    public static Nodes<Integer> kReverse(Nodes<Integer> head, int k){
        if(head==null)
            return head;
        if(head.next==null)
            return head;
        if(k==0)
            return head;
        Nodes<Integer> h1=head,h2,t1=head;
        int count=1;
        while(count<k && t1.next!=null){
            t1=t1.next;
            count++;
        }
        h2=t1.next;
        t1.next=null;
        DoubleNode ans=reversePart(h1);
        Nodes<Integer> secondHead=kReverse(h2,k);
        ans.tail.next=secondHead;
        return ans.head;
    }
    private static DoubleNode reversePart(Nodes<Integer> head){
        if(head==null || head.next==null){
            DoubleNode ans=new DoubleNode();
            ans.head=head;
            ans.tail=head;
            return ans;
        }
        DoubleNode ans=reversePart(head.next);
        ans.tail.next=head;
        head.next=null;
        ans.tail=ans.tail.next;
        return ans;
    }

    public static void main(String[] args) {
        Nodes<Integer> head = takeInput1();
        head = kReverse(head,4);
        printListRecursively(head);
    }
}

