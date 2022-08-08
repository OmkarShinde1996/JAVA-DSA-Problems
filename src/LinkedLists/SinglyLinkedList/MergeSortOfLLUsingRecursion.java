package LinkedLists.SinglyLinkedList;

import java.util.Scanner;

public class MergeSortOfLLUsingRecursion {
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
    public static Nodes<Integer> mergeTwoSortedLinkedLists(Nodes<Integer> head1, Nodes<Integer> head2) {
        if(head1==null)
            return head2;
        if(head2==null)
            return head1;
        Nodes<Integer> t1=head1,t2=head2,tail=null,head=null;
        if(t1.data<=t2.data){
            head=t1;
            tail=t1;
            t1=t1.next;
        }else{
            head=t2;
            tail=t2;
            t2=t2.next;
        }
        while(t1!=null && t2!=null){
            if(t1.data<=t2.data){
                tail.next=t1;
                tail=t1;
                t1=t1.next;
            }else{
                tail.next=t2;
                tail=t2;
                t2=t2.next;
            }
        }
        if(t1==null)
            tail.next=t2;
        if(t2==null)
            tail.next=t1;
        return head;
    }
    public static Nodes<Integer> mergeSort(Nodes<Integer> head) {
        if(head==null || head.next==null){
            return head;
        }
        Nodes<Integer> midNode = midPoint(head);
        Nodes<Integer> smallHead2 = midNode.next;
        midNode.next=null;
        Nodes<Integer> head1 = mergeSort(head);
        Nodes<Integer> head2 = mergeSort(smallHead2);
        return mergeTwoSortedLinkedLists(head1,head2);
    }

    public static void main(String[] args) {
        Nodes<Integer> head = takeInput1();
        Nodes<Integer> newHead = mergeSort(head);
        printList(newHead);
    }
}
