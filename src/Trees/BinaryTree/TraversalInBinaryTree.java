package Trees.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Problem tree - 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
//PreOrder traversal - 1 2 4 5 3 6 7
//PostOrder traversal - 4 5 2 6 7 3 1
//InOrder traversal -  4 2 5 1 6 3 7

public class TraversalInBinaryTree {
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

    public static void inOrderTraversal(BinaryTreeNode<Integer> root){
        if(root == null){return;}
        inOrderTraversal(root.left);
        System.out.print(root.data+ " ");
        inOrderTraversal(root.right);
    }
    public static void preOrderTraversal(BinaryTreeNode<Integer> root){
        if(root == null){return;}
        System.out.print(root.data+ " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public static void postOrderTraversal(BinaryTreeNode<Integer> root){
        if(root == null){return;}
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+ " ");
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        System.out.print("PreOrder traversal : ");
        preOrderTraversal(root);
        System.out.println();
        System.out.print("PostOrder traversal : ");
        postOrderTraversal(root);
        System.out.println();
        System.out.print("InOrder traversal : ");
        inOrderTraversal(root);

    }
}
