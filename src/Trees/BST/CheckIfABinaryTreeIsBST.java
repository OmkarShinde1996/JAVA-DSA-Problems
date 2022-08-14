package Trees.BST;

import Trees.BinaryTree.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CheckIfABinaryTreeIsBST {
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

    //With less time complexity O(n)---> Might give StackOverFlow error in some test cases
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

    //With more time complexity O(n^2)
    public static boolean isBST1(BinaryTreeNode<Integer> root) {
        if(root==null)
            return true;
        int max=maximum(root.left);
        int min=minimum(root.right);
        if(root.data<=max || root.data>min)
            return false;
        boolean ans1=isBST(root.left);
        boolean ans2=isBST(root.right);
        return(ans1&& ans2);
    }

    public static int maximum(BinaryTreeNode<Integer> root){
        if(root==null)
            return Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(maximum(root.left),maximum(root.right)));
    }
    public static int minimum(BinaryTreeNode<Integer> root){
        if(root==null)
            return Integer.MAX_VALUE;
        return Math.min(root.data,Math.min(minimum(root.left),minimum(root.right)));
    }

    //With less time complexity O(n) ---> Not working as expected
//    public static boolean isBST3(BinaryTreeNode<Integer> root, int min , int max){
//        if(root == null){
//            return true;
//        }
//        if(root.data < min || root.data > max){
//            return false;
//        }
//        boolean isLeftOk = isBST3(root.left, min, root.data-1);
//        boolean isRightOk = isBST3(root.right, root.data, min);
//        return isLeftOk && isRightOk;
//    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        System.out.println(isBST(root));
        System.out.println(isBST1(root));
        //System.out.println(isBST3(root, root.data-1, root.data+1));
    }
}
