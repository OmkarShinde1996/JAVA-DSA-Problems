package LinkedLists.SinglyLinkedList;

import java.util.Scanner;

public class ReverseTheLLRecursively {
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

    // Time complexity = O(n^2)
    public static Nodes<Integer> reverseLL(Nodes<Integer> head){
        if(head==null || head.next==null){
            return head;
        }
        Nodes<Integer> finalHead = reverseLL(head.next); // Time complexity = O(n)
        Nodes<Integer> temp = finalHead;
        while(temp.next!=null){ // Time complexity = O(n)
           temp=temp.next;
        }
        temp.next=head;
        head.next=null;
        return finalHead;
    }

    // Time complexity = O(n)
    public static DoubleNode reverseLLBetter(Nodes<Integer> head){
        if(head==null || head.next==null){
            DoubleNode ans = new DoubleNode();
            ans.head=head;
            ans.tail=head;
            return ans;
        }
        DoubleNode smallAns = reverseLLBetter(head.next); // Time complexity = O(n)
        smallAns.tail.next=head;
        head.next=null;
        DoubleNode ans = new DoubleNode();
        ans.head= smallAns.head;
        ans.tail= head;
        return ans;
    }

    // Time complexity = O(n)
    public static Nodes<Integer> reverseLLBetterAndSimple(Nodes<Integer> head){
        if(head==null || head.next==null){
            return head;
        }
        Nodes<Integer> reversedTail = head.next;
        Nodes<Integer> finalHead = reverseLL(head.next); // Time complexity = O(n)
        reversedTail.next=head;
        head.next=null;
        return finalHead;
    }

    public static void main(String[] args) {
        Nodes<Integer> head = takeInput1();
        //Nodes<Integer> head1 = reverseLL(head);
        //DoubleNode ans = reverseLLBetter(head);
        //printListRecursively(ans.head);
        head = reverseLLBetterAndSimple(head);
        printListRecursively(head);
    }
}

class DoubleNode {
    Nodes<Integer> head;
    Nodes<Integer> tail;
}