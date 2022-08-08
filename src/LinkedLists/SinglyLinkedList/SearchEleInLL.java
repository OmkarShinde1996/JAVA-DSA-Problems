package LinkedLists.SinglyLinkedList;

import java.util.Scanner;
//Time complexity of searching an element in the linked list will be O(n)
public class SearchEleInLL {
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
    public static int searchData(Nodes<Integer> head, int i){
        int count = 0;
        Nodes<Integer> temp = head;
        if(head==null){
            return -1;
        }
        while(temp!=null && temp.data!=i && temp.next!=null){
            temp=temp.next;
            count++;
        }
        if(temp.data==i){
            return count;
        }
        return -1;
    }

    public static void main(String[] args) {
        Nodes<Integer> head = takeInput1();
        System.out.println(searchData(head,40));

    }
}
