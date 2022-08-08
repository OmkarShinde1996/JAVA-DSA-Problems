package LinkedLists.SinglyLinkedList;

import java.util.Scanner;

public class LengthOfLinkedList {
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
    public static void main(String[] args) {
        Nodes<Integer> head = takeInput1();
        System.out.println(length(head));
    }
}
