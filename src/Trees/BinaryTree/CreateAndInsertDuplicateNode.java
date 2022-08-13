package Trees.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//For a given a Binary Tree of type integer, duplicate every node of the tree and attach it to the left of itself.
//The root will remain the same. So you just need to insert nodes in the given Binary Tree.
public class CreateAndInsertDuplicateNode {
    public static void printBinaryTreeLevelWise(BinaryTreeNode<Integer> root){
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        while(!pendingNodes.isEmpty()){
            int n = pendingNodes.size();
            while(n>0) {
                BinaryTreeNode<Integer> front = pendingNodes.poll();
                System.out.print(front.data + " ");
                if (front.left != null) {
                    pendingNodes.add(front.left);
                }
                if(front.right != null){
                    pendingNodes.add(front.right);
                }
                n--;
            }
            System.out.println();
        }
    }
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

    public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
        if(root == null){
            return;
        }
        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>(root.data);
        BinaryTreeNode<Integer> rootLeft = root.left;
        root.left = newNode;
        newNode.left = rootLeft;
        insertDuplicateNode(rootLeft);
        insertDuplicateNode(root.right);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        insertDuplicateNode(root);
        printBinaryTreeLevelWise(root);
    }
}
