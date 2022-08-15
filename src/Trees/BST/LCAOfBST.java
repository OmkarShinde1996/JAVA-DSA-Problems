package Trees.BST;

import Trees.BinaryTree.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LCAOfBST {
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

    public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
        if(root==null)
            return -1;
        int c=-1;
        if(root.data==a || root.data==b)
            return root.data;
        else if(a<root.data && b>root.data || a>root.data && b<root.data){
            c=getLCA(root.left,a,b);
            int d=getLCA(root.right,a,b);
            if(c==-1 && d==-1)
                return -1;
            else if(c==-1 && d!=-1)
                return  d;
            else if(c!=-1 && d==-1)
                return c;
            else
                return root.data;
        }else if(a<root.data &&b<root.data){
            c=getLCA(root.left,a,b);
        }else if(a>root.data &&b>root.data){
            c=getLCA(root.right,a,b);
        }
        if(c!=-1)
            return c;
        else
            return -1;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        System.out.println(getLCA(root, 2, 6));
    }
}
