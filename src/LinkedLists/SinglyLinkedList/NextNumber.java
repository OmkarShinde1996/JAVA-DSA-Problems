package LinkedLists.SinglyLinkedList;

import java.util.Scanner;

public class NextNumber {

    public static Nodes<Integer> reverse(Nodes<Integer> head) {
        Nodes<Integer> prev = null;
        Nodes<Integer> current = head;
        Nodes<Integer> next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    static Nodes<Integer> newNode(int data) {
        Nodes<Integer> new_node = new Nodes<>();
        new_node.data = data;
        new_node.next = null;
        return new_node;
    }


    static Nodes<Integer> addOneUtil(Nodes<Integer> head){
        // res is head node of the resultant list
        Nodes<Integer> res = head;
        Nodes<Integer> temp = null, prev = null;

        int carry = 1, sum;

        while (head != null) // while both lists exist
        {
            // Calculate value of next digit in resultant
            // list. The next digit is sum of following
            // things (i) Carry (ii) Next digit of head list
            // (if there is a next digit)
            sum = carry + head.data;

            // update carry for next calculation
            carry = (sum >= 10) ? 1 : 0;

            // update sum if it is greater than 10
            sum = sum % 10;

            // Create a new node with sum as data
            head.data = sum;

            // Move head and second pointers to next nodes
            temp = head;
            head = head.next;
        }

        // if some carry is still there, add a new node to
        // result list.
        if (carry > 0)
            temp.next = newNode(carry);

        // return head of the resultant list
        return res;
    }
    public static Nodes<Integer> nextLargeNumber(Nodes<Integer> head) {
        // Reverse linked list
        head = reverse(head);

        // Add one from left to right of reversed
        // list
        head = addOneUtil(head);

        // Reverse the modified list
        return reverse(head);
    }

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
    public static void main(String[] args) {
        Nodes<Integer> head = takeInput1();
        head = nextLargeNumber(head);
        printListRecursively(head);
    }
}
