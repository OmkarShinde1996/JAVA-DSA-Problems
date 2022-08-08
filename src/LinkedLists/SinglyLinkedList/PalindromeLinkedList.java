package LinkedLists.SinglyLinkedList;

import java.util.Scanner;

public class PalindromeLinkedList {
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

    public static Nodes<Integer> reverseIt(Nodes<Integer> head){
        if(head==null || head.next==null)
            return head;
        Nodes<Integer> tail=head.next;
        Nodes<Integer> ans=reverseIt(head.next);
        tail.next=head;
        head.next=null;
        return ans;
    }
    private static Nodes<Integer> midPoint(Nodes<Integer> head){
        Nodes<Integer> slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public static boolean isPalindrome(Nodes<Integer> head){
        if(head==null || head.data>=0 && head.next==null){
            return true;
        }else if(head.data<0 && head.next==null){
            return false;
        }
        Nodes<Integer> temp=head,mid,h2;
        mid=midPoint(temp);
        h2=mid.next;
        mid.next=null;
        h2=reverseIt(h2);
        boolean flag=false;
        while(temp!=null && h2!=null){
            flag=false;
            if(temp.data.equals(h2.data))
                flag=true;
            temp=temp.next;
            h2=h2.next;
        }
        return flag;
    }
    public static void main(String[] args){
        Nodes<Integer> head = takeInput1();
        System.out.print(isPalindrome(head));
    }
}
