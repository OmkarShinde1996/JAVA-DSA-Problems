package Trees.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindNodeInBinaryTree {
    public static void printBinaryTreeLevelWise(BinaryTreeNode<Integer> root){
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> front = pendingNodes.poll();
            String toBePrinted = front.data+ ":";
            if(front.left != null){
                toBePrinted += "L" + front.left.data + ",";
                pendingNodes.add(front.left);
            }
            if(front.right !=null){
                toBePrinted += "R" + front.right.data;
                pendingNodes.add(front.right);
            }
            System.out.println(toBePrinted);
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

    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
        if(root == null){
            return false;
        }
        if(root.data == x){
            return true;
        }
        return isNodePresent(root.left,x) || isNodePresent(root.right,x);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        printBinaryTreeLevelWise(root);
        System.out.println(isNodePresent(root, 10));
    }
}
