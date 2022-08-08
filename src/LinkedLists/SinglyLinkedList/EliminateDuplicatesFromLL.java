package LinkedLists.SinglyLinkedList;

import java.util.Scanner;

public class EliminateDuplicatesFromLL {
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
    public static Nodes<Integer> removeDuplicates(Nodes<Integer> head) {
        if(head==null || head.next==null){
            return head;
        }
        Nodes<Integer> temp1=head;
        Nodes<Integer>temp2=head.next;
        while(temp2!=null){
            if(temp1.data.equals(temp2.data))
            {
                temp2=temp2.next;
            }
            else{
                temp1.next=temp2;
                temp1=temp2;
            }
        }
        temp1.next=null;
        return head;
    }
    //1 2 3 3 3 4 5 5 5 5 6
    //1 2 3 4 5 6
    public static void main(String[] args) {
        Nodes<Integer> head = takeInput1();
        //System.out.println(head.next.data);
        head = removeDuplicates(head);
        printList(head);
    }
}
