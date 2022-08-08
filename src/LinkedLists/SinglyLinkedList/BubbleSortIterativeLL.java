package LinkedLists.SinglyLinkedList;

import java.util.Scanner;

public class BubbleSortIterativeLL {
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
    public static Nodes<Integer> bubbleSort(Nodes<Integer> head) {
        if(head==null || head.next==null)
            return head;
        //Write your code here
        for(int i=0;i<lengthLL(head)-1;i++){
            Nodes<Integer> prev = null;
            Nodes<Integer> curr = head;
            Nodes<Integer> next = curr.next;
            while(curr.next != null){
                if(curr.data > curr.next.data){
                    if(prev == null){
                        curr.next = next.next;
                        next.next = curr;
                        prev = next;
                        head = prev;
                    }else{
                        next = curr.next;
                        curr.next = next.next;
                        prev.next = next;
                        next.next = curr;
                        prev = next;
                    }
                }else{
                    prev = curr;
                    curr = curr.next;
                }
            }
        }
        return head;
    }

    private static int lengthLL(Nodes<Integer> head){
        int count = 1;
        while(head.next != null){
            head = head.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Nodes<Integer> head = takeInput1();
        head = bubbleSort(head);
        printListRecursively(head);
    }
}
