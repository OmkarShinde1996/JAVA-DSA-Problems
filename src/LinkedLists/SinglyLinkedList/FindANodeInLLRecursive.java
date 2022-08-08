package LinkedLists.SinglyLinkedList;

import java.util.Scanner;

public class FindANodeInLLRecursive {
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
    public static int indexOfNRec(Nodes<Integer> head, int n) {
        return  helper(head,0,n);
    }
    public static int helper(Nodes<Integer> head,int index,int n){
        if(head==null)
            return -1;
        if(head.data==n)
            return index;
        int ans= helper(head.next,index+1,n);
        return ans;
    }//1 2 3 4 5 = 5
    public static void main(String[] args) {
        Nodes<Integer> head = takeInput1();
        System.out.print(indexOfNRec(head,5));
    }
}
