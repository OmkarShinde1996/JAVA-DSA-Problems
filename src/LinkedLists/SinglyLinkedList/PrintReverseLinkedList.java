package LinkedLists.SinglyLinkedList;

import java.util.Scanner;
//Time Complexity = O(n)
public class PrintReverseLinkedList {
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
    public static void printReverse(Nodes<Integer> root) {
        if(root==null){
            return;
        }
        printReverse(root.next);
        System.out.print(root.data+" ");
    }
    //123456
    //654321
    public static void main(String[] args) {
        Nodes<Integer> head = takeInput1();
        printReverse(head);
    }
}
