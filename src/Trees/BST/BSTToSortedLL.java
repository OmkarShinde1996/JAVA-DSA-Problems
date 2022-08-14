package Trees.BST;


import Trees.BinaryTree.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BSTToSortedLL {

    public static BinaryTreeNode<Integer> takeInputLevelWise(){
        Scanner s = new Scanner(System.in);
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        System.out.println("Enter root data");
        int rootData = s.nextInt();
        if(rootData == -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        pendingNodes.add(root);
        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> front = pendingNodes.remove();
            System.out.println("Enter left child of "+front.data);
            int leftChild = s.nextInt();
            if(leftChild != -1){
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
                pendingNodes.add(child);
                front.left = child;
            }
            System.out.println("Enter right child of "+front.data);
            int rightChild = s.nextInt();
            if(rightChild != -1){
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
                pendingNodes.add(child);
                front.right = child;
            }
        }
        return root;
    }

    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
        Pair1 ans=helper(root);
        return ans.head;
    }

    public static Pair1 helper(BinaryTreeNode<Integer> root){
        if(root==null){
            Pair1 output=new Pair1();
            output.head=null;
            output.tail=null;
            return output;
        }
        LinkedListNode<Integer> newNode=new LinkedListNode<>(root.data);
        Pair1 leftTree=helper(root.left);
        Pair1 rightTree=helper(root.right);
        Pair1 output=new Pair1();
        if(leftTree.head!=null){
            output.head=leftTree.head;
            leftTree.tail.next=newNode;
        }else{
            output.head=newNode;
        }
        newNode.next=rightTree.head;
        if(rightTree.head==null){
            output.tail=newNode;
        }else{
            output.tail=rightTree.tail;
        }
        return output;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        LinkedListNode<Integer> node = constructLinkedList(root);
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
