package LinkedLists.SinglyLinkedList;

import java.util.Scanner;

public class ReverseTheLLIteratively {
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

    //Time Complexity = O(n)
    public static Nodes<Integer> ReverseLLIteratively(Nodes<Integer> head){
        Nodes<Integer> temp;
        Nodes<Integer> pre = null;
        Nodes<Integer> current = head;
        while(current!=null){
            temp=current.next;
            current.next=pre;
            pre=current;
            current=temp;
        }

        return pre;
    }

    public static void main(String[] args) {
        Nodes<Integer> head = takeInput1();
        head = ReverseLLIteratively(head);
        printListRecursively(head);
    }
}
