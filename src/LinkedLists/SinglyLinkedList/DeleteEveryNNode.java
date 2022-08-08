package LinkedLists.SinglyLinkedList;

import java.util.Scanner;

//You have been given a singly linked list of integers along with two integers, 'M,' and 'N.' Traverse the
// linked list such that you retain the 'M' nodes, then delete the next 'N' nodes. Continue the same until
// the end of the linked list.
//To put it in other words, in the given linked list, you need to delete N nodes after every M nodes.
public class DeleteEveryNNode {
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

    public static Nodes<Integer> skipMdeleteN(Nodes<Integer> head, int M, int N) {
        if(head==null)
            return head;
        if(M==0)
            return null;
        if(N==0)
            return head;
        Nodes<Integer> curr=head,t;
        int count;
        while(curr!=null)
        {
            for(count=1;count<M && curr!=null;count++)
            {
                curr=curr.next;
            }
            if(curr==null)
                return head;
            t=curr.next;
            for(count=1;count<=N && t!=null;count++)
            {
                t=t.next;
            }
            curr.next=t;
            curr=t;}
        return head;
    }

    public static void main(String[] args) {
        Nodes<Integer> head = takeInput1();
        head = skipMdeleteN(head,2,2);
        printListRecursively(head);
    }
}
