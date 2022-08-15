package Trees.BinaryTree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PairSumBinaryTree {
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
    static void pairSum(BinaryTreeNode<Integer> root, int sum) {
        if(root==null)
            return;
        int[] arr=arrayInsertion(root);
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==sum){
                System.out.println(arr[i]+" "+arr[j]);
                i++;
                j--;
            }else if(arr[i]+arr[j]<sum)
                i++;
            else
                j--;
        }
    }
    private static int[] arrayInsertion(BinaryTreeNode<Integer> root){
        if(root==null){
            int[] arr=new int[0];
            return arr;
        }
        int firstData=root.data;
        int[] jrr= arrayInsertion(root.left);
        int[] krr= arrayInsertion(root.right);
        int[] finalArray=new int[1+jrr.length+krr.length];
        int k=0;
        finalArray[k]=firstData;
        k++;
        for(int i=0;i<jrr.length;i++){  finalArray[k]=jrr[i];
            k++;
        }
        for(int i=0;i<krr.length;i++){
            finalArray[k]=krr[i];
            k++;
        }
        return finalArray;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        pairSum(root, 15);
    }
}
