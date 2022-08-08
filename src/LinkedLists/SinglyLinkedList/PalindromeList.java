package LinkedLists.SinglyLinkedList;
import java.util.Scanner;

public class PalindromeList {
    public static Nodes<Integer> head;
    public static Nodes<Integer> secondHalf = head;
    public static boolean isPalindrome(Nodes<Integer> head)
    {
        Nodes<Integer> slow = head;
        Nodes<Integer> fast = head;
        Nodes<Integer> prev_of_slow = head;
        Nodes<Integer> midNode = null;
        boolean result = true;
        if(head != null && head.next != null)
        {
            while(fast != null && fast.next != null)
            {
                fast = fast.next.next;
                prev_of_slow = slow;
                slow = slow.next;
            }
            if(fast != null)
            {
                midNode = slow;
                slow = slow.next;
            }
            secondHalf = slow;
            prev_of_slow.next = null;
            reverseList();
            result = compareList(head, secondHalf);
            reverseList();

            if(midNode != null)
            {
                prev_of_slow = midNode;
                midNode.next = secondHalf;
            }
            else{
                prev_of_slow.next = secondHalf;
            }
        }

        return result;
    }
    public static void reverseList()
    {
        Nodes<Integer> prev = null;
        Nodes<Integer> current = secondHalf;
        Nodes<Integer> next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        secondHalf = prev;
    }
    public static boolean compareList(Nodes<Integer> head1, Nodes<Integer> head2)
    {
        Nodes<Integer> temp1 = head1;
        Nodes<Integer> temp2 = head2;

        while (temp1 != null && temp2 != null) {
            if (temp1.data == temp2.data) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            else
                return false;
        }

        if (temp1 == null && temp2 == null)
            return true;
        return false;
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

    public static void main(String[] args) {
        Nodes<Integer> head = takeInput1();
        System.out.print(isPalindrome(head));
    }
}
