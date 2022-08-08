package LinkedLists.SinglyLinkedList;

import java.util.Scanner;

public class PrintLinkedListFromUser {
    //The Time Complexity for below takeInput method is O(n^2)
    public static Nodes<Integer> takeInput(){
        Nodes<Integer> head=null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        while(data != -1){
            Nodes<Integer> newNode = new Nodes<>(data);
            if(head==null){
                head=newNode;
            }else{
                Nodes<Integer> temp = head;
                while(temp.next != null){
                    temp=temp.next;
                }
                temp.next = newNode;
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
    //The Time Complexity for below takeInput method is O(n)
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
    public static void main(String[] args) {
        Nodes<Integer> head = takeInput1();
        printList(head);
        printListRecursively(head);
    }
}
