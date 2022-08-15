package Trees.BST;

import Queus.QueuesUsingLL.Node;
import Trees.BinaryTree.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//Given a Binary tree, find the largest BST subtree. That is, you need to find the BST with maximum height
// in the given binary tree. You have to return the height of largest BST.
public class LargestBST {
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

    public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
        if (isBST(root))
            return height(root);
        else
            return Math.max(largestBSTSubtree(root.left), largestBSTSubtree(root.right));
    }
    public static boolean isBST(BinaryTreeNode<Integer> root) {
        Pair<Boolean,Pair<Integer,Integer>> output=isBST2(root);
        return output.first;
    }
    public static Pair<Boolean,Pair<Integer,Integer>> isBST2(BinaryTreeNode<Integer> root){
        if(root==null){
            Pair<Integer,Integer> output1=new Pair<>(Integer.MIN_VALUE,Integer.MAX_VALUE);
            Pair<Boolean,Pair<Integer,Integer>> output=new Pair<>(true,output1);
            return output;
        }
        Pair<Boolean,Pair<Integer,Integer>> leftOut=isBST2(root.left);
        Pair<Boolean,Pair<Integer,Integer>> rightOut=isBST2(root.right);
        int minimum=Math.min(root.data,Math.min(leftOut.second.second,rightOut.second.second));
        int maximum=Math.max(root.data,Math.max(leftOut.second.first,rightOut.second.first));
        boolean isBSTT=root.data>leftOut.second.first
                && root.data<=rightOut.second.second
                && leftOut.first
                && rightOut.first;
        Pair<Integer,Integer> output1=new Pair<>(maximum,minimum);
        Pair<Boolean,Pair<Integer,Integer>> output=new Pair<>(isBSTT,output1);
        return output;
    }
    public static int height(BinaryTreeNode<Integer> root) {
        if(root == null){
            return 0;
        }
        int leftCount = height(root.left);
        int rightCount = height(root.right);
        if(leftCount > rightCount){
            return leftCount +1;
        }else {
            return rightCount +1;
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        System.out.println(largestBSTSubtree(root));
    }
}
