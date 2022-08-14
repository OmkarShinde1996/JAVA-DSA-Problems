package Trees.BST;

import Trees.BinaryTree.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ConstructBSTFromSortedArray {
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

    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
        BinaryTreeNode<Integer> newRoot = SortedArrayToBST(arr, 0, n-1);
        return newRoot;
    }
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int si, int ei){
        if(si > ei){
            return null;
        }
        int mid = (si + ei)/2;
        BinaryTreeNode<Integer> node = new BinaryTreeNode<>(arr[mid]);
        node.left = SortedArrayToBST(arr, si, mid-1);
        node.right = SortedArrayToBST(arr,mid+1, ei);
        return node;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        BinaryTreeNode<Integer> root = SortedArrayToBST(arr, 7);
        printBinaryTreeLevelWise(root);
    }
}
