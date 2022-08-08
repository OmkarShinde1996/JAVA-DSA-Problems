package LinkedLists.SinglyLinkedList;

import java.util.Scanner;

public class PrintIthNode {
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
    public static void printIthNode(Nodes<Integer> head, int i){
        int count = 0;
        //Nodes<Integer> temp = head;
        while(count!=i && head!=null){
            head=head.next;
            count++;
        }
        if(count==i && head!=null){
            System.out.println(head.data);
        }
    }

    public static void main(String[] args) {
        Nodes<Integer> head = takeInput1();
        printIthNode(head,5);

    }
}
