package LinkedLists.SinglyLinkedList;

import java.util.Scanner;

public class EvenAfterOdd {
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
    public static Nodes<Integer> evenAfterOdd(Nodes<Integer> head) {
        Nodes<Integer> eh=null,et=null,oh=null,ot=null;
        while(head!=null){
            if(head.data%2==0){
                if(eh==null && et==null)
                {
                    eh=head;
                    et=head;

                }
                else{
                    et.next=head;
                    et=head;

                }
                head=head.next;
            }
            else{
                if(oh==null && ot==null)
                {
                    oh=head;
                    ot=head;
                }
                else{
                    ot.next=head;
                    ot=head;
                }
                head=head.next;
            }
        }
        if(oh!=null){
            ot.next=eh;
        }
        else{
            return eh;
        }
        if(eh!=null){
            et.next=null;
        }
        return oh;
    }
    public static void main(String[] args) {
        Nodes<Integer> head = takeInput1();
        head = evenAfterOdd(head);
        printListRecursively(head);
    }
}
