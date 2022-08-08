package LinkedLists.SinglyLinkedList;

import java.util.Scanner;

public class SwapTwoNodesOfLL {
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

    public static Nodes<Integer> swapNodes(Nodes<Integer> head, int i, int j) {
        if(i==j){
            return head;
        }
        Nodes<Integer> temp=head,prev=null,c1=null,c2=null,p1=null,p2=null;
        int pos=0;
        while(temp!=null){
            if(pos==i){
                p1=prev;
                c1=temp;
            }else if(pos==j){
                p2=prev;
                c2=temp;
            }
            prev=temp;
            temp=temp.next;
            pos++;
        }
        if(p1!=null){
            p1.next=c2;
        }else{
            head=c2;
        }
        if(p2!=null){
            p2.next=c1;
        }else{
            head=c1;
        }
        Nodes<Integer> temp1=c2.next;
        c2.next=c1.next;
        c1.next=temp1;
        return head;
    }
    public static void main(String[] args) {
        Nodes<Integer> head = takeInput1();
        head = swapNodes(head,3,4);
        printListRecursively(head);
    }
}
