package LinkedLists.SinglyLinkedList;

import java.util.Scanner;

public class DeleteAlternateNodes {
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

    public static void deleteAlternateNodes(Nodes<Integer> head) {
        if (head == null)
            return;

        Nodes<Integer> node = head;

        while (node != null && node.next != null) {
            /* Change next link of next node */
            node.next = node.next.next;

            /*Update ref node to new alternate node */
            node = node.next;
        }
    }
    public static void main(String[] args) {
        Nodes<Integer> head = takeInput1();
        deleteAlternateNodes(head);
        printListRecursively(head);
    }
}
